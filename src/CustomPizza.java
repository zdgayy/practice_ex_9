import java.util.ArrayList;

public class CustomPizza {
    private ArrayList<String> toppings; 
    private double price;

    public CustomPizza() {
        this.toppings = new ArrayList<>();
        this.price = 0.0;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "CustomPizza{" +
                "toppings=" + toppings +
                ", price=" + price +
                '}';
    }
}