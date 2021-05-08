package JavarecapDemo4.core.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import JavarecapDemo4.core.Abstracts.VerificationService;
import JavarecapDemo4.entities.concretes.User;

public class UserValidator implements VerificationService {

	@Override
	public List<String> validate(User user) {
		
		String emailcontrol = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailcontrol);
		
		List<String> errorList = new ArrayList<String>();
		
		if(user.getPassword().length()<6) {
			errorList.add("Þifre en az 6 karakterden oluþmalýdýr.");
		}
		if(user.getFirstName().length()<2) {
			errorList.add("Kullanýcý adý en az 2 karakterden oluþmalýdýr.");
		}
		if(user.getLastName().length()<2) {
			errorList.add("Kullanýcý soyadý en az 2 karakterden oluþmalýdýr.");
		}
		if(user.getEmail() == null || !pat.matcher(user.getEmail()).matches()) {
			errorList.add("e posta adresi doðru formatta olmalýdýr.");
		}
		return errorList;
	}

}
