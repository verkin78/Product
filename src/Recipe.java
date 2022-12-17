import java.util.Arrays;
import java.util.Objects;

public class Recipe {
    private Product[] products;
    private String recipePrice;
    private String recipeName;

    private Recipe[] recipes;

    public Recipe(String recipePrice, String recipeName, Product... products) {
        this.products = products;
        this.recipePrice = recipePrice;
        this.recipeName = recipeName;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getRecipePrice() {
        return recipePrice;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        if (recipeName.equals(recipeName)) {
            throw new IllegalArgumentException("HРецепт с таким названием уже существует. Переименуйте рецепт.");
        }
        return Objects.equals(products,
                recipe.products) && Objects.equals(recipePrice,
                recipe.recipePrice) && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, recipePrice, recipeName);
    }

    @Override
    public String toString() {
        return "Рецепт" +
                " название: " + recipeName + '\'' +
                ", состав: " + Arrays.toString(products) +
                ", стоимость " + recipePrice + '\'' +
                " руб." + "\n";
    }
}

