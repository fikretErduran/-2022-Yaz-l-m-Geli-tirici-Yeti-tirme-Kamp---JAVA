package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.BusinessLayer.ProductManager;
import oopWithNLayeredApp.Core.Logging.DataBaseLogger;
import oopWithNLayeredApp.Core.Logging.FileLogger;
import oopWithNLayeredApp.Core.Logging.Logger;
import oopWithNLayeredApp.Core.Logging.MailLogger;
import oopWithNLayeredApp.DataAccessLayer.HibernateProductDal;
import oopWithNLayeredApp.DataAccessLayer.JdbcProductDao;
import oopWithNLayeredApp.entityLayer.Product;

public class Main {

	public static void main(String[] args) throws Exception {
	
	Product product1=new Product(1,"Iphone xr",10000);
	 Logger[] loggers= {new FileLogger()};
	  
	ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
	productManager.add(product1);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
