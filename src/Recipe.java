import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private Product[] products;
    private Integer recipePrice;
    private String recipeName;



    public Recipe( String recipeName, Product... products) {
        this.products = products;
        this.recipePrice = Product.recipeCost(products);
        this.recipeName = recipeName;
    }



    public Product[] getProducts() {
        return products;
    }

    public Integer getRecipePrice() {
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
            throw new IllegalArgumentException("Рецепт с таким названием уже существует. Переименуйте рецепт.");
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

    public static void createRecipe() {
        Map<Recipe, Integer> recipes = new HashMap<>();
        recipes.put(new Recipe("Картошка с говядиной",
                new Product("Говядина",
                500,1200),
                new Product("Картошка",
                100,3)),3);


        for (Recipe recipe : recipes.keySet()) {
            recipe.recipePrice = recipe.getRecipePrice() * recipes.get(recipe);

        }
        JOptionPane.showMessageDialog(null, recipes );

    }



}

