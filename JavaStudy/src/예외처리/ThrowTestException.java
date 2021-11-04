package 예외처리;

public class ThrowTestException extends Exception {
	
	public ThrowTestException() {

	}
	
	ThrowTestException(String msg) {
		super(msg);
	}
}
