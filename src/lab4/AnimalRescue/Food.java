package lab4.AnimalRescue;

public class Food {

    private String name ;
    private int price;
    private int stock;
    private boolean availability;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAvailability() {
        return availability;
    }
}
