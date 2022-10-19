package ptbs;
import java.util.List;
public class ProductIterator extends ListIterator {

	private int curNum;
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
			curNum += 1; 
			return productList.get(curNum);
		}
		else {
			return null;
		}
	}

	@Override
	public void Remove()
	{
		productList.remove(curNum);
		
	}

	@Override
	public void MoveToHead() {
		curNum = 0; 
		
	}

}
