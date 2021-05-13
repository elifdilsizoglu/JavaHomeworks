package kodalamaio.javaCampProject.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodalamaio.javaCampProject.Entities.Concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
