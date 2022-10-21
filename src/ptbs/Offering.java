package ptbs;
public class Offering {

public String description;
	
	public Offering() 
	{
		
	}
	
	public Offering(String description) {
		this.description = description;
	}
	public String getDesc() 
	{
		return description;
	}
	@Override
	public String toString() 
	{
		return description;
	}
}
