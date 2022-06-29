package app.models;

public class App {

    static Product product;
    static ProductInfo info;

    public static void main(String[] args) {
        getList();
    }

    private static Product getProductOne() {
        product = new Product();
        product.name = "Name1";
        product.price = 1.50;

        return product;
    }

    private static Product getProductTwo() {
        product = new Product();
        product.name = "Name2";
        product.price = 2.99;

        return product;
    }

    private static Product getProductThree() {
        product = new Product();
        product.name = "Name3";
        product.price = 8.99;

        return product;
    }

    public static void getList() {
        info = new ProductInfo();
        info.add(0, getProductOne());
        info.add(getProductTwo());
        System.out.println(info.size());
    }
}
