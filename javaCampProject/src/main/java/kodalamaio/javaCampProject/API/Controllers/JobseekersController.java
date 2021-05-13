package kodalamaio.javaCampProject.API.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodalamaio.javaCampProject.Business.Abstracts.JobseekerService;
import kodalamaio.javaCampProject.Entities.Concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobseekersController {
	private JobseekerService service;
	
	@Autowired
	public JobseekersController(JobseekerService service) {
		this.service = service;
	}
	
	@GetMapping("/list")
	public List<Jobseeker> getAll() {
		return service.getall();
		}

}
