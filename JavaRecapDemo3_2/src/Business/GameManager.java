package Business;

import Entities.Game;
import Logger.LoggerService;

public class GameManager implements GameService {
	
	private LoggerService[] loggers;
	public GameManager(LoggerService... loggers) {
		this.loggers = loggers;
	}
	@Override
	public void add(Game game) {
		System.out.println("oyun eklendi");
		for (LoggerService loggerService : loggers) {
			System.out.println("oyun eklendi");
		}

	}

	@Override
	public void delete(Game game) {
		game.setStatus(false);
		System.out.println("oyun silindi");
		for (LoggerService loggerService : loggers) {
			System.out.println("oyun silindi");
		}

	}

	@Override
	public void update(Game game) {
		System.out.println("oyun güncellendi");
		for (LoggerService loggerService : loggers) {
			System.out.println("oyun güncellendi");
		}

	}

}
