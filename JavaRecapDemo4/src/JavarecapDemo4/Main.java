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
		
		userManager1.register(validUser); // Ge�erli bilgiler ile kullan�c� kayd�
		userManager1.register(invalidUser1); // Kay�tl� email ile kullan�c� kayd�
		userManager1.register(invalidUser2); // Ge�ersiz bilgiler ile kullan�c� kayd�

		userManager2.register(validUser);

		userManager1.login("elif@gmail.com", "123456"); // Ge�erli bilgiler ile giri� yapma.
		userManager1.login("elif2@gmail.com", "123456"); // Ge�ersiz bilgiler ile giri� yapma.
	}
}
