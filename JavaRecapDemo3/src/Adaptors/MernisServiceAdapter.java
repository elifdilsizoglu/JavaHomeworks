package Adaptors;

import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {

	      return true;
	}

}
