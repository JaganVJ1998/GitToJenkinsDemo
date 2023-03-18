package practiceNow;

public class SaravananException extends Exception {
	
	SaravananException(String msg)
	{
		if(msg.equals("OUT"))
		{
		System.out.println("OUT OF STOCK");
		}
		if(msg.equals("COLOUR"))
		{
		System.out.println("Selected colour is not available"); 
		}
	}

}
