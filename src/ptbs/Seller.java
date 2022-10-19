package ptbs;
public class Seller extends Person {

	@Override
	public void showMenu() {
		System.out.println("\n----------------------\nProductMenu for Seller (TYPE: "+getType(productType)+")");
		theProductMenu.showMenu();
		chooseOption();
		
	}

	@Override
	public void createProductMenu(int productLevelArg) {
		theProductMenu = ProductMenuFactory.getProductMenu(productLevelArg);
		
	}

}
