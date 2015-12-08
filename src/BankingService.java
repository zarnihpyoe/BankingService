import java.util.Scanner;

public class BankingService {
	private ICustSet customers;
	private IAccountSet accounts;
	
	// constructor 
	BankingService (ICustSet customers, IAccountSet accounts) {
		this.customers = customers;
		this.accounts = accounts;
	}

	public Customer login(String custName, int withPwd) throws FailedLoginException {
		try {
			Customer cust = this.customers.findByName(custName);
			cust.tryLogin(withPwd);
			return cust;
		} catch (CustNotFoundException e) {
			throw new FailedLoginException();
		}
	}

	public ICustSet getCustomers() {
		return this.customers; 
	}
}
