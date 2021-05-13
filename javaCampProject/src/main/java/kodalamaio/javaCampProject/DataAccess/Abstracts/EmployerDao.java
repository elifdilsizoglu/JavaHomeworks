package kodalamaio.javaCampProject.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodalamaio.javaCampProject.Entities.Concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
