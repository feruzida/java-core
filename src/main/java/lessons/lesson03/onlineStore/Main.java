package lessons.lesson03.onlineStore;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1234,"SAMSUNG A12", 100, 10);
        Product product1 = new Product(1234,"SAMSUNG A12", 100, 10);
        Product product2 = new Product(1233,"SAMSUNG A11", 80, 30);
        Product product3 = new Product(1234,"SAMSUNG A12", 100, 5);


        OnlineStore onlineStore = new OnlineStore();
        onlineStore.addProduct(product);

        onlineStore.addProduct(product1);

//        onlineStore.addProduct(product2);

        onlineStore.buyProduct(1234, 29);
//        onlineStore.getProducts(1233);
//        onlineStore.buyProduct(123, 31);
//        onlineStore.getProducts(1);
//        onlineStore.getProducts();
//        onlineStore.getProducts(1233);
//        onlineStore.buyProduct(1233, 31);
//        onlineStore.buyProduct(1233, 2);
//        onlineStore.getProducts();
        onlineStore.addProduct(product3);
        onlineStore.getProducts();
        product3.setPrice(95.0);
        onlineStore.getProducts(1234);
        onlineStore.addProduct(product3);
        onlineStore.getProducts();

    }
}
