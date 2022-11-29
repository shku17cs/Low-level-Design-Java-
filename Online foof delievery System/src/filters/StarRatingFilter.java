package filters;

import data.FoodItem;
import data.StarRating;

public class StarRatingFilter implements FoodItemFilter {
    public StarRatingFilter(StarRating rating) {
        this.rating = rating;
    }

    private final StarRating rating;

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getStarRating().getVal()>=rating.getVal();
    }
}
