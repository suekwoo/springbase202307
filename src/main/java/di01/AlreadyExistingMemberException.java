package di01;
public class AlreadyExistingMemberException extends RuntimeException {
	public AlreadyExistingMemberException(String message) {
		super(message);
	}
}