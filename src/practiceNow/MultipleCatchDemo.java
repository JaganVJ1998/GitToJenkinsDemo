package practiceNow;

public class MultipleCatchDemo {

	int var1 = 10;
	int var2 = 0;
	String s1 = null;
	
	public void operationExcep()
	{
		System.out.println("Welcome");	
		try 
		{
			System.out.println(var1/var2);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally Divided");
		}
		
		System.out.println("GoodBye");
		
	}
	
	public static void main(String[] args) {
		
		MultipleCatchDemo m = new MultipleCatchDemo();
		m.operationExcep();
	}
	
	
}
