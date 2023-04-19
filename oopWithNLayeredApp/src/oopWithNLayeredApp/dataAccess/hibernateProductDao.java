package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.product;

public class hibernateProductDao implements ProductDao {

	public void add(product product) {
		System.out.println("urun sisteme hibernate ile kaydedildi ");
	}
}
