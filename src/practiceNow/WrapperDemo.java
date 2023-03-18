package practiceNow;

public class WrapperDemo {
	
	int var1 = 10; // Primitive type variable
	Integer obj1 = 1000; // Wrapper class Object
	/*
	String s1 = new String("Oranium");
	String s2 = "Oranium";*/
	int var2 = obj1;
	Integer obj2 = var1;
	
	public void addNumbers()
	{
		System.out.println("Primitive Varaible 1 is   :   " +var1); 
		System.out.println("Wrapper Class Object 1 is   :   " +obj1);
		
		System.out.println("Primitive Varaible 2 is   :   " +var2); 
		System.out.println("Wrapper Class Object 2 is   :   " +obj2);
	}
	
	
	public static void main(String[] args) {
		
		WrapperDemo w = new WrapperDemo();
		w.addNumbers();
	}

}
