package ecommerceRegistration.businness.abstracts;

import ecommerceRegistration.entities.concretes.User;

public interface RegistrationService {
	
	void register(User user);
	void login(String email, String password);
	void registerWithGoogle(String email, String password);
	
}
