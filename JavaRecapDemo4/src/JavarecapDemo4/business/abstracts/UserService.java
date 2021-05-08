package JavarecapDemo4.business.abstracts;

import JavarecapDemo4.entities.concretes.User;

public interface UserService {
	void register(User user);
	void delete(User user);
	void update(User user);
	User login(String email,String password);
	void verificationCode(String email);
}
