package kodalamaio.javaCampProject.Business.Abstracts;

import java.util.List;

import kodalamaio.javaCampProject.Entities.Concretes.Employer;


public interface EmployerService {
	List<Employer> getall();
	void add(Employer entity);
	void delete(int id);
	void update(Employer entity);
}
