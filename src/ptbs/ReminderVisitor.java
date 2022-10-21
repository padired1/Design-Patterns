package ptbs;
import java.util.List;
public class ReminderVisitor extends NodeVisitor {

	@SuppressWarnings("unused")
	private Reminder m_Reminder;

    private ListIterator itr; 
    public ReminderVisitor() {}
	public ReminderVisitor(Reminder remind)
	{
		this.m_Reminder=remind;
	}
	@Override
	public void visitFacade(Facade facade) {
		//visitor DP
		List<Product> product = Facade.theProductList;
		itr = new ProductIterator(product);
		int index = 0;
		while(itr.hasNext()) {
			System.out.println(++index +")"+itr.next());
		}

	}

	@Override
	public void visitProduct(Product product) {
		//visitor DP
		System.out.println("All trading in "+product.getName()+"\n-------------------------");
		List<Trading> trading =  product.getTradings();
		for(int i=0;i<trading.size();i++) {
			System.out.println(i+") "+trading.get(i).name);
		}
	}


	@Override
	public void visitTrading(Trading trading) {
		
		System.out.println("Expiry date for "+trading.name+" is "+trading.exdt);
	}
}
