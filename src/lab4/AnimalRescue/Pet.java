package lab4.AnimalRescue;

public class Pet extends Animal {

    private String race;
    private boolean adoptable;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isAdoptable() {
        return adoptable;
    }

    public void setAdoptable(boolean adoptable) {
        this.adoptable = adoptable;
    }
}
