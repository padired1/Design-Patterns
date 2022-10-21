package ptbs;
public class Reminder {
private NodeVisitor nodeVisitor;
	
	public Reminder(){
		nodeVisitor = new ReminderVisitor();
	}
	// visitor Design Pattern
	public void visitFacade(Facade facade) {
		nodeVisitor.visitFacade(facade);
	}
	// visitor Design Pattern
	public void visitProduct(Product product) {
		product.accept(nodeVisitor);
	}
	// visitor Design Pattern 
	public void visitTrading(Trading trading) {
		trading.accept(nodeVisitor);
	}
}
