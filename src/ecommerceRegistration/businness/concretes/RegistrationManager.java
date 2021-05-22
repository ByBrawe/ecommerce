package ecommerceRegistration.businness.concretes;

import ecommerceRegistration.businness.abstracts.RegistrationService;

import ecommerceRegistration.core.abstracts.CheckService;
import ecommerceRegistration.core.abstracts.EmailVerifyService;
import ecommerceRegistration.core.abstracts.GoogleRegistrationService;
import ecommerceRegistration.dataAccess.abstracts.UserDao;
import ecommerceRegistration.entities.concretes.User;

public class RegistrationManager implements RegistrationService{

	private CheckService checkService;
	private UserDao userDao;
	private EmailVerifyService emailService;
	private GoogleRegistrationService googleService;

	public RegistrationManager() {
		
	};


	public RegistrationManager(CheckService checkService, UserDao userDao, EmailVerifyService emailService, GoogleRegistrationService googleService) {
		super();
		this.checkService = checkService;
		this.userDao = userDao;
		this.emailService = emailService;
		this.googleService = googleService;
		
	}



	@Override
	public void register(User user) {
		
		if(!userDao.emailControl(user)) {
			
			
			System.out.println("Bu e-posta adresine ait bir hesabýnýz fark ettik. : " + user.getEmail());
			

			
			
		}
		
		if(checkService.emailCheck(user)) {
			
			System.out.println("Mail doðru");
			
			
		}else {
			
			return;
			
		}
		
		
		
		if(checkService.firstNameCheck(user)) {
			
			System.out.println("Ýsim Doðru");
			
			
		}else {
			
			return;
			
		}
		
		
		
		if(checkService.lastNameCheck(user)) {
			
			System.out.println("Soyadý doðru");
			
			
		}else {
			
			return;
			
		}
		
		
		if(checkService.passwordCheck(user)) {
			
			System.out.println("Þifre doðru");
			
			
		}else {
			
			return;
			
		}
		
		
		emailService.sendTheVerifyLinkToMail();
		emailService.clickedToVerifyLink();
		
		userDao.add(user);
		
		
		

	}
	
	

	@Override
	public void login(String email, String password) {
		

			for(User user:userDao.getAll()) {
				if(email == user.getEmail() && password == user.getPassword()) {
					System.out.println("Giriþ Baþarýlý HoÞgeldiniz : " + user.getFirstName() + " " + user.getLastName());
					return;
				}else {
				System.out.println("Kullanýcý adý veya þifre yanþoi. Lütfen Tekrar Deneyiniz!");
				}
				
			}

	}


	@Override
	public void registerWithGoogle(String email, String password) {

		googleService.registerWithGoogle(email, password);

		
		
	}

	
}


		
