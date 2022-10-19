package ptbs;
import java.util.List;

public class Product {

	public String name;
	public List<Trading> tradings;
	
	public Product() {
		
	}
	
	public Product(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Trading> getTradings(){
		return tradings;
	}
	
	public void setTrading(List<Trading> tradings) {
		this.tradings = tradings;
	}
	
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitProduct(this);
	}
	
	@Override
	public String toString() {
		return name;
	}

}
