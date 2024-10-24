package com.ordana.would.reg;

import com.ordana.would.Would;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ModCreativeTab {

    public static final RegSupplier<CreativeModeTab> MOD_TAB =
            RegHelper.registerCreativeModeTab(Would.res("would"),
                    (c) -> c.title(Component.translatable("itemGroup.would.would"))
                            .icon(() -> ModBlocks.EBONY_LOG.get().asItem().getDefaultInstance()));

    public static void init() {
        RegHelper.addItemsToTabsRegistration(ModCreativeTab::registerItemsToTabs);
    }


    public static void registerItemsToTabs(RegHelper.ItemToTabEvent e) {
        after(e, Items.OAK_LOG,
                ModBlocks.WILLOW_LOG, ModBlocks.WILLOW_WOOD, ModBlocks.STRIPPED_WILLOW_LOG, ModBlocks.STRIPPED_WILLOW_WOOD, ModBlocks.WILLOW_PLANKS, ModBlocks.WILLOW_STAIRS, ModBlocks.WILLOW_SLAB, ModBlocks.WILLOW_FENCE, ModBlocks.WILLOW_FENCE_GATE, ModBlocks.WILLOW_DOOR, ModBlocks.WILLOW_TRAPDOOR, ModBlocks.WILLOW_PRESSURE_PLATE, ModBlocks.WILLOW_BUTTON, ModBlocks.WILLOW_LEAVES,
                ModBlocks.BAOBAB_LOG, ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_WOOD, ModBlocks.BAOBAB_PLANKS, ModBlocks.BAOBAB_STAIRS, ModBlocks.BAOBAB_SLAB, ModBlocks.BAOBAB_FENCE, ModBlocks.BAOBAB_FENCE_GATE, ModBlocks.BAOBAB_DOOR, ModBlocks.BAOBAB_TRAPDOOR, ModBlocks.BAOBAB_PRESSURE_PLATE, ModBlocks.BAOBAB_BUTTON, ModBlocks.BAOBAB_LEAVES,
                ModBlocks.EBONY_LOG, ModBlocks.EBONY_WOOD, ModBlocks.STRIPPED_EBONY_LOG, ModBlocks.STRIPPED_EBONY_WOOD, ModBlocks.EBONY_HEARTWOOD_LOG, ModBlocks.EBONY_HEARTWOOD, ModBlocks.EBONY_PLANKS, ModBlocks.EBONY_STAIRS, ModBlocks.EBONY_SLAB, ModBlocks.EBONY_FENCE, ModBlocks.EBONY_FENCE_GATE, ModBlocks.EBONY_DOOR, ModBlocks.EBONY_TRAPDOOR, ModBlocks.EBONY_PRESSURE_PLATE, ModBlocks.EBONY_BUTTON, ModBlocks.EBONY_LEAVES,
                ModBlocks.FIR_LOG, ModBlocks.FIR_WOOD, ModBlocks.STRIPPED_FIR_LOG, ModBlocks.STRIPPED_FIR_WOOD, ModBlocks.FIR_PLANKS, ModBlocks.FIR_STAIRS, ModBlocks.FIR_SLAB, ModBlocks.FIR_FENCE, ModBlocks.FIR_FENCE_GATE, ModBlocks.FIR_DOOR, ModBlocks.FIR_TRAPDOOR, ModBlocks.FIR_PRESSURE_PLATE, ModBlocks.FIR_BUTTON, ModBlocks.FIR_LEAVES,
                ModBlocks.PINE_LOG, ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_LOG, ModBlocks.STRIPPED_PINE_WOOD, ModBlocks.PINE_PLANKS, ModBlocks.PINE_STAIRS, ModBlocks.PINE_SLAB, ModBlocks.PINE_FENCE, ModBlocks.PINE_FENCE_GATE, ModBlocks.PINE_DOOR, ModBlocks.PINE_TRAPDOOR, ModBlocks.PINE_PRESSURE_PLATE, ModBlocks.PINE_BUTTON, ModBlocks.PINE_LEAVES,
                ModBlocks.CEDAR_LOG, ModBlocks.CEDAR_WOOD, ModBlocks.STRIPPED_CEDAR_LOG, ModBlocks.STRIPPED_CEDAR_WOOD, ModBlocks.CEDAR_PLANKS, ModBlocks.CEDAR_STAIRS, ModBlocks.CEDAR_SLAB, ModBlocks.CEDAR_FENCE, ModBlocks.CEDAR_FENCE_GATE, ModBlocks.CEDAR_DOOR, ModBlocks.CEDAR_TRAPDOOR, ModBlocks.CEDAR_PRESSURE_PLATE, ModBlocks.CEDAR_BUTTON, ModBlocks.CEDAR_LEAVES,
                ModBlocks.MAHOGANY_LOG, ModBlocks.MAHOGANY_WOOD, ModBlocks.STRIPPED_MAHOGANY_LOG, ModBlocks.STRIPPED_MAHOGANY_WOOD, ModBlocks.MAHOGANY_PLANKS, ModBlocks.MAHOGANY_STAIRS, ModBlocks.MAHOGANY_SLAB, ModBlocks.MAHOGANY_FENCE, ModBlocks.MAHOGANY_FENCE_GATE, ModBlocks.MAHOGANY_DOOR, ModBlocks.MAHOGANY_TRAPDOOR, ModBlocks.MAHOGANY_PRESSURE_PLATE, ModBlocks.MAHOGANY_BUTTON, ModBlocks.MAHOGANY_LEAVES,
                ModBlocks.AZALEA_LOG, ModBlocks.AZALEA_WOOD, ModBlocks.STRIPPED_AZALEA_LOG, ModBlocks.STRIPPED_AZALEA_WOOD, ModBlocks.AZALEA_PLANKS, ModBlocks.AZALEA_STAIRS, ModBlocks.AZALEA_SLAB, ModBlocks.AZALEA_FENCE, ModBlocks.AZALEA_FENCE_GATE, ModBlocks.AZALEA_DOOR, ModBlocks.AZALEA_TRAPDOOR, ModBlocks.AZALEA_PRESSURE_PLATE, ModBlocks.AZALEA_BUTTON, () -> Blocks.AZALEA_LEAVES,
                ModBlocks.PALM_LOG, ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_LOG, ModBlocks.STRIPPED_PALM_WOOD, ModBlocks.PALM_PLANKS, ModBlocks.PALM_STAIRS, ModBlocks.PALM_SLAB, ModBlocks.PALM_FENCE, ModBlocks.PALM_FENCE_GATE, ModBlocks.PALM_DOOR, ModBlocks.PALM_TRAPDOOR, ModBlocks.PALM_PRESSURE_PLATE, ModBlocks.PALM_BUTTON, ModBlocks.PALM_LEAVES,
                ModBlocks.MAPLE_LOG, ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_WOOD, ModBlocks.MAPLE_PLANKS, ModBlocks.MAPLE_STAIRS, ModBlocks.MAPLE_SLAB, ModBlocks.MAPLE_FENCE, ModBlocks.MAPLE_FENCE_GATE, ModBlocks.MAPLE_DOOR, ModBlocks.MAPLE_TRAPDOOR, ModBlocks.MAPLE_PRESSURE_PLATE, ModBlocks.MAPLE_BUTTON, ModBlocks.MAPLE_LEAVES,
                ModBlocks.ASPEN_LOG, ModBlocks.ASPEN_WOOD, ModBlocks.ASPEN_LOG_GAZING, ModBlocks.ASPEN_WOOD_GAZING, ModBlocks.STRIPPED_ASPEN_LOG, ModBlocks.STRIPPED_ASPEN_WOOD, ModBlocks.STRIPPED_ASPEN_LOG_GAZING, ModBlocks.STRIPPED_ASPEN_WOOD_GAZING, ModBlocks.ASPEN_PLANKS, ModBlocks.ASPEN_STAIRS, ModBlocks.ASPEN_SLAB, ModBlocks.ASPEN_FENCE, ModBlocks.ASPEN_FENCE_GATE, ModBlocks.ASPEN_DOOR, ModBlocks.ASPEN_TRAPDOOR, ModBlocks.ASPEN_PRESSURE_PLATE, ModBlocks.ASPEN_BUTTON, ModBlocks.ASPEN_LEAVES,
                ModBlocks.WALNUT_LOG, ModBlocks.WALNUT_WOOD, ModBlocks.STRIPPED_WALNUT_LOG, ModBlocks.STRIPPED_WALNUT_WOOD, ModBlocks.WALNUT_PLANKS, ModBlocks.WALNUT_STAIRS, ModBlocks.WALNUT_SLAB, ModBlocks.WALNUT_FENCE, ModBlocks.WALNUT_FENCE_GATE, ModBlocks.WALNUT_DOOR, ModBlocks.WALNUT_TRAPDOOR, ModBlocks.WALNUT_PRESSURE_PLATE, ModBlocks.WALNUT_BUTTON, ModBlocks.WALNUT_LEAVES);
    }

    private static void after(RegHelper.ItemToTabEvent event, Item target, Supplier<?>... items) {

        ItemLike[] entries = Arrays.stream(items).map((s -> (ItemLike) (s.get()))).toArray(ItemLike[]::new);
        var tab = MOD_TAB.getHolder().unwrapKey().get();
        event.addAfter(tab, i -> i.is(target), entries);
    }

    private static void before(RegHelper.ItemToTabEvent event, Item target, Supplier<?>... items) {

        ItemLike[] entries = Arrays.stream(items).map(s -> (ItemLike) s.get()).toArray(ItemLike[]::new);
        var tab = MOD_TAB.getHolder().unwrapKey().get();
        event.addBefore(tab, i -> i.is(target), entries);
    }
}
