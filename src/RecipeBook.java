import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeBook {
    private List<Recipe> recipes;

    public RecipeBook() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(String title, List<String> ingredients, String instuctions, String kategori) {
        Recipe recipe = new Recipe(title, ingredients, instuctions, kategori);
        recipes.add(recipe);
    }

    public void rateRecipe(String title, int rating) {
        for (Recipe recipe : recipes) {
            if (recipe.getTitle().toLowerCase().contains(title.toLowerCase())) {
                recipe.setRating(rating);
            } else {
                System.out.println("Recipe not found");
            }
        }
    }

    public void displayAllRecipes() {
        for (Recipe recipe : recipes) {
            display1Recipe(recipe);
        }
    }
    public void display1Recipe(Recipe recipe) {
            System.out.println("Titel: " + recipe.getTitle());
            System.out.println("Kategori: " + recipe.getKategori());
            System.out.println("Ingredienser: " + recipe.getIngredients());
            System.out.println("Fremgangsmåde: " + recipe.getInstructions());
            System.out.println("Vudering: " + recipe.getRating());
            System.out.println("-------------------------");
        }

    public void searchForCategory(String category) {
        int count =0;
        for (Recipe recipe : recipes) {
            if (recipe.getKategori().contains(category.toLowerCase())){
            display1Recipe(recipe);
            count ++;}
        } if (count ==0) System.out.println("No recipes in "+ category);
    }
    public void searchForRating(int rating) {
        int count =0;
        for (Recipe recipe : recipes) {
            if (recipe.getRating() >= rating){
                display1Recipe(recipe);
            count++;}
        } if(count ==0)System.out.println("No recipes with a rating of " + rating);
    }
    public void searchForTitle(String title) {
        int count =0;
        for (Recipe recipe : recipes) {
            if (recipe.getTitle().contains(title.toLowerCase())){
                display1Recipe(recipe);
            count ++;
        }}
        if(count ==0)System.out.println("Title not found");
    }
    public void searchForIngredient(String ingredient) {
        int count =0;
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getIngredients().get(0));
            if (recipe.getIngredients().contains(ingredient.toLowerCase())){
                display1Recipe(recipe);
                count++;
        }}
        if(count ==0) System.out.println("No recipes with " + ingredient);
    }

    public void removeRecipe (String title){
        for (int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getTitle().toLowerCase().contains(title.toLowerCase())){
                recipes.remove(i);
            }
        }
    }

}




