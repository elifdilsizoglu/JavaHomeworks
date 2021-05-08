package JavarecapDemo4.dataAccess.concretes;

import java.util.List;

import JavarecapDemo4.entities.concretes.User;

public class UserDao implements JavarecapDemo4.dataAccess.absracts.UserDao {

	private List<User> users;

	public UserDao(List<User> users) {
		this.users = users;
	}

	@Override
	public void register(User user) {
		users.add(user);
	}

	@Override
	public void delete(User user) {
		int index = users.indexOf(user);
		users.remove(index);
	}

	@Override
	public void update(User user) {
		int index = 0;
		for (User userData : users) {
			if(userData.getEmail() == user.getEmail()) {
				break;
			}
			index++;
		}
		users.add(index, user);
	}

	@Override
	public User login(String email, String password) {
		int index = 0;
		for (User userData : users) {
			if (userData.getEmail() == email && userData.getPassword() == password) {
				return users.get(index);
			}
			index++;
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User userData : users) {
			if (userData.getEmail() == email) {
				return userData;
			}
		}
		return null;
	}

}
