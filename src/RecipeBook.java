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
        //System.out.println(recipes.get(0));
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
            System.out.println("Titel: " + recipe.getTitle());
            System.out.println("Kategori: " + recipe.getKategori());
            System.out.println("Ingredienser: " + recipe.getIngredients());
            System.out.println("Fremgangsmåde: " + recipe.getInstructions());
            System.out.println("Vudering: " + recipe.getRating());
            System.out.println("-------------------------");
        }
    }


    public void removeRecipe (String title){
        for (int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getTitle().toLowerCase().contains(title.toLowerCase())){
                recipes.remove(i);
            }
        }
    }

}




