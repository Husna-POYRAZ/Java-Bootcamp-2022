package oop1;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {		
		Product product1 = new Product();		
		product1.setName("Delonghi Kahve Makinesi"); 
		product1.setUnitPrice(7500);
		product1.setDiscount(9);
		product1.setImageUrl("image1.jpg");
		product1.setUnitsInStock(3);
		
		Product product2 = new Product();
		product2.setName("Seeg Kahve Makinesi Kahve Makinesi"); 
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setImageUrl("image2.jpg");
		product2.setUnitsInStock(3);
		
		Product product3= new Product();
		product3.setName("Kitchin Kahve Makinesi"); 
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setImageUrl("image2.jpg");
		product3.setUnitsInStock(3);
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<lu>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</lu>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("392");
		individualCustomer.setPhone("05121093203");
		individualCustomer.setFirstName("Hüsna");
		individualCustomer.setLastName("POYRAZ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05192819212");
		corporateCustomer.setTaxNumber("1928192819");
		corporateCustomer.setCustomerNumber("032323");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	}
	
}
