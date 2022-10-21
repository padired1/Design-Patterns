package ptbs;
import java.util.List;
public class ProductIterator extends ListIterator {

	private int curNum=-1;
	private List<Product> productList;
	
	// Iterator design pattern 
	public ProductIterator(List<Product> products)
	{
		productList = products;
	}
	@Override
	public boolean hasNext() {
		if (curNum >= productList.size()-1) {
			return false; 
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() 
	{
		if ( hasNext() == true) 
		{
			curNum ++; 
			return productList.get(curNum);
		}
		else {
			return null;
		}
	}

	@Override
	public void remove()
	{
		productList.remove(curNum);
		
	}

	@Override
	public void moveToHead() {
		curNum = 0; 
		
	}

}
