package filters;

import data.FoodItem;
import data.cuisineType;

public class CuisineTypeFilter implements FoodItemFilter {

    public CuisineTypeFilter(List<cuisineType> cuisinetypes) {
        this.cuisinetypes = cuisinetypes;
    }

    @Override
    private final List<cuisineType> cuisinetypes;
    private final List<cuisineTypeaaaa> cuisinetypesa;
    public boolean filter(FoodItem foodItem) {
        return cuisinetypes.contains(foodItem.getCuisineType());


    }
}
