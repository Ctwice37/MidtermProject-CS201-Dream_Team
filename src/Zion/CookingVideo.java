package Zion;



public class CookingVideo extends Video implements CookingVideos{
    Recipe recipe;

    public CookingVideo() {
       super();
       recipe = new Recipe();
    }

    public CookingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, Recipe recipe) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.recipe = recipe;
    }

    @Override
    public String[] getIngredientsList() {
        return new String[0];
    }

    @Override
    public Recipe getCookingRecipe() {
        return null;
    }

    @Override
    public void printRecipe() {

    }
}
