package app;

import java.util.List;

public class App {

    static Product product;
    static ProductInfo list;

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
        list = new ProductInfo();

        // boolean add()
        list.add(getProductOne());
        System.out.println("1. BOOLEAN ADD()");
        System.out.println(list.add(getProductThree()));

        // void add()
        list.add(0, getProductTwo());
        System.out.println("\n2. VOID ADD()");
        System.out.println(list.list);

        // void clear() +
        list.clear();
        System.out.println("\n3. VOID CLEAN()\n" + list.list);

        // new list
        list.add(getProductOne());
        list.add(getProductTwo());
        list.add(2, getProductThree());

        // int get()
        System.out.println("\n4. INT GET()");
        System.out.println(list.get(0));

        // boolean isEmpty()
        System.out.println("\n5. BOOLEAN isEMPTY()");
        System.out.println(list.isEmpty());

        // boolean remove()
        System.out.println("\n6. BOOLEAN REMOVE()");
        System.out.println(list.remove(getProductThree()));

        // Product remove()
        System.out.println("\n7. PRODUCT REMOVE");
        System.out.println(list.remove(1));

        // boolean set()
        System.out.println("\n8. BOOLEAN SET");
        System.out.println(list.set(1, getProductTwo()));

        System.out.println("\n NEW LIST" + list.list);

        // int size()
        System.out.println("\n9. INT SIZE()");
        System.out.println(list.size());

        list.add(getProductThree());
        System.out.println("\n NEW LIST" + list.list);

        // IntList subList()
        System.out.println("\n10. INT LIST SUBLIST");
        System.out.println(list.subList(0, 1));
    }
}
