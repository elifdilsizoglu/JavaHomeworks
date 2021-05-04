package Business;

import Entities.Customer;

public abstract class CustomerManager implements CustomerService {
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Database'e kaydedildi : " + customer.getFirstName());
	}
}
