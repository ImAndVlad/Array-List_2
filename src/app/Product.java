package app;

public class Product {

    String name;
    double price;

    @Override
    public String toString() {
        return "\tProduct name: " + name + " price: USD " + price;
    }
}
