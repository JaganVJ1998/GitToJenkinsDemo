package practiceNow;

public class Hacker {
	
	public static void main(String[] args) {
		
		BankDataBase b = new BankDataBase();
		System.out.println(b.getPassword());
		b.setPassword("HaCkEd@321");
		System.out.println(b.getPassword());
				
		
		
	}

}
