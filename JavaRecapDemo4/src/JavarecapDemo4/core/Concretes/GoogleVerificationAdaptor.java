package JavarecapDemo4.core.Concretes;

import java.util.*;

import JavarecapDemo4.core.Abstracts.VerificationService;
import JavarecapDemo4.entities.concretes.User;
import JavarecapDemo4.googleAccounts.GoogleVerificationService;

public class GoogleVerificationAdaptor implements VerificationService {

	@Override
	public List<String> validate(User user) {
		GoogleVerificationService verificationService = new GoogleVerificationService();
		List<String> errorList = new ArrayList<String>();
		errorList = verificationService.isValid(user);
		return errorList;
	}

}
