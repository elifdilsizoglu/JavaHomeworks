package Business;

import Adaptors.CustomerCheckService;
import Entities.Customer;
import Logger.LoggerService;

public class StarbucksCustomerManager extends CustomerManager {
	
	private CustomerCheckService checkService;
	private LoggerService loggerService;

	public StarbucksCustomerManager(CustomerCheckService checkService, LoggerService loggerService) {
		super();
		this.checkService = checkService;
		this.loggerService = loggerService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(this.checkService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("kullanýcý bilgileri hatalý");
		}
		
	}
	
	
}
