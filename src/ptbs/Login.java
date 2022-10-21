package ptbs;
import java.io.*; 
import java.util.*;

public class Login {
	private Scanner sc = new Scanner(System.in); 
	private String username;
	private HashMap<String, String> buyerCredentials;
	private HashMap<String, String> sellerCredentials;
	
    public void login() {
        loadUserCredentials();
        chooseUserType();
        enterCredentials(Facade.userType);
    }
    
    private HashMap<String, String> getCredentialsFromFile(String filePath){
    	try {
        	File f = new File(filePath);    
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            HashMap<String, String> credentials = new HashMap<String, String>();
            while((line=br.readLine())!=null)  
            {  
            	String[] creds = line.split(":");
            	credentials.put(creds[0], creds[1]);
       
            }  
            fr.close();     
            return credentials;

       } 	catch(IOException e)
            {
        		e.printStackTrace();
            }
    		return null;
    }
    
    private void loadUserCredentials(){
    	HashMap<String, String> buyerCredentials = getCredentialsFromFile("C:/Users/prath/OneDrive/Desktop/Database/BuyerInfo.txt/");
    	this.buyerCredentials = buyerCredentials;
    	
    	HashMap<String, String> sellerCredentials = getCredentialsFromFile("C:/Users/prath/OneDrive/Desktop/Database/SellerInfo.txt/");
    	this.sellerCredentials = sellerCredentials;
    }

    private boolean validateUserType(int userType) {
		if(userType==Facade.BUYER || userType==Facade.SELLER) {
			return true;
		}else {
			System.out.println("Invalid Input! Please give your input again");
			return false;
		}
	}

    @SuppressWarnings("unused")
	private void showLoginPage(int usertype) {
		
		switch(usertype) {
		
		case Facade.BUYER:
			System.out.println("Logged in  as a Buyer");
			break;
		    
		case Facade.SELLER:
			System.out.println("Logged in as a Seller");	
			break;
			
		default: 
			break;
			
		}
		
		enterCredentials(usertype);
		
	}

    private void setUserType(int user_type) {
    	Facade.userType = user_type;
	}

    private void chooseUserType() {
		int usertype;
		System.out.println("Welcome to Product Trading and Bidding System!!!!!");
		System.out.println("0)Buyer\n1)Seller");
		System.out.println("Please select an option");
		
		do {
			usertype = sc.nextInt();
		}
		while(!validateUserType(usertype));
        setUserType(usertype);
	}
	


    	
	private void enterCredentials(int userType) {
		String password;
		
		sc.nextLine();
		
		do {
			System.out.println("Enter UserName: ");
			username = sc.next();
			System.out.println("Enter Password: ");
			password = sc.next();
			
		}while(!validateCredentials(username, password, userType));
	}
	
	private boolean validateBuyerCredentials(String username, String password) {
	
		if(!this.buyerCredentials.containsKey(username)) {
			System.out.println("Invalid Credentials, Login Failed!!");
    		return false;
    	
    	}
    	
    	if(this.buyerCredentials.get(username).equals(password)) {
    		System.out.println("Login Succcesful");
    		return true;
    	}
    	return false;
	}
	
	private boolean validateSellerCredentials(String username, String password) {
		
		if(!this.sellerCredentials.containsKey(username)) {
			System.out.println("Invalid Credentials, Login Failed!!");
    		return false;
    	
    	}
    	
    	if(this.sellerCredentials.get(username).equals(password)) {
    		System.out.println("Login Succcesful");
    		return true;
    	}
    	return false;
	}


    private boolean validateCredentials(String username, String password, int userType) {
    	
    	if(userType==0) 
    	{
    		return validateBuyerCredentials(username, password);
    	}else{
    		return validateSellerCredentials(username, password);
    	}

    	}

}
