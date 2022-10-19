package ptbs;
import java.util.List;
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

private ListIterator iterator; 
	
	@Override
	public void visitFacade(Facade facade) {
		//visitor design pattern
		List<Product> products = Facade.theProductList;
		iterator = new ProductIterator(products);
		int index = 0;
		while(iterator.hasNext()) {
			System.out.println(++index+")) "+iterator.next());
		}

	}

	@Override
	public void visitProduct(Product product) {
		//visitor design pattern
		System.out.println("All trading in "+product.getName()+"\n-------------------------");
		List<Trading> trading =  product.getTradings();
		for(int i=0;i<trading.size();i++) {
			System.out.println(i+") "+trading.get(i).name);
		}
	}


	@Override
	public void visitTrading(Trading trading) {
		
		System.out.println("Exp date for "+trading.name+" is "+trading.expdate);
	}
}
