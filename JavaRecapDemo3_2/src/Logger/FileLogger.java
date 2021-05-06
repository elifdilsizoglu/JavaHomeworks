package Logger;

public class FileLogger implements LoggerService {

	@Override
	public void log(String message) {
		System.out.println("Logged in File" + message);
		
	}

}
