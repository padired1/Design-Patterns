package ptbs;

public class PTBS {
public static void main(String[] args) {
		

		Facade facade = new Facade();
		facade.login();
		facade.createProductList();
		facade.selectProduct();
		facade.productOperation();
		facade.thePerson.showMenu();
		
		}

}
