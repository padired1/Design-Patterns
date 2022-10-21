package ptbs;

public class PersonFactory {
private static Person person;
	
	public static Person getPerson(int User_Type)
	 {
		
		if(User_Type== Facade.BUYER) 
			
		{
			person = new Buyer();
		}else if(User_Type == Facade.SELLER) {
			person = new Seller();
		}
		
		return person;
	}

}
