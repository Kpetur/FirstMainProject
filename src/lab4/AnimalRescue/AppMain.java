package lab4.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Adopter lily = new Adopter();
        lily.setName("Lilly");
        lily.setAge(16);
        lily.setMoney(1450);
        lily.setFavPet("Dog");
        System.out.println(lily.getName());
        System.out.println(lily.getAge());
        System.out.println(lily.getMoney());
        System.out.println(lily.getFavPet());

        Veterinarian karl = new Veterinarian();
        karl.setName("Karl");
        karl.setAge(46);
        karl.setMoney(4500000);
        karl.setSpecialiazation("Treating mamals");
        karl.setYearsOfExp(24);
        System.out.println(karl.getName());
        System.out.println(karl.getAge());
        System.out.println(karl.getMoney());
        System.out.println(karl.getSpecialiazation());
        System.out.println(karl.getYearsOfExp());

        Pet theo = new Pet();
        theo.setName("Theo");
        theo.setAdoptable(true);
        theo.setRace("Dog");
        theo.setAge(0.6f);
        theo.setFavActivity("Running");
        theo.setFavFood("Meat");
        theo.setHealth(8);
        theo.setHunger(4);
        theo.setMood("Playful");
        System.out.println(theo.getName());
        System.out.println(theo.isAdoptable());
        System.out.println(theo.getRace());
        System.out.println(theo.getRace());
        System.out.println(theo.getAge());
        System.out.println(theo.getFavActivity());
        System.out.println(theo.getFavFood());
        System.out.println(theo.getHealth());
        System.out.println(theo.getHunger());
        System.out.println(theo.getMood());


    }
}
