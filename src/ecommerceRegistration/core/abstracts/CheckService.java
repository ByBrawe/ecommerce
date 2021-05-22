package ecommerceRegistration.core.abstracts;

import ecommerceRegistration.entities.concretes.User;

public interface CheckService {
	boolean firstNameCheck(User user);
	boolean lastNameCheck(User user);
	boolean passwordCheck(User user);
	boolean emailCheck(User user);
}
