package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	//sadece ve sadece db erişim kodları buraya yazılır ... SQL kodları
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına ürün eklendi.");
	}
}
