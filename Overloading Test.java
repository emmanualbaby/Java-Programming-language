

public class Test {

	
	public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
     
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  

    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
  
    
    public static void main(String args[]) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.sum(1,2)); 
        System.out.println(obj.sum(1,2,3)); 
        System.out.println(obj.sum(.5,.7)); 
    } 


}
