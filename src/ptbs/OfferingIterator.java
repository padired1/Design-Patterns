package ptbs;
import java.util.List;
public class OfferingIterator extends ListIterator {

	int count=0;
	private List<Offering> offeringList;
	
	public OfferingIterator(List<Offering> offList)
	
	{
		
		offeringList = offList;
		
	}
	
	@Override
	public boolean hasNext() {
		if (count>= offeringList.size()-1) {
			return false; 
		}
		else {
			return true;
		}
	 }

	@Override
	public Object next() {
		if ( hasNext() == true) {
			count += 1; 
			return offeringList.get(count);
		}
		else {
			return null;
		}
	}

	@Override
	public void remove() 
	{
		offeringList.remove(count);
		
	}

	@Override
	public void moveToHead() 
	{
		count = 0; 
		
	}

}
