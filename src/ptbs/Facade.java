package ptbs;
import java.util.List;
public class Facade {

	 public static int userType;
	 public static final int USER_BUYER = 0;
	 public static final int USER_SELLER = 1;
	
	 public static int nProductType;
	 public static final int MEAT_PRODUCT_TYPE = 0;
	 public static final int PRODUCE_PRODUCT_TYPE = 1;
	
	
	 public static List<Product> theProductList;
	
	 public Person thePerson;
		
	 private Login login;										
	 private ProductController productController;                  
	 private TradingController tradingController;
	private String theSelectedProduct;			
	 public Facade() {
		initResources();
	}
	
	 public void login() {
	 	login.login();
	 	createUser(userType);
	 }
	
	 // facade design pattern
	 public void addTrading(Trading trading, int usertype) 
	 {
		
	 	tradingController.viewTrading(trading, usertype);
	 }
	
	//facade design pattern 
	 public void viewTrading(Trading trading, int usertype) {

	 	tradingController.viewTrading(trading, usertype);
	 }
	
	 public void createUser(int usertype) {
	
	 	thePerson = PersonFactory.getPerson(usertype);
	 }
	
	
	 public void createProductList() {
	 	productController.createAllProducts();
	 }
	
	 public void selectProduct() {
	
	 	theSelectedProduct = productController.selectProduct(this);
	 }
	
	 public void productOperation() {
		 System.out.println(nProductType);	
	 	thePerson.createProductMenu(nProductType);
	 }
	
	private void initResources() {
		
		 login = new Login();
		 productController = new ProductController();
		 tradingController = new TradingController();
		 
	}

}
