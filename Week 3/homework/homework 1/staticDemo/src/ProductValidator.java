public class ProductValidator {
    public ProductValidator() {
        System.out.println(" --- ");
    }
    static {
        System.out.println(" *** ");
    }
    public static boolean isValid(Product product) {
        if(product.price > 0 && !product.name.isEmpty())
            return true;
        else
            return false;
    }

    public void getProductName(Product product) {
        if(!product.name.isEmpty())
            System.out.println("Ürün adı : " + product.name);
        else
            System.out.println("Ürünün adı eksik girilmiştir.");

    }
}
