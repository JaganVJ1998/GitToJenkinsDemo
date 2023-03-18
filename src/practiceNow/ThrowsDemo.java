package practiceNow;

public class ThrowsDemo {
	
	
	public void printNumbers() throws SaravananException  
	{
		System.out.println("Welcome");

		for(int i = 0; i<=50; i++)
		{
			if(i==25)
			{
				
				throw new SaravananException("COLOUR");
				
				
			}
			System.out.println(i);
		}
		
		System.out.println("GoodBye");
	}
	
	
	public static void main(String[] args) throws Exception {
		
		ThrowsDemo t = new ThrowsDemo();
		t.printNumbers();
	}

}
