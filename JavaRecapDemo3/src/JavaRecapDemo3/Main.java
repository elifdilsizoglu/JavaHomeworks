package JavaRecapDemo3;

import Adaptors.MernisServiceAdapter;
import Adaptors.PersonCheckManager;
import Business.CustomerManager;
import Business.NeroCustomerManager;
import Business.StarbucksCustomerManager;
import Entities.Customer;
import Logger.FileLogger;
import Logger.SmsLogger;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager neroCustomerManager = new NeroCustomerManager();
		CustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter(), new SmsLogger() ); //-> mernis
		CustomerManager starbucksCustomerManager2 = new StarbucksCustomerManager(new PersonCheckManager(), new FileLogger() ); //-> personCheck
		
		Customer customer1 = new Customer(1, "Yusuf", "1962", "12365485258");
		Customer customer2 = new Customer(1, "Meryem", "1990", "45693874569");
		
		starbucksCustomerManager.Save(customer1);
		starbucksCustomerManager2.Save(customer2);
		
		neroCustomerManager.Save(customer2);
	}

}
