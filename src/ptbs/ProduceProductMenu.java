package ptbs;
public class ProduceProductMenu implements ProductMenu 
{
	@Override
	public void showMenu() {
		System.out.println("ProductMenu\n----------------");
		//bridge pattern 
		showAddButton();
		showViewButton();
		showRadioButton();
		showLabels();
		showComboxes();
		System.out.println("--------------------\nSELECT OPTION");
		
	}


	// factory method design pattern
		//bridge pattern
		@Override
		public void showAddButton() 
		{
			System.out.println("1) Add Trading: Produce Menu ");
			
		}

		@Override
		public void showViewButton() {
			System.out.println("2) Show Trading: Produce Menu");
			
		}

		@Override
		public void showRadioButton() {
			System.out.println("3) Radios: Produce Menu");
			
		}

		@Override
		public void showLabels() {
			System.out.println("4) Labels: Produce Menu");
			
		}
		@Override
		public void showComboxes() {
			System.out.println("5) Combox:Produce Product");
			
		}


}
