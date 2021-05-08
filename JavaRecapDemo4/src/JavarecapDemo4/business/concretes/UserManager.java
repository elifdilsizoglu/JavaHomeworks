package JavarecapDemo4.business.concretes;

import java.util.List;
import java.util.Scanner;

import JavarecapDemo4.business.abstracts.UserService;
import JavarecapDemo4.core.Abstracts.VerificationService;
import JavarecapDemo4.dataAccess.absracts.UserDao;
import JavarecapDemo4.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private VerificationService verificationService;
	public UserManager(UserDao userDao, VerificationService verificationService) {
		this.userDao = userDao;
		this.verificationService = verificationService;
	}

	/* BUSINESS RULES */
	private boolean CheckIfUserExist(String email) {
		var data = userDao.getByEmail(email);
		if(data == null) {
			return false;
		}
		return true;
	}
	/* BUSINESS METHODS */
	@Override
	public void register(User user) {
		var validateResults = verificationService.validate(user);
		if(validateResults.isEmpty()) {
			if(!CheckIfUserExist(user.getEmail())) {
				this.verificationCode(user.getEmail());
				userDao.register(user);
				System.out.println("Kullan�c� kaydedildi.");
			}
			else {
				System.out.println("Bu email daha �nce kullan�lm��t�r.");
			}
		}
		else {
			for (String validateResult : validateResults) {
				System.out.println(validateResult);
			}
		}
	}

	@Override
	public void delete(User user) {
		if(CheckIfUserExist(user.getEmail())) {
			userDao.delete(user);
		}else {
			System.out.println("kullan�c� bulunamad�");
		}
	}

	@Override
	public void update(User user) {
		var validateResults = verificationService.validate(user);
		if(validateResults.isEmpty()) {
			if(!CheckIfUserExist(user.getEmail())) {
				userDao.update(user);
				System.out.println("Kullan�c� g�ncellendi.");
			}
			else {
				System.out.println("Bu kay�tl� de�ildir.");
			}
		}
		else {
			for (String validateResult : validateResults) {
				System.out.println(validateResult);
			}
		}
		
	}

	@Override
	public User login(String email, String password) {
		var user = userDao.login(email, password);
		if(user != null) {
			System.out.println("Kullan�c� ba�ar�yla giri� yapt�.");
			return user;
		}
		System.out.println("Kullan�c� bulunamad�.");
		return null;
	}

	@Override
	public void verificationCode(String email) {
		Scanner reader = new Scanner(System.in);
		int code = 100000 + (int)(Math.random()*899999);
		int userCode;
		System.out.println(email + " adresine g�nderilen 6 haneli kodu giriniz.");
		while(true) {
			System.out.print(code + " : ");
			userCode = reader.nextInt();
			if(userCode == code) {
				break;
			}
			System.out.println();
		}
	}

}
