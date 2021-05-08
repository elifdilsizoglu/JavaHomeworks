package JavarecapDemo4;

import java.util.*;

import JavarecapDemo4.business.abstracts.UserService;
import JavarecapDemo4.business.concretes.UserManager;
import JavarecapDemo4.core.Concretes.GoogleVerificationAdaptor;
import JavarecapDemo4.core.Concretes.UserValidator;
import JavarecapDemo4.dataAccess.concretes.UserDao;
import JavarecapDemo4.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		UserService userManager1 = new UserManager(new UserDao(users), new UserValidator());
		UserService userManager2 = new UserManager(new UserDao(users), new GoogleVerificationAdaptor());

		User validUser = new User(1,"Elif","Dilsizoglu","elif.com","123456");
		User invalidUser1 = new User(2,"Elif2","Dilsizoglu2","elif@gmail.com","123456");
		User invalidUser2 = new User(3,"E","Dilsizoglu2","elif2@gmail.com","12456");
		
		userManager1.register(validUser); // Geçerli bilgiler ile kullanýcý kaydý
		userManager1.register(invalidUser1); // Kayýtlý email ile kullanýcý kaydý
		userManager1.register(invalidUser2); // Geçersiz bilgiler ile kullanýcý kaydý

		userManager2.register(validUser);

		userManager1.login("elif@gmail.com", "123456"); // Geçerli bilgiler ile giriþ yapma.
		userManager1.login("elif2@gmail.com", "123456"); // Geçersiz bilgiler ile giriþ yapma.
	}
}
