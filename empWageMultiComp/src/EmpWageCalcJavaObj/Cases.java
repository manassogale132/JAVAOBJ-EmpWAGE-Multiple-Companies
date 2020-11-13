package EmpWageCalcJavaObj;

import java.util.Random;

public class Cases {

	
	
		public void vijaysales(){
			int fwage=160;
			int hwage=80;
		    int nowage=0;
		    int sum =0;
		    
		    System.out.println("Fwage="+fwage+"    "+"(Present)");         
		    System.out.println("Hwage="+hwage+"     "+"(Partime)");        
		    System.out.println("NOwage="+nowage+"     "+"(Absent)");  
		    System.out.println("         ");
		    System.out.println("Working Days="+20);
		    System.out.println("         ");
		    System.out.println("-----------------------------------------------------------------");

		    
	System.out.println("Day No:"+"     "+"Wage"+"     "+"TotalWage");
	System.out.println("         ");
	        
	        for(int i=0;i<=20;i++) {
	        Random rand = new Random();
	        int input = rand.nextInt(3);
	        
	       switch(input) {
	       
	       case 2:
	    	   sum=sum+fwage;
	       	   System.out.println("Day "+i+"        "+ fwage+"        "+sum);
	       	   break;
	       case 0:
	    	   sum=sum+nowage;     
	       	   System.out.println("Day "+i+"        "+ nowage+"        "+sum);
	       	   break;
	       case 1:
	    	   sum=sum+hwage;  
	           System.out.println("Day "+i+"        "+ hwage+"        "+sum);
	       	   break;
	       default:
	    	   System.out.println("No such case");
	    	   break;
	       }
	}
		}
	

public void kohinoor(){
	int fwage=200;
	int hwage=100;
    int nowage=0;
    int sum =0;
    
    System.out.println("Fwage="+fwage+"    "+"(Present)");
    System.out.println("Hwage="+hwage+"     "+"(Partime)");
    System.out.println("NOwage="+nowage+"     "+"(Absent)");
    System.out.println("         ");
    System.out.println("Working Days="+25);
    
    System.out.println("         ");
    System.out.println("-----------------------------------------------------------------");
 
    
    
System.out.println("Day No:"+"     "+"Wage"+"     "+"TotalWage");
System.out.println("         ");
    
    for(int i=0;i<=25;i++) {
    Random rand = new Random();
    int input = rand.nextInt(3);
    
   switch(input) {
   
   case 2:
	   sum=sum+fwage;
   	   System.out.println("Day "+i+"        "+ fwage+"        "+sum);
   	   break;
   case 0:
	   sum=sum+nowage;     
   	   System.out.println("Day "+i+"        "+ nowage+"        "+sum);
   	   break;
   case 1:
	   sum=sum+hwage;  
       System.out.println("Day "+i+"        "+ hwage+"        "+sum);
   	   break;
   default:
	   System.out.println("No such case");
	   break;
   }
}
}


public void relianceD(){
	int fwage=300;
	int hwage=150;
    int nowage=0;
    int sum =0;
    
    System.out.println("Fwage="+fwage+"    "+"(Present)");
    System.out.println("Hwage="+hwage+"     "+"(Partime)");
    System.out.println("NOwage="+nowage+"     "+"(Absent)");
    System.out.println("         ");
    System.out.println("Working Days="+28);
    
    System.out.println("         ");
    System.out.println("-----------------------------------------------------------------");
    
System.out.println("Day No:"+"     "+"Wage"+"     "+"TotalWage");
System.out.println("         ");
    
    for(int i=0;i<=28;i++) {
    Random rand = new Random();
    int input = rand.nextInt(3);
    
   switch(input) {
   
   case 2:
	   sum=sum+fwage;
   	   System.out.println("Day "+i+"        "+ fwage+"        "+sum);
   	   break;
   case 0:
	   sum=sum+nowage;     
   	   System.out.println("Day "+i+"        "+ nowage+"        "+sum);
   	   break;
   case 1:
	   sum=sum+hwage;  
       System.out.println("Day "+i+"        "+ hwage+"        "+sum);
   	   break;
   default:
	   System.out.println("No such case");
	   break;
   }
}
}




}
	
	
