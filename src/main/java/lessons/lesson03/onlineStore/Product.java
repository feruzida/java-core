package lessons.lesson03.onlineStore;

public class Product {
    private final int code;
    private String name;
    private double price;
    private int count;

    public Product(int code, String name, double price, int count) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public String getProductInfo() {
        return "Code: " + code + "\nName: " + name + "\nPrice: " + price + "\nCount: " + count + "\n";
    }

    public int getCode() {
        return code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
