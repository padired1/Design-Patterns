package ptbs;
public class Buyer extends Person {

	@Override
	public void showMenu() 
	{
		System.out.println("\n----------------------\nProductMenu for Buyer(Type: )"+getType(productType)+")");	
		theProductMenu.showMenu();
		chooseOption();
		System.out.println("----------------------");
	}

	@Override
	public void createProductMenu(int productTypeArg) {
		theProductMenu = ProductMenuFactory.getProductMenu(productTypeArg);
		
	}

}
