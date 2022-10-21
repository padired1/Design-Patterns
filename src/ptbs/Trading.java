package ptbs;
import java.util.ArrayList;
import java.util.List;

public class Trading {

	public List<Offering> offerings;
	public String name;
	public String exdt;
	public Trading(String n) {
		name= n;
		offerings = new ArrayList<Offering>();
	}
	
	public Trading() {
		
	}
	
	public void showTradingMenu(int userType) {
		
		
		System.out.println("The seller of the selected product is " + name);
		if (userType==Facade.SELLER) {
			showOffering();
		}
	}
	
	private void showOffering() {
		
		System.out.println("Offering\n------------------");
		
		// Iterator Pattern
		ListIterator it = new OfferingIterator(offerings);
		int index = 0;
		while(it.hasNext()) {
			System.out.println(++index+")"+it.next());
		}
		System.out.println("\n\n");
	}
	public List<Offering> getofferings() {
		return offerings;
	}
	public void setOffering(List<Offering> offerings) {
		this.offerings = offerings;
	}	
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitTrading(this);
	}
	
	}
