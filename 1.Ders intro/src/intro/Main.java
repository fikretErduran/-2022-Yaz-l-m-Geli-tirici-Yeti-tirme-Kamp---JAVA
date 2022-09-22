package intro;

public class Main {
     
	public static void main(String[] args) {
		
	  System.out.println("Hello worl!!");
    System.out.println("Fikret Erduran");
   
    String ortaMetin="ilginizi cekebilir";
    String altMetin = "vade süresi";
    System.out.println(ortaMetin);
    
    int vade=12;
    double dolarBugun=18.35;
    double dolarDun=18.35;
    
    
    boolean dolarDustuMu= false;
    
    String okYonu="";
    
    if(dolarDun<dolarBugun) {
    	okYonu="up.svg";
    	System.out.println(okYonu);
    }
    else if(dolarDun>dolarBugun) {
    	okYonu="down.svg";
    	System.out.println(okYonu);
    }
    else {
    	
    	okYonu="equal.svg";
    	System.out.println(okYonu);
    }
       String kredi1="ihtiyac kredisi";
       String kredi2="Arac kredisi";
       String kredi3="Konut Kredisi";
       
      
       
       // [] Array
       
       String [] krediler= {
    		   "Hizli kredi","maasini halkbankdan alanlar",
    		   "Konut kredisi","Arac kredisi"};
       
       System.out.println("-------------------------------------");
       System.out.println(krediler [0]);
       System.out.println(krediler[1]);
       System.out.println(krediler[2]);
       
   System.out.println("-------------------------------------");
       
       for(int i=0;i<krediler.length;i++) {
    	   System.out.println(krediler[i]);
       }
      
	}

}
