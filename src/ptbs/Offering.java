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
	
	public void setDesc(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}


}
