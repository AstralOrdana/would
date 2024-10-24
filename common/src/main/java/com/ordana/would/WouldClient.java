package com.ordana.would;

import com.ordana.would.reg.ModBlocks;
import net.mehvahdjukaar.moonlight.api.misc.EventCalled;
import net.mehvahdjukaar.moonlight.api.platform.ClientHelper;
import net.mehvahdjukaar.moonlight.api.set.leaves.LeavesType;
import net.mehvahdjukaar.moonlight.api.util.math.colors.RGBColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class WouldClient {

    public static void init() {
        ClientHelper.addClientSetup(WouldClient::setup);
        ClientHelper.addBlockColorsRegistration(WouldClient::registerBlockColors);
        ClientHelper.addItemColorsRegistration(WouldClient::registerItemColors);
    }

    private static boolean finishedSetup = false;

    public static void setup() {
        ClientHelper.registerRenderType(ModBlocks.WILLOW_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.BAOBAB_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.EBONY_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.FIR_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.PINE_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.CEDAR_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.MAHOGANY_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.AZALEA_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.PALM_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.MAPLE_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.ASPEN_LEAVES.get(), RenderType.cutoutMipped());
        ClientHelper.registerRenderType(ModBlocks.WALNUT_LEAVES.get(), RenderType.cutoutMipped());

        ClientHelper.registerRenderType(ModBlocks.WILLOW_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.BAOBAB_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.EBONY_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.FIR_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.PINE_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.CEDAR_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.MAHOGANY_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.AZALEA_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.PALM_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.MAPLE_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.ASPEN_DOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.WALNUT_DOOR.get(), RenderType.cutout());

        ClientHelper.registerRenderType(ModBlocks.WILLOW_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.BAOBAB_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.EBONY_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.FIR_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.PINE_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.CEDAR_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.MAHOGANY_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.AZALEA_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.PALM_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.MAPLE_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.ASPEN_TRAPDOOR.get(), RenderType.cutout());
        ClientHelper.registerRenderType(ModBlocks.WALNUT_TRAPDOOR.get(), RenderType.cutout());

        finishedSetup = true;
    }

    public static void checkIfFailed() {
        if(!finishedSetup){
            throw new RuntimeException("Failed to run client setup. This is likely due to the mod integration code being outdated, crashing with other mods new versions. Terminating");
        }
    }

    @EventCalled
    private static void registerBlockColors(ClientHelper.BlockColorEvent event) {
        event.register((blockState, level, blockPos, i) -> event.getColor(Blocks.OAK_LEAVES.defaultBlockState(), level, blockPos, i),
                ModBlocks.WILLOW_LEAVES.get(),
                ModBlocks.BAOBAB_LEAVES.get(),
                ModBlocks.EBONY_LEAVES.get(),
                ModBlocks.MAHOGANY_LEAVES.get(),
                ModBlocks.AZALEA_LEAVES.get(),
                ModBlocks.PALM_LEAVES.get(),
                ModBlocks.MAPLE_LEAVES.get(),
                ModBlocks.WALNUT_LEAVES.get());

        event.register((blockState, level, blockPos, i) -> event.getColor(Blocks.BIRCH_LEAVES.defaultBlockState(), level, blockPos, i),
                ModBlocks.CEDAR_LEAVES.get());

        event.register((blockState, level, blockPos, i) -> event.getColor(Blocks.SPRUCE_LEAVES.defaultBlockState(), level, blockPos, i),
                ModBlocks.PINE_LEAVES.get(),
                ModBlocks.FIR_LEAVES.get());
    }


    private static void registerItemColors(ClientHelper.ItemColorEvent event) {
        event.register((itemStack, i) -> event.getColor(Items.OAK_LEAVES.getDefaultInstance(), i),
                ModBlocks.WILLOW_LEAVES.get(),
                ModBlocks.BAOBAB_LEAVES.get(),
                ModBlocks.EBONY_LEAVES.get(),
                ModBlocks.MAHOGANY_LEAVES.get(),
                ModBlocks.AZALEA_LEAVES.get(),
                ModBlocks.PALM_LEAVES.get(),
                ModBlocks.MAPLE_LEAVES.get(),
                ModBlocks.WALNUT_LEAVES.get());

        event.register((itemStack, i) -> event.getColor(Items.BIRCH_LEAVES.getDefaultInstance(), i),
                ModBlocks.CEDAR_LEAVES.get());

        event.register((itemStack, i) -> event.getColor(Items.SPRUCE_LEAVES.getDefaultInstance(), i),
                ModBlocks.PINE_LEAVES.get(),
                ModBlocks.FIR_LEAVES.get());
    }

    private static int getLeafTypeColor(ClientHelper.BlockColorEvent event, LeavesType type, BlockState state, BlockAndTintGetter level, BlockPos pos, int i) {
        int original = event.getColor(type.leaves.defaultBlockState(), level, pos, i);

        //interpolate between color and brown
        float percentage = /*state.getValue(LeafPileBlock.AGE) /*/ 10f;
        int brown = 0x7D5212;
        return new RGBColor(original).asLAB().mixWith(new RGBColor(brown).asLAB(), percentage).asRGB().toInt();
    }
}