package guess_number;

public class OutOfRangeException extends Exception {
	public OutOfRangeException() {
	}
	OutOfRangeException(String msg){
		super(msg);
	}
}
