package ptbs;
import java.util.ArrayList;
import java.util.List;

public class Trading {

	public String name;
	public String expdate;
	public String description;
	public List<Offering> offerings;
	
	public Trading(String n) {
		name= n;
		offerings = new ArrayList<Offering>();
	}
	
	public Trading() {
		
	}
	
	public void showTradingMenu(int userType) {
		
		
		System.out.println("Name: " + name);
		if (userType==Facade.USER_SELLER) {
			showtheOffering();
		}
	}
	
	private void showtheOffering() {
		
		System.out.println("Below are the offerings\n------------------");
		
		// Iterator Pattern
		ListIterator it = new OfferingIterator(offerings);
		int index = 0;
		while(it.hasNext()) {
			System.out.println(++index+") "+it.next());
		}
		System.out.println("\n\n");
	}
		
	public Trading(String name, String expdate) {
			this.name = name;
			this.expdate = expdate;
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Offering> getofferings() {
		return offerings;
	}
	public void setOffering(List<Offering> offerings) {
		this.offerings = offerings;
	}
	public String getExpdate() {
		return expdate;
	}

	public void setDuedate(String expdate) {
		this.expdate = expdate;
	}
	
	
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitTrading(this);
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Trading: "+name+"\n"+"Exp Date: "+expdate+"\n\n"+description;
	}

}
