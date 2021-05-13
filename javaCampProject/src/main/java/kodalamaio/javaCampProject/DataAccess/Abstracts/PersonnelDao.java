package kodalamaio.javaCampProject.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodalamaio.javaCampProject.Entities.Concretes.Personnel;

public interface PersonnelDao extends JpaRepository<Personnel, Integer> {

}
