package oopWithNLayeredApp;

import oopWithNLayeredApp.business.productManager;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.core.logging.dataBaseLogger;
import oopWithNLayeredApp.core.logging.fileLogger;
import oopWithNLayeredApp.dataAccess.hibernateProductDao;
import oopWithNLayeredApp.entities.product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product product1 = new product(1,"monster",100000);
		
		Logger[] loggers = {new dataBaseLogger(),new fileLogger() ,new MailLogger()}; 
		
		productManager productManager = new productManager(new hibernateProductDao(), loggers);
		productManager.add(product1);
		
	}

}
