public class FoodFactory {
    public Food getFood(String foodType){
        if(foodType.equals("pizza")){
            return new Pizza();
        }
        else if (foodType.equals("cake")){
            return new Cake();
        }
        return null;
    }
}
