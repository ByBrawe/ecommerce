package ecommerceRegistration.dataAccess.abstracts;

import java.util.List;


import ecommerceRegistration.entities.concretes.User;

public interface UserDao {
		
	void add(User user);
	void delete(User user);
	List<User> getAll();
	boolean emailControl(User user);

}
