package ptbs;
public class Buyer extends Person {

	@Override
	public void showMenu() 
	{
		System.out.println("\nProductMenu for Buyer\n---------------------");	
		theProductMenu.showMenu();
		chooseOption();
		
	}

	@Override
	public void createProductMenu(int prodType) {
		theProductMenu = ProductMenuFactory.getProductMenu(prodType);
		
	}

}
