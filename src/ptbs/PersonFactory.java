package ptbs;

public class PersonFactory {
private static Person person;
	
	public static Person getPerson(int UserType)
	 {
		
		if(UserType== Facade.USER_BUYER) 
			
		{
			person = new Buyer();
		}else if(UserType == Facade.USER_SELLER) {
			person = new Seller();
		}
		
		return person;
	}

}
