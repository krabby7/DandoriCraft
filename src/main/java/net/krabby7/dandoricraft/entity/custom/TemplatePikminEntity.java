package net.krabby7.dandoricraft.entity.custom;

import com.mojang.logging.LogUtils;
import net.krabby7.dandoricraft.sound.ModSounds;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.util.LandRandomPos;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.animation.AnimationState;

import java.util.Random;


public class TemplatePikminEntity extends TamableAnimal implements GeoEntity {
    private static final Logger LOGGER = LogUtils.getLogger();

    boolean isSitting = false;
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public TemplatePikminEntity(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public boolean isFood(ItemStack itemStack) {
        return false;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 15D)
                .add(Attributes.ATTACK_DAMAGE, 1.0f)
                .add(Attributes.ATTACK_SPEED, 0.5f)
                .add(Attributes.MOVEMENT_SPEED, 0.27)
                .add(Attributes.FOLLOW_RANGE, 24D);
    }


    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1.0, 6.0F, 1.0F));
        this.goalSelector.addGoal(8, new PikminWaterAvoidingRandomStrollGoal(this, 0.75));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
        controllerRegistrar.add(new AnimationController<>(this, "attack_controller", 0, this::attackPredicate));

    }

    private <T extends GeoAnimatable> PlayState attackPredicate(AnimationState<T> tAnimationState) {
        if(this.swinging) {
            //tAnimationState.getController().markNeedsReload();

            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.pikmin.attack", Animation.LoopType.PLAY_ONCE));
            //this.swinging = false;
        }

        return PlayState.CONTINUE;
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if(tAnimationState.isMoving() && !this.isSitting) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.pikmin.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        else if (this.isSitting) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.pikmin.sit", Animation.LoopType.HOLD_ON_LAST_FRAME));
            return PlayState.CONTINUE;
        }

        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.pikmin.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    //RIGHT CLICK & TAMING

    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        if (true) {
            LOGGER.info("Interaction Success! (:");
            if (this.isTame()) {
                if (!this.isSitting) {
                    this.isSitting = true;
                    this.setOrderedToSit(true);
                    LOGGER.info("Sitting set to true!");
                    return InteractionResult.SUCCESS;
                } else if (this.isSitting) {
                    this.isSitting = false;
                    this.setOrderedToSit(false);
                    LOGGER.info("Sitting set to false!");
                    return InteractionResult.SUCCESS;
                }
            } else if (!isTame()) {
                this.tryToTame(player);
                return InteractionResult.SUCCESS;
            }
        }
        LOGGER.info("Interaction Fail! ):");
        return InteractionResult.FAIL;
    }

    private void tryToTame(Player player) {
            super.tame(player);
            this.navigation.stop();
            this.setTarget((LivingEntity)null);
            this.level().broadcastEntityEvent(this, (byte)7);
            LOGGER.info("Tamed!");
    }

    //MISC

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob ageableMob) {
        return null;
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void tick() {
        this.registerGoals();
        super.tick();
    }

    //SOUNDS

    @Override
    protected @Nullable SoundEvent getDeathSound() {
        return ModSounds.PIKMIN_DEATH.get();
    }

    @Override
    protected @Nullable SoundEvent getHurtSound(DamageSource damageSource) {
        return ModSounds.PIKMIN_CRY.get();
    }

    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        Random rand = new Random();
        int n = rand.nextInt(5) + 1;
        int pikminSayingPikminRand = rand.nextInt(25) + 1;

        if(pikminSayingPikminRand == 25){
            return ModSounds.PIKMIN_PIKMIN.get();
        }
        else {
            if (n == 1) {
                return ModSounds.PIKMIN_WAA.get();
            } else if (n == 2) {
                return ModSounds.PIKMIN_HMM.get();
            } else if (n == 3) {
                return ModSounds.PIKMIN_MOO.get();
            } else {
               return super.getAmbientSound();
            }
        }
    }

    //CUSTOM GOALS

   class PikminWaterAvoidingRandomStrollGoal extends RandomStrollGoal {
        public static final float PROBABILITY = 0.001F;
        protected final float probability;

        public PikminWaterAvoidingRandomStrollGoal(PathfinderMob mob, double speedModifier) {
            this(mob, speedModifier, 0.001F);
        }

        public PikminWaterAvoidingRandomStrollGoal(PathfinderMob mob, double speedModifier, float probability) {
            super(mob, speedModifier);
            this.probability = probability;
        }

        @javax.annotation.Nullable
        protected Vec3 getPosition() {
            if(!isTame() && !isSitting) {
                if (this.mob.isInWaterOrBubble()) {
                    Vec3 vec3 = LandRandomPos.getPos(this.mob, 15, 7);
                    return vec3 == null ? super.getPosition() : vec3;
                } else {
                    return this.mob.getRandom().nextFloat() >= this.probability ? LandRandomPos.getPos(this.mob, 10, 7) : super.getPosition();
                }
            }
            return null;
        }
    }
}