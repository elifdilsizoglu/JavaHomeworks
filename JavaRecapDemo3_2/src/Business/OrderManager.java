package Business;

import Adaptors.PersonCheckService;
import Entities.Order;
import Logger.LoggerService;

public class OrderManager implements OrderService {
	
	private PersonCheckService CheckService;
	private LoggerService[] loggers;
	
	public OrderManager(PersonCheckService checkService, LoggerService... loggers) {
		CheckService = checkService;
		this.loggers = loggers;
	}

	@Override
	public void add(Order order) {
		if(CheckService.checkIfRealPerson(order.getUser())){
			System.out.println("sipariþ eklendi");
			for (LoggerService loggerService : loggers) {
				System.out.println("sipariþ eklendi");
			}
		}else{
			System.out.println("kullanýcý bulunamadý");
			for (LoggerService loggerService : loggers) {
				System.out.println("kullanýcý bulunamadý");
			}
		}

	}

	@Override
	public void delete(Order order) {
		if(CheckService.checkIfRealPerson(order.getUser())) {
			System.out.println("sipariþ silindi");
			for (LoggerService loggerService : loggers) {
				System.out.println("sipariþ silindi");
			}
		}else {
			System.out.println("kullanýcý bulunamadý");
			for (LoggerService loggerService : loggers) {
				System.out.println("kullanýcý bulunamadý");
			}
		}

	}

	@Override
	public void update(Order order) {
		if(CheckService.checkIfRealPerson(order.getUser())) {
			System.out.println("sipariþ güncellendi");
			for (LoggerService loggerService : loggers) {
				System.out.println("sipariþ güncellendi");
			}
		}else {
			System.out.println("kullanýcý bulunamadý");
			for (LoggerService loggerService : loggers) {
				System.out.println("kullanýcý bulunamadý");
			}
		}


	}

}
