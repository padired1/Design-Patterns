package ptbs;
public class Seller extends Person {

	@Override
	public void showMenu() {
		System.out.println("ProductMenu for Seller ");
		theProductMenu.showMenu();
		chooseOption();
		
	}

	@Override
	public void createProductMenu(int productLevel) {
		theProductMenu = ProductMenuFactory.getProductMenu(productLevel);
		
	}

}
