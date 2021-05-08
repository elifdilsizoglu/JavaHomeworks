package JavarecapDemo4.core.Abstracts;

import java.util.List;

import JavarecapDemo4.entities.concretes.User;

public interface VerificationService {
	List<String> validate(User user);
}
