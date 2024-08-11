class Class_C extends Class_A
{
	public static void main(String[] args) 
	{
		 System.out.println("Class C Content"); 
		 Class_C obj1 = new Class_C(); 
		 obj1.function_a(); 
		 Class_B obj2 = new Class_B(); 
		 obj2.function_b(); 
		 obj1.function_a(); 
	}

}
