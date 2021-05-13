package kodalamaio.javaCampProject.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodalamaio.javaCampProject.Business.Abstracts.UserService;
import kodalamaio.javaCampProject.DataAccess.Abstracts.UserDao;
import kodalamaio.javaCampProject.Entities.Concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getall() {
		return userDao.findAll();
	}

	@Override
	public void add(User entity) {
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

}
