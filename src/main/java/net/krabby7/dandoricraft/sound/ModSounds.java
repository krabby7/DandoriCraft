package net.krabby7.dandoricraft.sound;


import net.krabby7.dandoricraft.DandoriCraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, DandoriCraft.MOD_ID);

    public static final Supplier<SoundEvent> PIKMIN_CRY = registerSoundEvent("pikmin_cry");
    public static final Supplier<SoundEvent> PIKMIN_DEATH = registerSoundEvent("pikmin_death");
    public static final Supplier<SoundEvent> PIKMIN_HMM = registerSoundEvent("pikmin_hmm");
    public static final Supplier<SoundEvent> PIKMIN_WAA = registerSoundEvent("pikmin_waa");
    public static final Supplier<SoundEvent> PIKMIN_MOO = registerSoundEvent("pikmin_moo");
    public static final Supplier<SoundEvent> PIKMIN_PIKMIN = registerSoundEvent("pikmin_pikmin");
    public static final Supplier<SoundEvent> BULBORB_DEATH = registerSoundEvent("bulborb_death");



//    private static ResourceKey<JukeboxSong> createSong(String name) {
//        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, name));
//    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}