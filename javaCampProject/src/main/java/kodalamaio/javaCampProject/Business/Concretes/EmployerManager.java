package kodalamaio.javaCampProject.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodalamaio.javaCampProject.Business.Abstracts.EmployerService;
import kodalamaio.javaCampProject.DataAccess.Abstracts.EmployerDao;
import kodalamaio.javaCampProject.Entities.Concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}
	
	@Override
	public List<Employer> getall() {
		return employerDao.findAll();
	}


	@Override
	public void add(Employer entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Employer entity) {
		// TODO Auto-generated method stub

	}

}
