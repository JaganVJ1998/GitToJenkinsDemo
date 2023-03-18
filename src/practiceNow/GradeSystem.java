package practiceNow;

public class GradeSystem {
	
	int mark = 130;
	
	public void gradeCheck()
	{
		if(mark>80 && mark<=100)
		{
			System.out.println("GRADE A");
		}
		else if(mark>60 && mark<=80)
		{
			System.out.println("GRADE B");
		}
		else if(mark>40 && mark<=60)
		{
			System.out.println("GRADE C");
		}
		else if(mark > 20 && mark<=40)
		{
			System.out.println("Grade D");
		}
		else if(mark>=0 && mark<=20)
		{
			System.out.println("FAIL");
		}
		else
		{
			System.out.println("ABSENT or MARK GREATER THAN 100 or MARK is NEGATIVE");
		}	
		
	}
	
	
	public static void main(String[] args)
	{
		GradeSystem g = new GradeSystem();
		g.gradeCheck();
		
	}
}
