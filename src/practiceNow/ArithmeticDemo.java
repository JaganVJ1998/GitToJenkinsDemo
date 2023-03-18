package practiceNow;

import java.util.ArrayList;

public class ArithmeticDemo {

	String s1 = null;
	
	public void divideNumbers() 
	{
		
		ArrayList a = new ArrayList();
		a.add("Oranium");
		a.add(24);
		a.add(false);
		a.add(24.5);
		
		System.out.println("Welcome");
		try
		{
		System.out.println(a.get(5));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("GoodBye");
		
	}
	
	public static void main(String[] args) {
		
		ArithmeticDemo a = new ArithmeticDemo();
		a.divideNumbers();
		
	}
	
}
