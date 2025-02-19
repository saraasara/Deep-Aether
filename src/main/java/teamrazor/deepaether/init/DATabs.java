

package teamrazor.deepaether.init;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.aether.item.AetherItems;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import teamrazor.deepaether.DeepAetherMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT, modid = DeepAetherMod.MODID)
public class DATabs {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab == AetherCreativeTabs.AETHER_BUILDING_BLOCKS.getKey()) {
            addToTab(AetherBlocks.GOLDEN_OAK_WOOD.get().asItem(), new Block[]{
                    DABlocks.ROSEROOT_LOG.get(),
                    DABlocks.ROTTEN_ROSEROOT_LOG.get(),
                    DABlocks.ROSEROOT_WOOD.get(),
                    DABlocks.STRIPPED_ROSEROOT_LOG.get(),
                    DABlocks.STRIPPED_ROSEROOT_WOOD.get(),
                    DABlocks.ROSEROOT_PLANKS.get(),
                    DABlocks.ROSEROOT_STAIRS.get(),
                    DABlocks.ROSEROOT_SLAB.get(),
                    DABlocks.ROSEROOT_FENCE.get(),
                    DABlocks.ROSEROOT_FENCE_GATE.get(),
                    DABlocks.ROSEROOT_DOOR.get(),
                    DABlocks.ROSEROOT_TRAPDOOR.get(),
                    DABlocks.ROSEROOT_PRESSURE_PLATE.get(),
                    DABlocks.ROSEROOT_BUTTON.get(),
                    DABlocks.ROSEROOT_WALL.get(),
                    DABlocks.STRIPPED_ROSEROOT_WALL.get(),

                    DABlocks.YAGROOT_LOG.get(),
                    DABlocks.YAGROOT_WOOD.get(),
                    DABlocks.STRIPPED_YAGROOT_LOG.get(),
                    DABlocks.STRIPPED_YAGROOT_WOOD.get(),
                    DABlocks.YAGROOT_PLANKS.get(),
                    DABlocks.YAGROOT_STAIRS.get(),
                    DABlocks.YAGROOT_SLAB.get(),
                    DABlocks.YAGROOT_FENCE.get(),
                    DABlocks.YAGROOT_FENCE_GATE.get(),
                    DABlocks.YAGROOT_DOOR.get(),
                    DABlocks.YAGROOT_TRAPDOOR.get(),
                    DABlocks.YAGROOT_PRESSURE_PLATE.get(),
                    DABlocks.YAGROOT_BUTTON.get(),
                    DABlocks.YAGROOT_WALL.get(),
                    DABlocks.STRIPPED_YAGROOT_WALL.get(),

                    DABlocks.CRUDEROOT_LOG.get(),
                    DABlocks.CRUDEROOT_WOOD.get(),
                    DABlocks.STRIPPED_CRUDEROOT_LOG.get(),
                    DABlocks.STRIPPED_CRUDEROOT_WOOD.get(),
                    DABlocks.CRUDEROOT_PLANKS.get(),
                    DABlocks.CRUDEROOT_STAIRS.get(),
                    DABlocks.CRUDEROOT_SLAB.get(),
                    DABlocks.CRUDEROOT_FENCE.get(),
                    DABlocks.CRUDEROOT_FENCE_GATE.get(),
                    DABlocks.CRUDEROOT_DOOR.get(),
                    DABlocks.CRUDEROOT_TRAPDOOR.get(),
                    DABlocks.CRUDEROOT_PRESSURE_PLATE.get(),
                    DABlocks.CRUDEROOT_WALL.get(),
                    DABlocks.STRIPPED_CRUDEROOT_WALL.get(),
                    DABlocks.CRUDEROOT_BUTTON.get(),

                    DABlocks.CONBERRY_LOG.get(),
                    DABlocks.CONBERRY_WOOD.get(),
                    DABlocks.STRIPPED_CONBERRY_LOG.get(),
                    DABlocks.STRIPPED_CONBERRY_WOOD.get(),
                    DABlocks.CONBERRY_PLANKS.get(),
                    DABlocks.CONBERRY_STAIRS.get(),
                    DABlocks.CONBERRY_SLAB.get(),
                    DABlocks.CONBERRY_FENCE.get(),
                    DABlocks.CONBERRY_FENCE_GATE.get(),
                    DABlocks.CONBERRY_DOOR.get(),
                    DABlocks.CONBERRY_TRAPDOOR.get(),
                    DABlocks.CONBERRY_PRESSURE_PLATE.get(),
                    DABlocks.CONBERRY_WALL.get(),
                    DABlocks.STRIPPED_CONBERRY_WALL.get(),
                    DABlocks.CONBERRY_BUTTON.get(),

                    DABlocks.SUNROOT_LOG.get(),
                    DABlocks.SUNROOT_WOOD.get(),
                    DABlocks.STRIPPED_SUNROOT_LOG.get(),
                    DABlocks.STRIPPED_SUNROOT_WOOD.get(),
                    DABlocks.SUNROOT_PLANKS.get(),
                    DABlocks.SUNROOT_STAIRS.get(),
                    DABlocks.SUNROOT_SLAB.get(),
                    DABlocks.SUNROOT_FENCE.get(),
                    DABlocks.SUNROOT_FENCE_GATE.get(),
                    DABlocks.SUNROOT_DOOR.get(),
                    DABlocks.SUNROOT_TRAPDOOR.get(),
                    DABlocks.SUNROOT_PRESSURE_PLATE.get(),
                    DABlocks.SUNROOT_WALL.get(),
                    DABlocks.STRIPPED_SUNROOT_WALL.get(),
                    DABlocks.SUNROOT_BUTTON.get(),
            }, event);

            addToTab(AetherBlocks.HOLYSTONE_BRICK_WALL.get().asItem(), new Block[]{
                    DABlocks.HOLYSTONE_TILES.get(),
                    DABlocks.HOLYSTONE_TILE_STAIRS.get(),
                    DABlocks.HOLYSTONE_TILE_SLAB.get(),
                    DABlocks.HOLYSTONE_TILE_WALL.get(),

                    DABlocks.BIG_HOLYSTONE_BRICKS.get(),
                    DABlocks.BIG_HOLYSTONE_BRICKS_STAIRS.get(),
                    DABlocks.BIG_HOLYSTONE_BRICKS_SLAB.get(),
                    DABlocks.BIG_HOLYSTONE_BRICKS_WALL.get(),
                    DABlocks.HOLYSTONE_PILLAR.get(),
                    DABlocks.HOLYSTONE_PILLAR_UP.get(),
                    DABlocks.HOLYSTONE_PILLAR_DOWN.get(),
                    DABlocks.CHISELED_HOLYSTONE.get(),

                    DABlocks.COBBLED_ASETERITE.get(),
                    DABlocks.COBBLED_ASETERITE_STAIRS.get(),
                    DABlocks.COBBLED_ASETERITE_SLAB.get(),
                    DABlocks.COBBLED_ASETERITE_WALL.get(),

                    DABlocks.ASETERITE.get(),
                    DABlocks.ASETERITE_STAIRS.get(),
                    DABlocks.ASETERITE_SLAB.get(),
                    DABlocks.ASETERITE_WALL.get(),

                    DABlocks.POLISHED_ASETERITE.get(),
                    DABlocks.POLISHED_ASETERITE_STAIRS.get(),
                    DABlocks.POLISHED_ASETERITE_SLAB.get(),

                    DABlocks.ASETERITE_BRICKS.get(),
                    DABlocks.ASETERITE_BRICKS_STAIRS.get(),
                    DABlocks.ASETERITE_BRICKS_SLAB.get(),
                    DABlocks.ASETERITE_BRICKS_WALL.get(),

                    DABlocks.RAW_CLORITE.get(),
                    DABlocks.RAW_CLORITE_STAIRS.get(),
                    DABlocks.RAW_CLORITE_SLAB.get(),
                    DABlocks.RAW_CLORITE_WALL.get(),
                    DABlocks.CLORITE.get(),
                    DABlocks.CLORITE_STAIRS.get(),
                    DABlocks.CLORITE_SLAB.get(),
                    DABlocks.CLORITE_WALL.get(),
                    DABlocks.POLISHED_CLORITE.get(),
                    DABlocks.POLISHED_CLORITE_STAIRS.get(),
                    DABlocks.POLISHED_CLORITE_SLAB.get(),
                    DABlocks.CLORITE_PILLAR.get(),

            }, event);

            addToTab(AetherBlocks.MOSSY_HOLYSTONE_WALL.get().asItem(), new Block[]{
                    DABlocks.MOSSY_HOLYSTONE_BRICKS.get(),
                    DABlocks.MOSSY_HOLYSTONE_BRICK_STAIRS.get(),
                    DABlocks.MOSSY_HOLYSTONE_BRICK_SLAB.get(),
                    DABlocks.MOSSY_HOLYSTONE_BRICK_WALL.get(),
                    DABlocks.MOSSY_HOLYSTONE_TILES.get(),
                    DABlocks.MOSSY_HOLYSTONE_TILE_STAIRS.get(),
                    DABlocks.MOSSY_HOLYSTONE_TILE_SLAB.get(),
                    DABlocks.MOSSY_HOLYSTONE_TILE_WALL.get()
            }, event);

            if (ModList.get().isLoaded(DeepAetherMod.AETHER_REDUX)) {
                addToTab(DABlocks.MOSSY_HOLYSTONE_TILE_WALL.get().asItem(), new Block[]{
                        DABlocks.GILDED_HOLYSTONE_BRICKS.get(),
                        DABlocks.GILDED_HOLYSTONE_BRICK_STAIRS.get(),
                        DABlocks.GILDED_HOLYSTONE_BRICK_SLAB.get(),
                        DABlocks.GILDED_HOLYSTONE_BRICK_WALL.get(),
                        DABlocks.GILDED_HOLYSTONE_TILES.get(),
                        DABlocks.GILDED_HOLYSTONE_TILE_STAIRS.get(),
                        DABlocks.GILDED_HOLYSTONE_TILE_SLAB.get(),
                        DABlocks.GILDED_HOLYSTONE_TILE_WALL.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_BRICKS.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_BRICK_STAIRS.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_BRICK_SLAB.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_BRICK_WALL.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_TILES.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_TILE_STAIRS.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_TILE_SLAB.get(),
                        DABlocks.BLIGHTMOSS_HOLYSTONE_TILE_WALL.get()
                }, event);
            }

            addToTab(AetherBlocks.AETHER_DIRT.get().asItem(), new Block[]{
                    DABlocks.PACKED_AETHER_MUD.get(),
                    DABlocks.AETHER_MUD_BRICKS.get(),
                    DABlocks.AETHER_MUD_BRICKS_STAIRS.get(),
                    DABlocks.AETHER_MUD_BRICKS_SLAB.get(),
                    DABlocks.AETHER_MUD_BRICKS_WALL.get(),
            }, event);

            addToTab(AetherBlocks.ZANITE_BLOCK.get().asItem(), DABlocks.SKYJADE_BLOCK.get().asItem(), event);

            addToTab(AetherBlocks.ENCHANTED_GRAVITITE.get().asItem(), DABlocks.STRATUS_BLOCK.get().asItem(), event);
        }

        if (tab == AetherCreativeTabs.AETHER_NATURAL_BLOCKS.getKey()) {
            addToTab(AetherBlocks.ENCHANTED_AETHER_GRASS_BLOCK.get().asItem(), DABlocks.GOLDEN_GRASS_BLOCK.get().asItem(), event);
            addToTab(AetherBlocks.AETHER_DIRT_PATH.get().asItem(), DABlocks.GOLDEN_DIRT_PATH.get().asItem(), event);
            addToTab(AetherBlocks.AETHER_DIRT.get().asItem(), DABlocks.AETHER_COARSE_DIRT.get().asItem(), event);
            addToTab(AetherBlocks.AETHER_FARMLAND.get().asItem(), new Block[]{
                    DABlocks.AETHER_MOSS_BLOCK.get(),
                    DABlocks.AETHER_MOSS_CARPET.get(),
                    DABlocks.AETHER_MUD.get(),
                    DABlocks.MUDDY_YAGROOT_ROOTS.get(),
                    DABlocks.YAGROOT_ROOTS.get()
            }, event);

            addToTab(AetherBlocks.ICESTONE.get().asItem(), new Block[]{
                    DABlocks.ASETERITE.get(),
                    DABlocks.CLORITE.get(),
            }, event);

            addToTab(AetherBlocks.GRAVITITE_ORE.get().asItem(), DABlocks.SKYJADE_ORE.get().asItem(), event);

            addToTab(AetherBlocks.GOLDEN_OAK_LOG.get().asItem(), new Block[]{
                    DABlocks.ROSEROOT_LOG.get(),
                    DABlocks.ROTTEN_ROSEROOT_LOG.get(),
                    DABlocks.YAGROOT_LOG.get(),
                    DABlocks.CRUDEROOT_LOG.get(),
                    DABlocks.CONBERRY_LOG.get(),
                    DABlocks.SUNROOT_LOG.get()
            }, event);

            addToTab(AetherBlocks.DECORATED_HOLIDAY_LEAVES.get().asItem(), new Block[]{
                    DABlocks.ROSEROOT_LEAVES.get(),
                    DABlocks.FLOWERING_ROSEROOT_LEAVES.get(),
                    DABlocks.AERGLOW_BLOSSOM_BLOCK.get(),
                    DABlocks.BLUE_ROSEROOT_LEAVES.get(),
                    DABlocks.FLOWERING_BLUE_ROSEROOT_LEAVES.get(),
                    DABlocks.YAGROOT_LEAVES.get(),
                    DABlocks.CRUDEROOT_LEAVES.get(),
                    DABlocks.CONBERRY_LEAVES.get(),
                    DABlocks.SUNROOT_LEAVES.get()
            }, event);

            addToTab(AetherBlocks.GOLDEN_OAK_SAPLING.get().asItem(), new Block[]{
                    DABlocks.ROSEROOT_SAPLING.get(),
                    DABlocks.BLUE_ROSEROOT_SAPLING.get(),
                    DABlocks.YAGROOT_SAPLING.get(),
                    DABlocks.YAGROOT_VINE.get(),
                    DABlocks.CRUDEROOT_SAPLING.get(),
                    DABlocks.CONBERRY_SAPLING.get(),
                    DABlocks.SUNROOT_SAPLING.get(),
                    DABlocks.SUNROOT_HANGER.get(),
            }, event);

            addToTab(AetherBlocks.BERRY_BUSH_STEM.get().asItem(), DAItems.SQUASH_SEEDS.get(), event);
            addToTab(AetherBlocks.BERRY_BUSH.get().asItem(), DABlocks.LIGHTCAP_MUSHROOMS.get().asItem(), event);

            addToTab(AetherBlocks.WHITE_FLOWER.get().asItem(), new Block[]{
                    DABlocks.RADIANT_ORCHID.get(),
                    DABlocks.AERLAVENDER.get(),
                    DABlocks.TALL_AERLAVENDER.get(),
                    DABlocks.AETHER_CATTAILS.get(),
                    DABlocks.TALL_AETHER_CATTAILS.get(),
                    DABlocks.GOLDEN_FLOWER.get(),
                    DABlocks.ENCHANTED_BLOSSOM.get(),
                    DABlocks.FEATHER_GRASS.get(),
                    DABlocks.TALL_FEATHER_GRASS.get(),
                    DABlocks.SKY_TULIPS.get(),
                    DABlocks.IASPOVE.get(),
                    DABlocks.GOLDEN_ASPESS.get(),
                    DABlocks.ECHAISY.get(),
                    DABlocks.MINI_GOLDEN_GRASS.get(),
                    DABlocks.SHORT_GOLDEN_GRASS.get(),
                    DABlocks.MEDIUM_GOLDEN_GRASS.get(),
                    DABlocks.TALL_GOLDEN_GRASS.get()
            }, event);

            addToTab(AetherBlocks.GOLDEN_AERCLOUD.get().asItem(), new Block[]{
                    DABlocks.AERSMOG.get(),
                    DABlocks.STERLING_AERCLOUD.get(),
                    DABlocks.CHROMATIC_AERCLOUD.get()
            }, event);
        }
        if (tab == AetherCreativeTabs.AETHER_FUNCTIONAL_BLOCKS.getKey()) {
            addToTab(AetherBlocks.SKYROOT_HANGING_SIGN.get().asItem(), new Block[]{
                    DABlocks.ROSEROOT_SIGN.get(),
                    DABlocks.ROSEROOT_HANGING_SIGN.get(),
                    DABlocks.YAGROOT_SIGN.get(),
                    DABlocks.YAGROOT_HANGING_SIGN.get(),
                    DABlocks.CRUDEROOT_SIGN.get(),
                    DABlocks.CRUDEROOT_HANGING_SIGN.get(),
                    DABlocks.CONBERRY_SIGN.get(),
                    DABlocks.CONBERRY_HANGING_SIGN.get(),
                    DABlocks.SUNROOT_SIGN.get(),
                    DABlocks.SUNROOT_HANGING_SIGN.get(),
            }, event);
        }

        if (tab == AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey()) {
            addToTab(AetherItems.ZANITE_HOE.get(), new Item[]{
                    DAItems.SKYJADE_TOOLS_SWORD.get(),
                    DAItems.SKYJADE_TOOLS_SHOVEL.get(),
                    DAItems.SKYJADE_TOOLS_PICKAXE.get(),
                    DAItems.SKYJADE_TOOLS_AXE.get(),
                    DAItems.SKYJADE_TOOLS_HOE.get(),

            }, event);

            if (ModList.get().isLoaded(DeepAetherMod.LOST_AETHER_CONTENT)) {
                addToTab(DAItems.SKYJADE_TOOLS_HOE.get(), DAItems.SKYJADE_SHIELD.get(), event);
            }

            addToTab(AetherItems.GRAVITITE_HOE.get(), new Item[]{
                    DAItems.STRATUS_SWORD.get(),
                    DAItems.STRATUS_SHOVEL.get(),
                    DAItems.STRATUS_PICKAXE.get(),
                    DAItems.STRATUS_AXE.get(),
                    DAItems.STRATUS_HOE.get()
            }, event);


            if (ModList.get().isLoaded(DeepAetherMod.LOST_AETHER_CONTENT)) {
                addToTab(DAItems.STRATUS_HOE.get(), DAItems.STRATUS_SHIELD.get(), event);
            }

            addToTab(AetherItems.SKYROOT_POWDER_SNOW_BUCKET.get(), DAItems.SKYROOT_VIRULENT_QUICKSAND_BUCKET.get(), event);

            addToTab(AetherItems.SKYROOT_AXOLOTL_BUCKET.get(), DAItems.SKYROOT_AERGLOW_FISH_BUCKET.get(), event);
            addToTab(AetherItems.SKYROOT_POISON_BUCKET.get(), new Item[]{
                    DAItems.VIRULENT_QUICKSAND_BUCKET.get(),
                    DAItems.PLACEABLE_POISON_BUCKET.get(),
                    DAItems.AERGLOW_FISH_BUCKET.get()
            }, event);
            addToTab(AetherItems.BLACK_MOA_EGG.get(), DAItems.QUAIL_EGG.get(), event);
            addToTab(AetherItems.SKYROOT_CHEST_BOAT.get(), new Item[]{
                    DAItems.ROSEROOT_BOAT.get(),
                    DAItems.ROSEROOT_CHEST_BOAT.get(),
                    DAItems.YAGROOT_BOAT.get(),
                    DAItems.YAGROOT_CHEST_BOAT.get(),
                    DAItems.CRUDEROOT_BOAT.get(),
                    DAItems.CRUDEROOT_CHEST_BOAT.get(),
                    DAItems.CONBERRY_BOAT.get(),
                    DAItems.CONBERRY_CHEST_BOAT.get(),
                    DAItems.SUNROOT_BOAT.get(),
                    DAItems.SUNROOT_CHEST_BOAT.get(),
            }, event);

            addToTab(AetherItems.MUSIC_DISC_ASCENDING_DAWN.get(), new Item[]{
                    DAItems.MUSIC_DISC_A_MORNING_WISH.get(),
                    DAItems.MUSIC_DISC_NABOORU.get()
            }, event);
        }
        if (tab == AetherCreativeTabs.AETHER_ARMOR_AND_ACCESSORIES.getKey()) {
            addToTab(AetherItems.ZANITE_GLOVES.get(), new Item[]{
                    DAItems.SKYJADE_HELMET.get(),
                    DAItems.SKYJADE_CHESTPLATE.get(),
                    DAItems.SKYJADE_LEGGINGS.get(),
                    DAItems.SKYJADE_BOOTS.get(),
                    DAItems.SKYJADE_GLOVES.get()
            }, event);

            addToTab(AetherItems.GRAVITITE_GLOVES.get(), new Item[]{
                    DAItems.STRATUS_HELMET.get(),
                    DAItems.STRATUS_CHESTPLATE.get(),
                    DAItems.STRATUS_LEGGINGS.get(),
                    DAItems.STRATUS_BOOTS.get(),
                    DAItems.STRATUS_GLOVES.get()
            }, event);
            addToTab(AetherItems.ZANITE_PENDANT.get(), new Item[]{
                    DAItems.SKYJADE_RING.get(),
                    DAItems.GRAVITITE_RING.get(),
                    DAItems.STRATUS_RING.get()
            }, event);

            addToTab(AetherItems.ICE_PENDANT.get(), DAItems.SPOOKY_RING.get(), event);

            addToTab(AetherItems.SHIELD_OF_REPULSION.get(), new Item[]{
                    DAItems.SLIDER_EYE.get(),
                    DAItems.MEDAL_OF_HONOR.get(),
                    DAItems.SUN_CORE.get(),
                    DAItems.AFTERBURNER.get(),
                    DAItems.MEDAL_OF_HONOR.get(),
                    DAItems.AERWHALE_SADDLE.get()
            }, event);
        }
        if (tab == AetherCreativeTabs.AETHER_FOOD_AND_DRINKS.getKey()) {
            addToTab(AetherItems.CANDY_CANE.get(), new Item[]{
                    DAItems.RAW_QUAIL.get(),
                    DAItems.COOKED_QUAIL.get(),
                    DAItems.RAW_AERGLOW_FISH.get(),
                    DAItems.COOKED_AERGLOW_FISH.get()
            }, event);

            addToTab(AetherItems.WHITE_APPLE.get(), new Item[]{
                    DAItems.GOLDEN_BERRIES.get(),
                    DAItems.BLUE_SQUASH_SLICE.get(),
                    DAItems.GREEN_SQUASH_SLICE.get(),
                    DAItems.PURPLE_SQUASH_SLICE.get()
            }, event);
        }

        if (tab == AetherCreativeTabs.AETHER_INGREDIENTS.getKey()) {
            addToTab(AetherItems.ZANITE_GEMSTONE.get(), DAItems.SKYJADE.get().asItem(), event);

            addToTab(AetherBlocks.ENCHANTED_GRAVITITE.get().asItem(), new Item[]{
                    DAItems.STRATUS_INGOT.get(),
                    DABlocks.CHROMATIC_AERCLOUD.get().asItem(),
            }, event);

            addToTab(AetherItems.GOLDEN_AMBER.get(), new Item[]{
                    DAItems.GOLDEN_GRASS_SEEDS.get(),
                    DAItems.GOLDEN_SWET_BALL.get()
            }, event);
            addToTab(AetherItems.AECHOR_PETAL.get(), DAItems.AERGLOW_BLOSSOM.get(), event);
            addToTab(AetherItems.SWET_BALL.get(), new Item[]{
                    DAItems.QUAIL_EGG.get(),
                    DAItems.STRATUS_SMITHING_TEMPLATE.get()
            }, event);
        }
        if (tab == AetherCreativeTabs.AETHER_SPAWN_EGGS.getKey()) {
            addToTab(AetherItems.AERBUNNY_SPAWN_EGG.get(), new Item[]{
                    DAItems.AETHER_FISH_SPAWN_EGG.get()
            }, event);
            addToTab(AetherItems.MOA_SPAWN_EGG.get(), new Item[]{
                    DAItems.QUAIL_SPAWN_EGG.get()
            }, event);
            addToTab(AetherItems.VALKYRIE_SPAWN_EGG.get(), new Item[]{
                    DAItems.VENOMITE_SPAWN_EGG.get()
            }, event);
        }
    }

    private static void addToTab(Item parent, Item stack, BuildCreativeModeTabContentsEvent event) {
        event.getEntries().putAfter(new ItemStack(parent), new ItemStack(stack), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void addToTab(Item parent, Item[] stack, BuildCreativeModeTabContentsEvent event) {
        event.getEntries().putAfter(new ItemStack(parent), new ItemStack(stack[0]), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        for (int i = 1; i < stack.length; i++) {
            event.getEntries().putAfter(new ItemStack(stack[i-1]), new ItemStack(stack[i]), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    private static void addToTab(Item parent, Block[] stack, BuildCreativeModeTabContentsEvent event) {
        event.getEntries().putAfter(new ItemStack(parent), new ItemStack(stack[0]), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        for (int i = 1; i < stack.length; i++) {
            event.getEntries().putAfter(new ItemStack(stack[i-1]), new ItemStack(stack[i]), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}

