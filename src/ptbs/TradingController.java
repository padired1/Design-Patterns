package ptbs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TradingController {
	public void viewTrading(Trading trading, int usertype) {
		
		trading.showTradingMenu(usertype);
	}
		
	public static Trading getDummyTrading() {
		
		try {
    		String filePath= "C:/Users/prath/OneDrive/Desktop/PTBS/SER515DesignPatterns/src/Database/UserProduct.txt";
        	File file = new File(filePath);    
            FileReader fr = new FileReader(file);
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
            		Offering sol= new Offering(s);
            		offList.add(sol);
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
