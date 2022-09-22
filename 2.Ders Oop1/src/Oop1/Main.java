package Oop1;

public class Main {

	public static void main(String[] args) {
		// String mesaj="vade oranı";

		Product product1 = new Product();
		
		product1.setName("Delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrise(4500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		// set value yazmaya
		
        Product product2 = new Product();
		product2.setName("Delonghi kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrise(4500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Delonghi kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrise(4500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product product4 = new Product();
		product4.setName("Delonghi kahve makinesi");
		product4.setDiscount(10);
		product4.setUnitPrise(7500);
		product4.setUnitsInStock(31);
		product4.setImageUrl("image4.jpg");

		// set value yazmaya
	
		// get okumaya
		// System.out.println(product1.name);

		Product [] products = {product1,product2,product3};
		
		     System.out.println();
		     
		     for(Product product : products) {
		    	 
			 System.out.println(product.getName());
			 System.out.println();
			
			 IndividualCustomer individualCustomer =new IndividualCustomer();
			 
			 individualCustomer.setId(1);
			individualCustomer.setPhone("05563618");
			individualCustomer.setCustomerNumber("12345");
			individualCustomer.setFirstName("Fikret");
			individualCustomer.setLastName("Eryjyn");
			 
			CorporateCustomer corporateCustomer= new CorporateCustomer();
			corporateCustomer.setId(2);
			corporateCustomer.setCompanyName("kodlama.io");
			corporateCustomer.setPhone("4643345471");
			corporateCustomer.setTaxNumber("1254455");
			corporateCustomer.setCustomerNumber("55224");
			
			Customer[] customers = {individualCustomer,corporateCustomer};
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
