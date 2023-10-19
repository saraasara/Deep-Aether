package teamrazor.deepaether.datagen.loot.modifiers;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import teamrazor.deepaether.DeepAetherMod;
import teamrazor.deepaether.init.DAItems;

import java.util.List;

public class DALootDataProvider extends GlobalLootModifierProvider {

    public DALootDataProvider(PackOutput output)
    {
        super(output, DeepAetherMod.MODID);
    }

    @Override
    protected void start() {
        add("silver_loot_modifiers", new DAAddDungeonLootModifierNoReplacements(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/silver_dungeon_loot")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(DAItems.SKYJADE.get(), 1), 80),
                        WeightedEntry.wrap(new ItemStack(DAItems.SKYJADE.get(), 2), 20)

                        ),
                100,
                0.5f
        ));

        add("silver_loot_reward_modifiers", new DAAddDungeonLootModifierNoReplacements(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/silver_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(DAItems.SKYJADE.get(), 2), 80),
                        WeightedEntry.wrap(new ItemStack(DAItems.STRATUS_INGOT.get(), 1), 20)
                ),
                100,
                0.4f
        ));

        add("gold_loot_modifiers", new DAAddDungeonLootModifierNoReplacements(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/gold_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(DAItems.SKYJADE.get(), 2), 30),
                        WeightedEntry.wrap(new ItemStack(DAItems.SKYJADE.get(), 5), 20),
                        WeightedEntry.wrap(new ItemStack(DAItems.STRATUS_INGOT.get(), 1), 60),
                        WeightedEntry.wrap(new ItemStack(DAItems.STRATUS_INGOT.get(), 1), 10)


                ),
                120,
                0.5f
        ));

        add("gold_loot_stratus_upgrade", new DAAddFlatDungeonLootModifier(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/gold_dungeon_reward")).build() },
                    new ItemStack(DAItems.STRATUS_SMITHING_TEMPLATE.get(), 1),
                0.0f
        ));

        add("gold_loot_modifiers", new DAAddDungeonLootModifierNoReplacements(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/gold_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(DAItems.SKYJADE.get(), 2), 30),
                        WeightedEntry.wrap(new ItemStack(DAItems.SKYJADE.get(), 5), 10),
                        WeightedEntry.wrap(new ItemStack(DAItems.STRATUS_INGOT.get(), 1), 60)

                ),
                30,
                0.5f
        ));
    }
}