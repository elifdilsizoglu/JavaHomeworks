package kodalamaio.javaCampProject.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodalamaio.javaCampProject.Business.Abstracts.JobService;
import kodalamaio.javaCampProject.DataAccess.Abstracts.JobDao;
import kodalamaio.javaCampProject.Entities.Concretes.Job;

@Service
public class JobManager implements JobService {
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getall() {
		return jobDao.findAll();
	}

	@Override
	public void add(Job entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Job entity) {
		// TODO Auto-generated method stub

	}

}
