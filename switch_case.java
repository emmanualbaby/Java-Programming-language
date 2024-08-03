import java.util.Scanner;

public class switch_case {

	public static void main( String args[] ) {
	      
	      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	      System.out.println("Enter number from 0 to 2");
	      int weather = myObj.nextInt();  
	  
	      switch (weather) 
	      {
	          //comparing value of variable against each case
	        case 0:
	          System.out.println("It is Sunny today!");
	          break;
	        case 1:
	          System.out.println("It is Raining today!");
	          break;
	        case 2:
	          System.out.println("It is Cloudy today!");
	          break;
	        //optional
	        default:
	          System.out.println("Invalid Input!");
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}