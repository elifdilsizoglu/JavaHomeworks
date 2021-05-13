package kodalamaio.javaCampProject.API.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodalamaio.javaCampProject.Business.Abstracts.PersonnelService;
import kodalamaio.javaCampProject.Entities.Concretes.Personnel;

@RestController
@RequestMapping("/api/personnels")
public class PersonnelsController {
	
	private PersonnelService service;
	
	@Autowired
	public PersonnelsController(PersonnelService service) {
		this.service = service;
	}
	
	@GetMapping("/list")
	public List<Personnel> getAll(){
		return service.getall();
	}
}
