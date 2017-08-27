package test_case;

public class Main implements ExchangeCredentials {

	public static void main(String[] args) {
	
	    String originalString = secret;
	    String encryptedString = AES.encrypt(originalString, key) ;
	    String decryptedString = AES.decrypt(encryptedString, key) ;
	     
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);

	}

}
