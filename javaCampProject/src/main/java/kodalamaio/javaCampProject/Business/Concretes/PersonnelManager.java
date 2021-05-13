package kodalamaio.javaCampProject.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodalamaio.javaCampProject.Business.Abstracts.PersonnelService;
import kodalamaio.javaCampProject.DataAccess.Abstracts.PersonnelDao;
import kodalamaio.javaCampProject.Entities.Concretes.Personnel;

@Service
public class PersonnelManager implements PersonnelService {
	
	private PersonnelDao personnelDao;
	
	@Autowired
	public PersonnelManager(PersonnelDao personnelDao) {
		this.personnelDao = personnelDao;
	}

	@Override
	public List<Personnel> getall() {
		return personnelDao.findAll();
	}

	@Override
	public void add(Personnel entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Personnel entity) {
		// TODO Auto-generated method stub

	}

}
