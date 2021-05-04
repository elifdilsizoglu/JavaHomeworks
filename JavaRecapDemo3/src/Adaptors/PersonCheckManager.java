package Adaptors;

import Entities.Customer;

public class PersonCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
	}

}
