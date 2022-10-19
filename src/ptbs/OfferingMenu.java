package ptbs;
import java.util.List;
public class OfferingMenu {
	
	// Iterator design pattern
	public void reportOfferings(List<Offering> offerings) 
	{
		
		System.out.println("Following offerings are present");
		ListIterator offeringIterator = new OfferingIterator(offerings);
		while(offeringIterator.hasNext()) 
	{
			System.out.println(offeringIterator.next());
		}
	}

}
