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
			System.out.println("sipari� eklendi");
			for (LoggerService loggerService : loggers) {
				System.out.println("sipari� eklendi");
			}
		}else{
			System.out.println("kullan�c� bulunamad�");
			for (LoggerService loggerService : loggers) {
				System.out.println("kullan�c� bulunamad�");
			}
		}

	}

	@Override
	public void delete(Order order) {
		if(CheckService.checkIfRealPerson(order.getUser())) {
			System.out.println("sipari� silindi");
			for (LoggerService loggerService : loggers) {
				System.out.println("sipari� silindi");
			}
		}else {
			System.out.println("kullan�c� bulunamad�");
			for (LoggerService loggerService : loggers) {
				System.out.println("kullan�c� bulunamad�");
			}
		}

	}

	@Override
	public void update(Order order) {
		if(CheckService.checkIfRealPerson(order.getUser())) {
			System.out.println("sipari� g�ncellendi");
			for (LoggerService loggerService : loggers) {
				System.out.println("sipari� g�ncellendi");
			}
		}else {
			System.out.println("kullan�c� bulunamad�");
			for (LoggerService loggerService : loggers) {
				System.out.println("kullan�c� bulunamad�");
			}
		}


	}

}
