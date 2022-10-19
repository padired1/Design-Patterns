package ptbs;
import java.util.List;
import java.util.Scanner;

public abstract class Person {

	protected ProductMenu theProductMenu;
	protected int productType;
	private Scanner sc = new Scanner(System.in);
	protected List<Product> productList;
		
	public abstract void showMenu();
	
	public abstract void createProductMenu(int productTypeArg);
	
	public void showAddButton() {
		Facade f = new Facade();
		f.addTrading(TradingController.getDummyTrading(), Facade.userType);
	}
	
	public void showViewButton() {
		Facade f = new Facade();
		f.viewTrading(TradingController.getDummyTrading(), Facade.userType);
	}
	
	public void showRadios() {
		System.out.println("Clicked on Radio Button");
	}
	
	public void showComboxes() {
		System.out.println("Clicked on ComBox");
	}
	
	public void showLabels() {
		System.out.println("Clicked on Label");
	}
	
	public void setproductType(int productType) {
		this.productType = productType;
		showMenu();
	}
	
	public ProductMenu getProductMenu() {
		return theProductMenu;
	}
	
	public void chooseOption() {
		
		int selection = sc.nextInt();
		switch(selection) {
		case 1:
			showAddButton();
			break;
			
		case 2:
			showViewButton();
			break;
			
		case 3:
			showRadios();
			break;
		case 4:
			showLabels();
			break;
			
		case 5:
			showComboxes();
			break;
			
		default:
			break;
			
		}
		
	}
	
	protected String getType(int type) {
		if(productType == Facade.MEAT_PRODUCT_TYPE)
			return "MEAT";
		else if(productType == Facade.PRODUCE_PRODUCT_TYPE)
			return "PRODUCE";
		else
			return null;

	}
	
	public void addProduct(Product product) {
		System.out.println(product+" Added");
	}

}
