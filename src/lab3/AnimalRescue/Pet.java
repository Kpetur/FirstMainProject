package lab3.AnimalRescue;

public class Pet {
    private String petName;
    private float petAge;
    private int petHealth;
    private int petHunger;
    private String petRace;
    private String petMood;
    private String favouriteFood;
    private String favouriteActivity;

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }
    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setPetMood(String petMood) {
        this.petMood = petMood;
    }

    public String getPetMood() {
        return petMood;
    }

    public void setPetRace(String petRace) {
        this.petRace = petRace;
    }

    public String getPetRace() {
        return petRace;
    }

    public void setPetHunger(int petHunger) {
        this.petHunger = petHunger;
    }

    public int getPetHunger() {
        return petHunger;
    }

    public void setPetHealth(int petHealth) {
        this.petHealth = petHealth;
    }

    public int getPetHealth() {
        return petHealth;
    }

    public void setPetName(String petName){
        this.petName = petName;
    }
    public  String getPetName(){
        return petName;
    }

    public void setPetAge(float petAge) {
        this.petAge = petAge;
    }

    public float getPetAge() {
        return petAge;
    }
}
