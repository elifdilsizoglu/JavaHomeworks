package kodalamaio.javaCampProject.API.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodalamaio.javaCampProject.Business.Abstracts.EmployerService;
import kodalamaio.javaCampProject.Entities.Concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService service;

	public EmployersController(EmployerService service) {
		this.service = service;
	}
	@GetMapping("/list")
	public List<Employer> getAll(){
		return service.getall();
	}
	
}
