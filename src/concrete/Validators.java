package concrete;

import entities.Customer;

public class Validators {

	
	public static boolean userValidator(Customer customer) {
		
		if(customer.getUserName().length() > 6 && customer.getPassword().length() > 8) {
			return true;
		}
		return false;
		
	}
	
 
	public static boolean updateValidator(Customer customer) {
		
		if(customer.getPassword().length() > 8) {
			return true;
		}
			
		return false;
	}
	
	
}

