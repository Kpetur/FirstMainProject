package lab3.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
       Veterinarian firstVet = new Veterinarian();
         firstVet.setVeterinarianName("Veterinarian name: Hephaistos");
         System.out.println(firstVet.getVeterinarianName());
         firstVet.setVeterinarianSpecialization("Bone Welding");
        System.out.println(firstVet.getVeterinarianSpecialization());

        PetFood husse = new PetFood();
        husse.setFoodName("Petfood name: Husse");
        System.out.println(husse.getFoodName());
        husse.setFoodPrice(8);
        System.out.println(husse.getFoodPrice());
        husse.setFoodStock(450);
        System.out.println(husse.getFoodStock());
        husse.setFoodAvailability(true);
        System.out.println(husse.getFoodAvailability());

        RecreationActivity hunting = new RecreationActivity();
        hunting.setRecreationName("Mice Hunting");
        System.out.println(hunting.getRecreationName());

        Adopter hermes = new Adopter();
        hermes.setAdopterName("Hermes Trismeghistos");
        System.out.println(hermes.getAdopterName());
        hermes.setAvailableMoney(444);
        System.out.println(hermes.getAvailableMoney());

        Pet kicune = new Pet();
        kicune.setPetName("Kicune");
        System.out.println(kicune.getPetName());
        kicune.setPetRace("Cat");
        System.out.println(kicune.getPetRace());
        kicune.setPetAge(0.8f);
        System.out.println(kicune.getPetAge());
        kicune.setPetHealth(8);
        System.out.println(kicune.getPetHealth());
        kicune.setPetHunger(3);
        System.out.println(kicune.getPetHunger());
        kicune.setPetMood("Playfull");
        System.out.println(kicune.getPetMood());
        kicune.setFavouriteFood("Mice");
        System.out.println(kicune.getFavouriteFood());
        kicune.setFavouriteActivity("Mice hunting");
        System.out.println(kicune.getFavouriteActivity());

    }
}
