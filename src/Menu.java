import java.sql.SQLOutput;
import java.util.*;

public class Menu {
    private boolean runProgram = true;

    public static void main(String[] args) {
        RecipeBook recipeBook = new RecipeBook();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) Create a new recipe");
            System.out.println("2) Show all recipes");
            System.out.println("3) Remove a recipe");
            System.out.println("4) Rate a recipe");
            System.out.println("5) Search");
            System.out.println("6) Exit program");
            int choice = in.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter 1) title, 2) ingredients, 3)Instructions, 4)Category");
                    in.nextLine();
                    String title = in.nextLine();
                    String userInput = in.nextLine();
                    List<String> ingredients = Arrays.asList(userInput.split("[\\s,]+"));
                    String instructions = in.nextLine();
                    String category = in.nextLine();
                    recipeBook.addRecipe( title, ingredients, instructions,  category);
                    System.out.println("recipe added");
                }
                case 2 -> {
                    recipeBook.displayAllRecipes();
                }
                case 3 -> {
                    System.out.println("Which recipe would you like to delete?");
                    recipeBook.displayAllRecipes();
                    in.next();
                    String title = in.nextLine();
                    recipeBook.removeRecipe(title.toLowerCase(Locale.ROOT));
                }
                case 4 -> {
                    recipeBook.displayAllRecipes();
                    System.out.println("Which recipe would you like to rate?");
                    in.nextLine(); // scanner bug
                    String title = in.nextLine();
                    System.out.println("Enter your rating");
                    int rating = in.nextInt();
                    recipeBook.rateRecipe(title, rating);
                }
                case 5 ->{
                    System.out.println("What would you like to search for?");
                    System.out.println("1) Title");
                    System.out.println("2) Category");
                    System.out.println("3) Ingredient");
                    System.out.println("4) Rating");
                    in.nextLine(); // scanner bug
                    int answer = in.nextInt();
                    in.nextLine(); // scanner bug
                    switch (answer){
                        case 1 ->{
                            System.out.println("Enter title");
                            recipeBook.searchForTitle(in.nextLine());}
                        case 2 ->{
                            System.out.println("Enter category (Breakfast, Lunch, Dinner, Dessert)");
                            recipeBook.searchForCategory(in.nextLine());
                        }
                        case 3 ->{
                            System.out.println("Enter ingredient");
                            recipeBook.searchForIngredient(in.nextLine());
                        }
                        case 4 ->{
                            System.out.println("Enter minimum rating");
                            recipeBook.searchForRating(in.nextInt());
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Farvel");
                    System.exit(0);
                }
            }
        }
    }
}


