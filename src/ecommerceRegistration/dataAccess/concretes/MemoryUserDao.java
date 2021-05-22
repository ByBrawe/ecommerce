package ecommerceRegistration.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;


import ecommerceRegistration.dataAccess.abstracts.UserDao;
import ecommerceRegistration.entities.concretes.User;

public class MemoryUserDao implements UserDao{

	public List<User> userDB = new ArrayList<User>();

	@Override
	public void add(User user) {
		
		this.userDB.add(user);
		System.out.println("Kullanýcý veritabanýna eklendi.");
		
	}

	@Override
	public void delete(User user) {
		this.userDB.remove(user);
		System.out.println("Kullanýcý veritabaný'ndan silindi.");
		
	}

	@Override
	public List<User> getAll() {
		
		return this.userDB;
	}
	
	@Override
	public boolean emailControl(User user) {
		
		for (User person : userDB) {
			if(person.getEmail() == user.getEmail()) {
				return false;
			}

		}
		return true;

	}


	
	
}
