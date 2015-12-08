import java.util.LinkedList;

public class AccountSet implements IAccountSet {
	LinkedList<Account> accounts = new LinkedList<Account>();

	public Account findByNum(int forAcctNum) throws InvalidAccountNumException {
		for (Account acct : accounts) {
			if (acct.hasNum(forAcctNum)) {
				return acct;
			}
		}
		throw new InvalidAccountNumException(forAcctNum);
	}
}
