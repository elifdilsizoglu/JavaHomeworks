package kodalamaio.javaCampProject.Business.Abstracts;

import java.util.List;

import kodalamaio.javaCampProject.Entities.Concretes.Job;

public interface JobService {
	List<Job> getall();
	void add(Job entity);
	void delete(int id);
	void update(Job entity);
}
