package apis;

import data.FoodItem;
import data.MealType;
import data.StarRating;
import data.cuisineType;

import java.util.List;

public class FoodItemSearcherAPI {


    public List<FoodItem> searchFoodItems(String fooditemName, MealType mealType, List<cuisineType>cuisines, StarRating rating)
    {
        return null;
        Fooditem f;
        // f.getMealType().equals(mealType);
        // cuisines.contains(f.getCuisineType());

    }
}
// searcher :Generic Searcher(ocp open close principle)
// get only those fooditems whose name matches fooditemname ) and mealtype is given mealtype and cuisine type is in user cuisine type and rating should be equal to given user rating
//the seacheracher should be generic in nature
// Filter F1 F2 f3