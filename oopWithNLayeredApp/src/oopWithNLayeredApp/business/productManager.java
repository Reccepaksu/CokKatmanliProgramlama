package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.product;

public class productManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public productManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers; 
	}

	public void add (product product) {
		if(product.getUnitPrice()<10) {
			System.out.println("girdiginiz fiyat hatalidir.");
		}
		productDao.add(product);
		
		for(Logger logger : loggers) {
			logger.log(product.getIsim());
		}
		
		
	}
	
}
