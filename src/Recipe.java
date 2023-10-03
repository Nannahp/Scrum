import java.util.*;

class Recipe {
    private String title;
    private List<String> ingredients;
    private String instructions;
    private int rating;
    private String kategori;

    public Recipe(String title, List<String> ingredients, String instructions, String kategori) {
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.rating = 0; // Initial rating is set to 0
        this.kategori = kategori;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

}