package practiceNow;

import java.util.Scanner;

public class UserInputDemo {
	
	String var1;
	String var2;
	
	public void addNumbers()
	{
		Scanner s = new Scanner(System.in);
		var1 = s.nextLine();
		var2 = s.nextLine();
		
		System.out.println("Addition is  " + (var1+var2));
	}
	
	public static void main(String[] args) {
		
		UserInputDemo u = new UserInputDemo();
		u.addNumbers();
		
		
	}
	

}
