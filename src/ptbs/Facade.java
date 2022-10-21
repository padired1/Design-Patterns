package ptbs;
import java.util.List;
public class Facade {

	 public static int userType;
	 public static final int BUYER = 0;
	 public static final int SELLER = 1;
	 @SuppressWarnings("unused")
	private String theSelectedProduct;
	 public  static int nProductType;
	 public static final int MEAT_PRODUCT_TYPE = 0;
	 public static final int PRODUCE_PRODUCT_TYPE = 1;
	 public static List<Product> theProductList;
	
	 public Person thePerson;
		
	 private Login login;										
	 private ProductController theprodController;                  
	 private TradingController thetradingController;			
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
		
	 	thetradingController.viewTrading(trading, usertype);
	 }
	
	//facade design pattern 
	 public void viewTrading(Trading trading, int usertype) {

	 	thetradingController.viewTrading(trading, usertype);
	 }
	 public void decideBidding()
	 {
		 
	 }
	 public void discussBidding() 
	 {
		 
	 }
	 public void submitBidding()
	 {
		 
	 }
	 public void remind()
	 {
		 @SuppressWarnings("unused")
		Reminder remind= new Reminder();
	 }
	 
	 public void createUser(int usertype) {
	
	 	thePerson = PersonFactory.getPerson(usertype);
	 }
	
	
	 public void createProductList() {
	 	theprodController.createAllProducts();
	 }
	
	 public void selectProduct() {
		 	theSelectedProduct = theprodController.selectProduct(this);
	 }
	
	 public void productOperation() {
		 System.out.println(nProductType);	
	 	thePerson.createProductMenu(nProductType);
	 }
	 public void attachProductToUser()
	 {
		 
	 }
	
	private void initResources() {
		
		 login = new Login();
		 theprodController = new ProductController();
		 thetradingController = new TradingController();
		 
	}

}
