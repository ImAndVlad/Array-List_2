package app;

import java.util.*;

public class ProductInfo extends Product implements List<Product> {

    ArrayList<Product> list = new ArrayList<>();

    @Override
    public String toString() {
        return "Product name: " + super.name + " price: USD " + super.price;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<Product> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(Product product) {
        return list.add(product);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Product> c) {
        return list.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Product> c) {
        return list.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Product get(int index) {
        return list.get(index);
    }

    @Override
    public Product set(int index, Product element) {
        return list.set(index, element);
    }

    @Override
    public void add(int index, Product element) {
        list.add(index, element);
    }

    @Override
    public Product remove(int index) {
        return list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<Product> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<Product> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<Product> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }
}
