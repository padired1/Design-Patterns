package ptbs;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductController {
	private List<Product> productList;
	private Scanner sc = new Scanner(System.in);
	
	public void createAllProducts() {
		
		Facade.theProductList = getProductList();
		
	}
	
	public List<Product> getAllProducts() {
		 return productList;
	}
	
	
	public String selectProduct(Facade facade) {
		System.out.println("Select Product");
		showAllProducts(facade);
		int s;
		do {
			 s = sc.nextInt();
		}while(!checkinputValidity(1, 5, s ));
		String selectedProduct = productList.get(s-1).name;
		
		System.out.println("Select Type");
		showProductType();
		do {
			Facade.nProductType = sc.nextInt();
		}while(!checkinputValidity(0, 1, Facade.nProductType));
		System.out.println("Selected Product is: "+selectedProduct+" ("+getproductType(Facade.nProductType)+")");
		return  selectedProduct;
	}	
	
	
	private void showAllProducts(Facade facade) {
		
		Reminder reminder = new Reminder();
		reminder.visitFacade(facade);
		
	}
	
	private String getproductType(int selection) {
		
		String productType = null;
		switch(selection) {
		case Facade.PRODUCE_PRODUCT_TYPE:
		productType = "PRODUCE";
		break;
		
		case Facade.MEAT_PRODUCT_TYPE:
			productType = "MEAT";
			break;
			
		default:
			break;
		}
		
		return productType;
	}
	
	private void showProductType() {
		System.out.println("0)MEAT\n1)PRODUCE");
	}
	
	private boolean checkinputValidity(int low,int high, int input) {
		if(input<=high && input >=low) {
			return  true;
		}else {
			System.out.println("Invalid Input! Type your input again");
			return false;
		}
	}
	
	private List<Product> getProductList() {
		
		productList = new ArrayList<Product>();
		
    	try {
    		String filePath= "C:/Users/prath/OneDrive/Desktop/Database/ProductInfo.txt";
        	File f = new File(filePath);    
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while((line=br.readLine())!=null)  
            { 
            	Product c= new Product(line);
            	productList.add(c);
            }  
            fr.close();    
            System.out.println(sb.toString()); 
            return productList;

        } 	catch(IOException e)
            {
        		e.printStackTrace();
            }
    		return null;
	}
}
