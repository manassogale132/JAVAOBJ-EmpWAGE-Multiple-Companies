package EmpWageCalcJavaObj;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cases ob=new Cases();
		System.out.println("-Welcome Employee-");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-Wage Computation Program-");
	    System.out.println("-----------------------------------------------------------------");
	    
	   Scanner scan=new Scanner(System.in);
	   
	    System.out.println("--Select any 1 of the Company to get their Emp Wage--");
	    System.out.println("                  ");
	    System.out.println("1 - Vijay Sales");
	    System.out.println("                  ");
	    System.out.println("2 - Kohinoor");
	    System.out.println("                  ");
	    System.out.println("3 - Reliance Digital");
	 
	    int input = 0;
		do {
	  int input1=scan.nextInt();
	  
	  
	  switch(input1) {
	  
	  case 1:
		  System.out.println("-----------------------------------------------------------------");  
		System.out.println("-Vijay Sales Selected-"); 
		System.out.println("-----------------------------------------------------------------");
	    ob.vijaysales();
	    break;
	    
	  case 2:
		  System.out.println("-----------------------------------------------------------------");
		  System.out.println("-Kohinoor Selected-");  
		  System.out.println("-----------------------------------------------------------------");
		  ob.kohinoor();
		   break; 
		
	  case 3:
		  System.out.println("-----------------------------------------------------------------");
		  System.out.println("-Reliance Digital Selected-");
		  System.out.println("-----------------------------------------------------------------");
		    ob.relianceD();
		    break;
		
	  default:
		  System.out.println("No such case");
		    
	  }
	    }while(input!=3);
	    
	    
	}
	}




	

