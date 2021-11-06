package Zion;

import java.util.Comparator;

public class JavaTube {

    public class sortVideosByTitle implements Comparator<Video> {                                           //Inner Class

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
    public class sortVideosByViews implements Comparator<Video> {                                          //Inner Class
        @Override
        public int compare(Video o1, Video o2) {
            return o1.getViews() - o2.getViews();
        }
    }
        public void printByIngredientList(){                                                                //Local Inner Class
             class sortCookingVideoByIngredientList implements Comparator<CookingVideo> {

                @Override
                public int compare(CookingVideo o1, CookingVideo o2) {
                    return o1.getIngredientsList().length - o2.getIngredientsList().length;
                }
            }

        }


    public void videoPrinter(Video[] arr) {
        for(Video v : arr)
            System.out.println(v);
    }

    public void printAllCookingRecipes(CookingVideo[] arr){
        for(CookingVideo c : arr)
            System.out.println(c.getCookingRecipe());
    }

    public static void main(String[] args) {

        CookingVideo c1 = new CookingVideo();
        GamingVideo g1 = new GamingVideo();


        Video[] allVideos = new Video[10];
        CookingVideo[] cookingVideos = new CookingVideo[10];
        GamingVideo[] gamingVideos = new GamingVideo[10];

        VideoList vl = new VideoList();
        vl.add(c1);
    }
}
