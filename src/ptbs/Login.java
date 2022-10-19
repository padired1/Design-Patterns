package ptbs;
import java.io.*; 
import java.util.*;

public class Login {
	private Scanner sc = new Scanner(System.in); 
	private String username;
	private HashMap<String, String> buyerCreds;
	private HashMap<String, String> sellerCreds;
	
    public void login() {
        loadUserCredentials();
        chooseUserType();
        enterCredential(Facade.userType);
    }
    
    private HashMap<String, String> getCredentialsFromFile(String filePath){
    	try {
        	File file = new File(filePath);    
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            HashMap<String, String> credentials = new HashMap<String, String>();
            while((line=br.readLine())!=null)  
            {  
            	String[] creds = line.split(":");
            	credentials.put(creds[0], creds[1]);
       
            }  
            fr.close();  
            System.out.println("File Content: ");  
            System.out.println(sb.toString()); 
            return credentials;

       } 	catch(IOException e)
            {
        		e.printStackTrace();
            }
    		return null;
    }
    
    private void loadUserCredentials(){
    	HashMap<String, String> buyerCreds = getCredentialsFromFile("C:/Users/prath/OneDrive/Desktop/PTBS/SER515DesignPatterns/src/Database/BuyerInfo.txt/");
    	this.buyerCreds = buyerCreds;
    	
    	HashMap<String, String> sellerCreds = getCredentialsFromFile("C:/Users/prath/OneDrive/Desktop/PTBS/SER515DesignPatterns/src/Database/SellerInfo.txt/");
    	this.sellerCreds = sellerCreds;
    }

    private boolean validateUserType(int userType) {
		if(userType==Facade.USER_BUYER || userType==Facade.USER_SELLER) {
			return true;
		}else {
			System.out.println("Invalid Input! Please type your input again");
			return false;
		}
	}

    @SuppressWarnings("unused")
	private void showLoginPage(int usertype) {
		
		switch(usertype) {
		
		case Facade.USER_BUYER:
			System.out.println("You are entering as a Buyer");
			break;
		    
		case Facade.USER_SELLER:
			System.out.println("You are entering as an Seller");	
			break;
			
		default: 
			break;
			
		}
		
		enterCredential(usertype);
		
	}

    private void setUserType(int usertype) {
    	Facade.userType = usertype;
	}

    private void chooseUserType() {
		int usertype;
		System.out.println("Welcome to PTBS System");
		System.out.println("You are? \n0) Buyer\n1) Seller");
		
		do {
			usertype = sc.nextInt();
		}
		while(!validateUserType(usertype));
        setUserType(usertype);
	}
	


    	
	private void enterCredential(int userType) {
		String password;
		
		sc.nextLine();
		
		do {
			System.out.println("Enter your username here: ");
			username = sc.next();
			System.out.println("Enter your password here: ");
			password = sc.next();
			
		}while(!validateCredentials(username, password, userType));
	}
	
	private boolean validateBuyerCredentials(String username, String password) {
	
		if(!this.buyerCreds.containsKey(username)) {
    		
    		return false;
    	
    	}
    	
    	if(this.buyerCreds.get(username).equals(password)) {
    		return true;
    	}
    	return false;
	}
	
	private boolean validateSellerCredentials(String username, String password) {
		
		if(!this.sellerCreds.containsKey(username)) {
    		
    		return false;
    	
    	}
    	
    	if(this.sellerCreds.get(username).equals(password)) {
    		return true;
    	}
    	return false;
	}


    private boolean validateCredentials(String username, String password, int userType) {
    	System.out.println(userType);
    	if(userType==0) 
    	{
    		return validateBuyerCredentials(username, password);
    	}else{
    		return validateSellerCredentials(username, password);
    	}

    	}

}
