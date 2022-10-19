package ptbs;
import java.util.List;
public class OfferingIterator extends ListIterator {

	int currentNum;
	private List<Offering> offeringList;
	
	public OfferingIterator(List<Offering> offList)
	
	{
		
		offeringList = offList;
		
	}
	
	@Override
	public boolean hasNext() {
		if (currentNum >= offeringList.size()-1) {
			return false; 
		}
		else {
			return true;
		}
	 }

	@Override
	public Object next() {
		if ( hasNext() == true) {
			currentNum += 1; 
			return offeringList.get(currentNum);
		}
		else {
			return null;
		}
	}

	@Override
	public void Remove() 
	{
		offeringList.remove(currentNum);
		
	}

	@Override
	public void MoveToHead() 
	{
		currentNum = 0; 
		
	}

}
