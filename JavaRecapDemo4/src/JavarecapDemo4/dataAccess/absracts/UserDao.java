package JavarecapDemo4.dataAccess.absracts;

import JavarecapDemo4.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void delete(User user);
	void update(User user);
	User login(String email,String password);
	User getByEmail(String email);
}
