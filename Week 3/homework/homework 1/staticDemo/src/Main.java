import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "";
        product.price = 1000;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.getProductName(product);
    }
}