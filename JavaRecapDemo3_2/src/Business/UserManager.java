package Business;

import Adaptors.PersonCheckService;
import Entities.User;
import Logger.LoggerService;

public class UserManager implements UserService {
	
	private PersonCheckService personCheckService;
	private LoggerService[] loggers;
	
	public UserManager(PersonCheckService personCheckService, LoggerService ... loggers) {
		this.personCheckService = personCheckService;
		this.loggers = loggers;
	}
	
	@Override
	public void add(User user) {
		
		if(personCheckService.checkIfRealPerson(user)) {
			System.out.println("kullan�c� eklendi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullan�c� eklendi");
			}
		}else {
			System.out.println("kullan�c� bulunamad�");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullan�c� bulunamad�");
			}
		}
	}

	@Override
	public void delete(User user) {
		if(personCheckService.checkIfRealPerson(user)) {
			System.out.println("kullan�c� silindi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullan�c� silindi");
				
			}
		}else {
			System.out.println("kullan�c� bulunamad�");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullan�c� bulunamad�");
			}
		}

	}

	@Override
	public void update(User user) {
		if(personCheckService.checkIfRealPerson(user)) {
			System.out.println("kullan�c� g�ncellendi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullan�c� g�ncellendi");
			}
			
		}else {
			System.out.println("kullan�c� bulunamad�");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullan�c� bulunamad�");
			}
		}

	}

}
