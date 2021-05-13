package kodalamaio.javaCampProject.API.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodalamaio.javaCampProject.Business.Abstracts.JobService;
import kodalamaio.javaCampProject.Entities.Concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobService service;
	
	@Autowired
	public JobsController(JobService service) {
		this.service = service;
	}
	
	@GetMapping("/list")
	public List<Job> getAll(){
		return service.getall();
	}

}
