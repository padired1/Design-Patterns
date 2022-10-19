package ptbs;
import java.util.List;
public class Reminder {
private NodeVisitor nodeVisitor;
	
	public Reminder(){
		nodeVisitor = new ReminderVisitor();
	}
	// visitor design pattern
	public void visitFacade(Facade facade) {
		nodeVisitor.visitFacade(facade);
	}
	// visitor design pattern
	public void visitProduct(Product product) {
		product.accept(nodeVisitor);
	}
	// visitor design pattern 
	public void visitTrading(Trading trading) {
		trading.accept(nodeVisitor);
	}
	
	public void remind(List<Trading> tradings) {
		
		System.out.println("Pending tradings");
		for(Trading trading : tradings) {
			trading.accept(nodeVisitor);
		}
		
	}

}
