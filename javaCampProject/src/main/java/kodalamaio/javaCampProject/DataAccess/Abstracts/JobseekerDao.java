package kodalamaio.javaCampProject.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodalamaio.javaCampProject.Entities.Concretes.Jobseeker;

public interface JobseekerDao extends JpaRepository<Jobseeker, Integer>{

}
