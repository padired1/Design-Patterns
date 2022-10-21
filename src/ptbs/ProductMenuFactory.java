package ptbs;

public class ProductMenuFactory {
private static ProductMenu productMenu;
	
	public static ProductMenu getProductMenu(int product_Type) 
	{
		
		if(product_Type == Facade.PRODUCE_PRODUCT_TYPE) 
		{
			productMenu = new ProduceProductMenu();
		}
		else if(product_Type == Facade.MEAT_PRODUCT_TYPE) {
			productMenu = new MeatProductMenu();
		}
		
		return productMenu;
	}

}
