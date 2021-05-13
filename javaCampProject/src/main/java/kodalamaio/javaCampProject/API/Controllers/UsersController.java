package kodalamaio.javaCampProject.API.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodalamaio.javaCampProject.Business.Abstracts.UserService;
import kodalamaio.javaCampProject.Entities.Concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService service;

	@Autowired
	public UsersController(UserService service) {
		this.service = service;
	}

	@GetMapping("/list")
	public List<User> getAll() {
		return service.getall();
	}

}
