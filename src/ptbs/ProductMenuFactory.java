package ptbs;

public class ProductMenuFactory {
private static ProductMenu productMenu;
	
	public static ProductMenu getProductMenu(int productType) 
	{
		
		if(productType == Facade.PRODUCE_PRODUCT_TYPE) 
		{
			productMenu = new ProduceProductMenu();
		}
		else if(productType == Facade.MEAT_PRODUCT_TYPE) {
			productMenu = new MeatProductMenu();
		}
		
		return productMenu;
	}

}
