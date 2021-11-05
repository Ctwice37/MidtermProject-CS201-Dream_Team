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
        String ingredients = getCookingRecipe().getIngredients();
        return ingredients.split(ingredients, ',');


    }

    @Override
    public Recipe getCookingRecipe() {
        return this.recipe;
    }

    @Override
    public void printRecipe() {
        Recipe r = getCookingRecipe();
        String[] ingredients = getIngredientsList();

        System.out.println("Dish: " + r.getRecipeName() +"\n Ingredients: \n" );
        for(String s : ingredients)
            System.out.println(s);
        System.out.println("Instructions: "+ r.getInstructions() + "\nPrep Time: "+ r.getPrepTime() +
                "\nCook Time: " + r.getCookTime() + "\nServings: " + r.getServings());

    }
}
