package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager1= new ProductManager(new JdbcProductDao(), loggers);
		productManager1.add(product1);
		
		Logger[] logger = {};
		
        Product product2 = new Product(2, "IPhone 13", 19000);
		ProductManager productManager2 = new ProductManager(new HibernateProductDao(), logger);
		productManager2.add(product2);
		
	}

}
