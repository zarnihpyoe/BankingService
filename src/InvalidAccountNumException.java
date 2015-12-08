
public class InvalidAccountNumException extends Exception {
	int invalidAccNum;
	
	InvalidAccountNumException(int invalidAccNum) {
		this.invalidAccNum = invalidAccNum;
	}
}
