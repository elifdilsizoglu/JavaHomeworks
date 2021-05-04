package Logger;

public class DatabaseLogger implements LoggerService {

	@Override
	public void log(String message) {
		System.out.println("Logged in Database.");
	}

}
