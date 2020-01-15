package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Pet kicune = new Pet();
        System.out.println(kicune.petName);
        System.out.println(kicune.petAge);
        System.out.println(kicune.petRace);
        System.out.println(kicune.petHealth);
        System.out.println(kicune.petHunger);
        System.out.println(kicune.petMood);
        System.out.println(kicune.favouriteFood);
        System.out.println(kicune.favouriteActivity);

        Veterinarian alex = new Veterinarian();
        System.out.println(alex.veterinarianName);
        System.out.println(alex.veterinarianSpecialization);

        Adopter helga= new Adopter();
        System.out.println(helga.adopterName);
        System.out.println(helga.availableMoney);

        PetFood husse = new PetFood();
        System.out.println(husse.foodName);
        System.out.println(husse.foodPrice);
        System.out.println(husse.foodStock);
        System.out.println(husse.foodAvailability);

        RecreationActivity disc = new RecreationActivity();
        System.out.println(disc.recreationName);

    }
}
