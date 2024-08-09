

public class EncapsulateClass {
	
	private String TestName; 
    private int TestRoll; 
    private int TestAge; 
  
    public int getAge()  
    { 
      return TestAge; 
    } 

    public String getName()  
    { 
      return TestName; 
    } 

    public int getRoll()  
    { 
       return TestRoll; 
    } 
    public void setAge( int newAge) 
    { 
      TestAge = newAge; 
    } 
   
    public void setName(String newName) 
    { 
      TestName = newName; 
    } 

    public void setRoll( int newRoll)  
    { 
      TestRoll = newRoll; 
    } 
}
