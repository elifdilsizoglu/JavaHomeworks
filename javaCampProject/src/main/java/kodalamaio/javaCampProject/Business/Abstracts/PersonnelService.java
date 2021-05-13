package kodalamaio.javaCampProject.Business.Abstracts;

import java.util.List;

import kodalamaio.javaCampProject.Entities.Concretes.Personnel;

public interface PersonnelService {
	List<Personnel> getall();
	void add(Personnel entity);
	void delete(int id);
	void update(Personnel entity);
}
