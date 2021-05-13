package kodalamaio.javaCampProject.Business.Abstracts;

import java.util.List;

import kodalamaio.javaCampProject.Entities.Concretes.User;

public interface UserService {
	List<User> getall();
	void add(User entity);
	void delete(int id);
	void update(User entity);
}
