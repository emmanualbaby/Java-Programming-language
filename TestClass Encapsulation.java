

public class TestClass {
	public static void main (String[] args)  
    { 
        EncapsulateClass obj = new EncapsulateClass(); 
          
        
        obj.setName("JavaClass"); 
        obj.setAge(19); 
        obj.setRoll(51); 
        
        System.out.println("Name: " + obj.getName()); 
        System.out.println("Age: " + obj.getAge()); 
        System.out.println("Roll: " + obj.getRoll());  
        //System.out.println("Test roll: " + obj.TestName);
    } 

}
