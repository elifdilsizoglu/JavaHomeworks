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
			System.out.println("kullanıcı eklendi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanıcı eklendi");
			}
		}else {
			System.out.println("kullanıcı bulunamadı");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanıcı bulunamadı");
			}
		}
	}

	@Override
	public void delete(User user) {
		if(personCheckService.checkIfRealPerson(user)) {
			System.out.println("kullanıcı silindi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanıcı silindi");
				
			}
		}else {
			System.out.println("kullanıcı bulunamadı");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanıcı bulunamadı");
			}
		}

	}

	@Override
	public void update(User user) {
		if(personCheckService.checkIfRealPerson(user)) {
			System.out.println("kullanıcı güncellendi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanıcı güncellendi");
			}
			
		}else {
			System.out.println("kullanıcı bulunamadı");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanıcı bulunamadı");
			}
		}

	}

}
