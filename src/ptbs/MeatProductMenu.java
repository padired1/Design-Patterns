package ptbs;
public class MeatProductMenu implements ProductMenu {

	
	@Override
	public void showMenu() {
		//bridge pattern 
		showAddButton();
		showViewButton();
		showRadioButton();
		showLabels();
		showComboxes();
		System.out.println("\n--------------------\nSelect an option");
		
	}

	// factory method design pattern 
		//bridge pattern
		@Override
		public void showAddButton() {
			System.out.println("1.Add Trading - Meat Product");
			
		}

		@Override
		public void showViewButton() {
			System.out.println("2.View Trading - Meat Product");
			
		}

		@Override
		public void showRadioButton() {
			System.out.println("3.Radios - Meat Product ");
			
		}

		@Override
		public void showLabels() {
			System.out.println("4.Labels - Meat Product");
			
		}

		
		@Override
		public void showComboxes() {
			System.out.println("5.Combox - Meat Product");
			
		}

}
