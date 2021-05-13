package kodalamaio.javaCampProject.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodalamaio.javaCampProject.Entities.Concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{
	
}
