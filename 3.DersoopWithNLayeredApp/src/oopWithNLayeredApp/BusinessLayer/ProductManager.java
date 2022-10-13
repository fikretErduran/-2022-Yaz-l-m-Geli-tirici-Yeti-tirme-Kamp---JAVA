package oopWithNLayeredApp.BusinessLayer;

import java.util.List;
import oopWithNLayeredApp.Core.Logging.Logger;
import oopWithNLayeredApp.DataAccessLayer.ProductDao;
import oopWithNLayeredApp.entityLayer.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
  public ProductManager(ProductDao productDao,Logger[] loggers) {
		
		this.productDao=productDao;
		this.loggers=loggers;
	}


public void add(Product product)throws Exception { //response reqest t
	  //is kuralları business rules
	  if(product.getUnitPrice()<10) {
		  throw new Exception("Urun Fiyatı 10 dan kucuk olamaz");
	  }
	
	productDao.add(product);
	for(Logger logger:loggers) {//[db,mail]
		logger.log(product.getName());
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
