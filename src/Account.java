
public class Account {
	private int number;
	private Customer owner;
	private double balance;
	
	// checking whether account has given account number
	boolean hasNum(int forAcctNum) {
		return this.number == forAcctNum;
	}
	
	
}
