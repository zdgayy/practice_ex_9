import java.util.ArrayList;

public class CustomPizza {

    private String toppings; 

    private double price;


    public CustomPizza() {
        this.toppings = "";
        this.price = 0.0;
    }

    public CustomPizza(String toppings, double price) {
        this.toppings = toppings;
        this.price = price;
    }


    public String getToppings() {
        return toppings;
    }
    public void setToppings(String newTopping) {
        if ("".equals(toppings)) {
            toppings = newTopping;
        } else {
            toppings += ", " + newTopping;
        }
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "CustomPizza{" +
                "toppings='" + toppings + '\'' +
                ", price=" + price +
                '}';
    }
}