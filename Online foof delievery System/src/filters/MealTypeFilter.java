package filters;

import data.FoodItem;
import data.MealType;

public class MealTypeFilter implements FoodItemFilter{
    private final MealType mealtype;

    public MealTypeFilter(MealType mealtype) {
        this.mealtype = mealtype;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getMealType().equals(mealtype);
    }
}
