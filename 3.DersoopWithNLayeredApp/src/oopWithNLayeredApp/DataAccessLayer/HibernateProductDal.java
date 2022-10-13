package oopWithNLayeredApp.DataAccessLayer;

import oopWithNLayeredApp.entityLayer.Product;

public class HibernateProductDal implements ProductDao {
	public void add(Product product) {
		 //sadece ve sadece db erisim kodları buraya yazılır...SQL
		 System.out.println("Hibernate ile veritabanına eklendi");
	 }

}
