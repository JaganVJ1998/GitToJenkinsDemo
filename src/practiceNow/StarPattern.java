package practiceNow;

public class StarPattern {
	

	public void printStars()
	{
		for(int row = 1; row<=5; row++)  // row = 2
		{	
			for(int col=1; col<=5; col++)  // col = 1
			{					
				if(col < row)
				{
				System.out.print("  ");
				}
				else
				{
				  System.out.print("* ");
				}
								
			}
			
			System.out.println();			
		}
		
		
	}
	
	public static void main(String[] args)
	{
	   StarPattern s = new StarPattern();
	   s.printStars();
	
	}
}
