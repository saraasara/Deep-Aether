package teamrazor.deepaether.recipe.poison;


import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public abstract class AbstractPoisonRecipe implements Recipe<Container> {
    protected final RecipeType<?> type;
    protected final ResourceLocation id;
    protected final String group;
    protected final Ingredient ingredient;
    protected final ItemStack result;
    public AbstractPoisonRecipe(RecipeType<?> p_250197_, ResourceLocation p_249379_, String p_249518_, Ingredient p_251354_, ItemStack p_252185_) {
        this.type = p_250197_;
        this.id = p_249379_;
        this.group = p_249518_;
        this.ingredient = p_251354_;
        this.result = p_252185_;
    }

    public boolean matches(Container p_43748_, Level p_43749_) {
        return this.ingredient.test(p_43748_.getItem(0));
    }

    public ItemStack assemble(Container p_43746_, RegistryAccess p_267063_) {
        return this.result.copy();
    }

    public boolean canCraftInDimensions(int p_43743_, int p_43744_) {
        return true;
    }

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredient);
        return nonnulllist;
    }

    public ItemStack getResult() {
        return this.result;
    }

    public ItemStack getResultItem(RegistryAccess p_266851_) {
        return this.result;
    }

    public String getGroup() {
        return this.group;
    }

    public ResourceLocation getId() {
        return this.id;
    }

    public RecipeType<?> getType() {
        return this.type;
    }
}