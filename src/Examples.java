import tester.Tester;

public class Examples {
	Customer gompeiCust = new Customer("gompei", 1865);

	BankingService setUpGompei() {
		CustHM allCusts = new CustHM();
		allCusts.addCust(gompeiCust);
		return new BankingService(allCusts, new AccountSet());
	}


	// a simple test case that gompei can log in
	boolean testValidLogin(Tester t) {
		try {
			return t.checkExpect(setUpGompei().login("gompei", 1865), gompeiCust);
		} catch (FailedLoginException e) {
			return t.checkExpect(false, "testValidLogin failed with exception");
		}
	}
	
	// a test case that gompei should login in but can't due to typo
	boolean testValidTypoLogin(Tester t) {
		try {
			return t.checkExpect(setUpGompei().login("gompeii", 123), gompeiCust);
		} catch (FailedLoginException e) {
			return t.checkExpect(false, "testValidTypoLogin failed with exception");
		}
	}
	
	boolean testExpectingException(Tester t) {
		return t.checkException(new FailedLoginException(), setUpGompei(), "login", "gompeii", 1865);
	}
	
	boolean testException(Tester t) {
		return t.checkException(new CustNotFoundException("gompeii"), setUpGompei().getCustomers(), "findByName", "gompeii");
	}

}
