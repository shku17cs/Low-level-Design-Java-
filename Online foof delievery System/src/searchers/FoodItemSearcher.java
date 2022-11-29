package searchers;

import java.util.List;


// businessclass
public class FoodItemSearcher {
   List<FoodItem> search(String foodItemName, List<FoodItemFilter>filters)
   {
       if(foodItemName==null||foodItemName.length()==0||filters==null)
       {
           throw new illegalArgumentException("missing params");
       }
       DataAccessResult dataAccessResult=DataAccessor.getFoodItemsWithName(foodItemName);
       List<FoodItem>fooditems=DataAcessObjectConverter.convertToFoodItems(DataAccessResult);
       for(FoodItemFilter filter:filters)
       {
           for(int j=0,k=0)
           {

           }
       }
       

   }
}
