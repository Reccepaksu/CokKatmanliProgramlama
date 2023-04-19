package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.product;

public class jdbcProductDao implements ProductDao {

	public void add(product product) {
		System.out.println("Urun veritabanına jdbc ile eklendi.");
	}
}
