public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product))
            System.out.println("Veri tabanına ürün eklendi.");
        else
            System.out.println("Veri tabanına ürün eklenemedi.");

    }

    public void getProductName(Product product) {
        ProductValidator productValidator = new ProductValidator();
        productValidator.getProductName(product);
    }
}
