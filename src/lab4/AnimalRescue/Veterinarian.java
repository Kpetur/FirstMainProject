package lab4.AnimalRescue;

public class Veterinarian extends Human {

    private String specialiazation;
    private float yearsOfExp;

    public void setSpecialiazation(String specialiazation) {
        this.specialiazation = specialiazation;
    }

    public void setYearsOfExp(float yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getSpecialiazation() {
        return specialiazation;
    }

    public float getYearsOfExp() {
        return yearsOfExp;
    }
}
