public class SubClass  extends SuperKey
{

	int num = 110;
    void printNumber()
    {
	System.out.println(num);
    }
    void printSupNumber()
    {
    	System.out.println(super.num);
       }
    
    //.....................................................
    
    public static void main(String args[])
    {
	SubClass obj= new SubClass();
	obj.printNumber();	
	obj.printSupNumber();
    }
}