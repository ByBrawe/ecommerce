package ecommerceRegistration.core;

import ecommerceRegistration.GoogleRegistration.GoogleRegistrationManager;
import ecommerceRegistration.core.abstracts.GoogleRegistrationService;

public class GoogleRegistrationAdapter implements GoogleRegistrationService{

	@Override
	public void registerWithGoogle(String email, String password) {
		GoogleRegistrationManager googleRegister = new GoogleRegistrationManager();
		googleRegister.registerWithGoogle(email, password);
		
		
	}
	
	
	

	
}
