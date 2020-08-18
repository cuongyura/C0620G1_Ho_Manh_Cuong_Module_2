package _12_Collection_Framwork.bai_Tap._1_ArrayList_LinkedList_Collection_Framework;

public class Product {
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    private String name;
    private int id;
    private int price;

    public Product() {
    }

    public Product(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "." + name + " price:" + getPrice();
    }
}
