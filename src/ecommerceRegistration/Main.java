package ecommerceRegistration;

import java.util.concurrent.TimeUnit;

import ecommerceRegistration.businness.concretes.RegistrationManager;
import ecommerceRegistration.core.GoogleRegistrationAdapter;
import ecommerceRegistration.core.concretes.CheckManager;
import ecommerceRegistration.core.concretes.EmailVerifyManager;
import ecommerceRegistration.dataAccess.abstracts.UserDao;
import ecommerceRegistration.dataAccess.concretes.MemoryUserDao;
import ecommerceRegistration.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		
		RegistrationManager register = new RegistrationManager(new CheckManager(), new MemoryUserDao(), new EmailVerifyManager(), new GoogleRegistrationAdapter());
		
		
		User user1= new User(1,"Ömer Nuri","Tektaþ","omer123@gmail.com","123456");
		
		
		register.register(user1);
		
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		
		register.login("omer123@gmail.com", "123456");
		
		register.registerWithGoogle("omer@gmail.com", "123456");
		
		
	}

}
