package Logger;

public class SmsLogger implements LoggerService {

	@Override
	public void log(String message) {
		System.out.println("Logged in SMS" + message);
		
	}

}
