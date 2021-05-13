package kodalamaio.javaCampProject.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodalamaio.javaCampProject.Business.Abstracts.JobseekerService;
import kodalamaio.javaCampProject.DataAccess.Abstracts.JobseekerDao;
import kodalamaio.javaCampProject.Entities.Concretes.Jobseeker;

@Service
public class JobseekerMaanger implements JobseekerService{
	
	private JobseekerDao jobseekerDao;
	
	@Autowired
	public JobseekerMaanger(JobseekerDao jobseekerDao) {
		this.jobseekerDao = jobseekerDao;
	}

	@Override
	public List<Jobseeker> getall() {
		return jobseekerDao.findAll();
	}

	@Override
	public void add(Jobseeker entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Jobseeker entity) {
		// TODO Auto-generated method stub
		
	}

}
