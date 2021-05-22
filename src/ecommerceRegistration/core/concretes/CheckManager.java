package ecommerceRegistration.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ecommerceRegistration.core.abstracts.CheckService;
import ecommerceRegistration.entities.concretes.User;

public class CheckManager implements CheckService{

	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	@Override
	public boolean firstNameCheck(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("Ad en az iki karakterden oluþmaktadýr. ");
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(User user) {
		if(user.getLastName().length()<2) {
			System.out.println("Soyad en az iki karakterden oluþmaktadýr. ");
			return false;
		}
		return true;
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az iki karakterden oluþmaktadýr. ");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean emailCheck(User user) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(!matcher.matches()) {
			System.out.println("Email formatý yanlýþ.");
			return false;
		}
		return true;

	
}
}
