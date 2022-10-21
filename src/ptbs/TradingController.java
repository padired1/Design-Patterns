package ptbs;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;


public class TradingController {
	public void viewTrading(Trading trading, int user_type) {
		
		trading.showTradingMenu(user_type);
	}
		
	public static Trading getTrading() {
		
		try {
    		String filePath= "C:/Users/prath/OneDrive/Desktop/Database/UserProduct.txt";
        	File f = new File(filePath);    
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            List<Offering> offList = new ArrayList<Offering>();
            
            Trading a= new Trading();
            while((line=br.readLine())!=null)  
            { 
            	String[] tradingDetails = line.split(":");
            	a= new Trading(tradingDetails[0]);
            	String[] offeringDetails =tradingDetails[1].split(",");
            	
            	for (String s:offeringDetails) {
            		Offering offerings= new Offering(s);
            		offList.add(offerings);
            	}
            	a.setOffering(offList);
            	
            }  
           
            fr.close();  
            System.out.println(sb.toString()); 
            return a;

        } 	catch(IOException e)
            {
        		e.printStackTrace();
            }
    		return null;
	}
	


}
