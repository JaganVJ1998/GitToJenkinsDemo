package practiceNow;

public class LoopsDemo {
	
	
	
	
	public void printNumbers()
	{
		for(int num = 1;num<=100;num++)
		{
			if(num%2==0)
			{
				System.out.println(num + " is an EVEN number");
			}
			else
			{
				System.out.println(num + " is an ODD Number");
			}
			
		}
	}
	
	public static void main(String[] args) {
	
		LoopsDemo l = new LoopsDemo();
		l.printNumbers();
		
	}
	 
	
	

}
