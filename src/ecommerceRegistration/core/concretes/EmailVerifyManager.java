package ecommerceRegistration.core.concretes;

import ecommerceRegistration.core.abstracts.EmailVerifyService;
import ecommerceRegistration.entities.concretes.User;


public class EmailVerifyManager implements EmailVerifyService{

	@Override
	public void sendTheVerifyLinkToMail() {

		System.out.println("Mail g�nderildi");
		
	}

	@Override
	public void clickedToVerifyLink() {

		System.out.println("Hesap aktive oldu");

		
	}



}
