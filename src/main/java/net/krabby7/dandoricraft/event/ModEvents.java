package net.krabby7.dandoricraft.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.block.ModBlocks;
import net.krabby7.dandoricraft.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.server.command.ConfigCommand;

import java.util.List;

@EventBusSubscriber(modid = DandoriCraft.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {
    
    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event) {
        event.getEntity().getPersistentData().putIntArray("dandoricraft.homepos",
                event.getOriginal().getPersistentData().getIntArray("dandoricraft.homepos"));
    }


    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.LEATHERWORKER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(ModItems.BULBORB_HIDE, 8),
                new ItemStack(Items.EMERALD, 1), 12, 30, 0.05f
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 7),
                    new ItemStack((Holder<Item>) ModItems.BULBORB_CHESTPLATE, 1), 12, 10, 0.05f
            ));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack((Holder<Item>) ModItems.BULBORB_LEGGINGS, 1), 12, 1, 0.05f
            ));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 5),
                    new ItemStack((Holder<Item>) ModItems.BULBORB_HELMET, 1), 12, 30, 0.05f
            ));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 4),
                    new ItemStack((Holder<Item>) ModItems.BULBORB_BOOTS, 1), 12, 5, 0.05f
            ));
        }
    }

    @SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();


        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 5),
                new ItemStack(ModBlocks.AMP_OAK_SAPLING.get(), 1), 8, 10, 0.2f
        ));
    }
}