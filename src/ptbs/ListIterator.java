package ptbs;
import java.util.Iterator;
public abstract class ListIterator implements Iterator<Object>
{
    public abstract boolean hasNext();
	
	public abstract Object next();
	
	public abstract void remove();
	
	public abstract void moveToHead();

}
