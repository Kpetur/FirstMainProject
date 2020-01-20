package lab3.AnimalRescue;

public class PetFood {
    private String foodName ;
    private int foodPrice;
    private int foodStock;
    private boolean foodAvailability;

    public  void setFoodName(String foodName){
        this.foodName = foodName;
    }
    public String getFoodName (){
        return foodName;
    }

    public void setFoodPrice(int foodPrice){
        this.foodPrice = foodPrice;
    }
    public int getFoodPrice(){
        return foodPrice;
    }

    public void setFoodStock(int foodStock){
        this.foodStock = foodStock;
    }
    public int getFoodStock(){
        return foodStock;
    }
    public void setFoodAvailability(boolean foodAvailability){
        this.foodAvailability = foodAvailability;
    }
    public boolean getFoodAvailability(){
        return foodAvailability;
    }
}
