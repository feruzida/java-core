package lessons.lesson03.onlineStore;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        boolean found = false;
        for (Product product1 : products) {
            if (product1.getCode() == product.getCode()) {
                product1.setCount(product1.getCount() + product.getCount());
                product1.setPrice(product.getPrice());
                found = true;
                break;
            }
        }
        if (!found) {
            products.add(product);
        }
    }

    public void buyProduct(int code, int count) {
        for (Product product : products) {
            if (code != product.getCode()) {
                continue;
            }
            if (product.getCount() == 0) {
                System.out.println("Product is not available!");
                return;
            }
            if (product.getCount() < count) {
                System.out.print("Just " + product.getCount() + " products are available!" +
                        "\nDo you want buy all of them - " + product.getCount() + "? Yes or No - ");
                Scanner sc = new Scanner(System.in);
                String yesOrNo = sc.next();
                if (yesOrNo.equals("Yes")) {
                    product.setCount(0);
                    System.out.println("You bought all of them!\n");
                } else {
                    System.out.println("Purchase cancelled.\n");
                }
                return;
            }
            product.setCount(product.getCount() - count);
            System.out.println("You bought " + count + " products");
            return;
        }
        System.out.println("The code of product is incorrect. Try again!\n");
    }

    public void getProducts(int code) {
        boolean found = false;
        for (Product product : products) {
            if (product.getCode() == code) {
                System.out.println(product.getProductInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no such Product! Try again.\n");
        }
    }

    public void getProducts() {
        System.out.println("Information about all of Products in List");
        for (Product product : products) {
            System.out.println(product.getProductInfo());
        }
        System.out.println("Thats it!\n");
    }

}
