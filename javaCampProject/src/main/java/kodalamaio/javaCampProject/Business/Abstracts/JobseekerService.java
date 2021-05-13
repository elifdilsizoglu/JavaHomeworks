package kodalamaio.javaCampProject.Business.Abstracts;

import java.util.List;

import kodalamaio.javaCampProject.Entities.Concretes.Jobseeker;

public interface JobseekerService {
	List<Jobseeker> getall();
	void add(Jobseeker entity);
	void delete(int id);
	void update(Jobseeker entity);
}
