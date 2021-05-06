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
			System.out.println("kullanýcý eklendi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanýcý eklendi");
			}
		}else {
			System.out.println("kullanýcý bulunamadý");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanýcý bulunamadý");
			}
		}
	}

	@Override
	public void delete(User user) {
		if(personCheckService.checkIfRealPerson(user)) {
			System.out.println("kullanýcý silindi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanýcý silindi");
				
			}
		}else {
			System.out.println("kullanýcý bulunamadý");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanýcý bulunamadý");
			}
		}

	}

	@Override
	public void update(User user) {
		if(personCheckService.checkIfRealPerson(user)) {
			System.out.println("kullanýcý güncellendi");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanýcý güncellendi");
			}
			
		}else {
			System.out.println("kullanýcý bulunamadý");
			for (LoggerService loggerService : loggers) {
				loggerService.log("kullanýcý bulunamadý");
			}
		}

	}

}
