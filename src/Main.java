// import tester.* ;

public class Main {
	// static Examples E = new Examples () ;

	public static void main(String[] args) {
		// Tester.runReport (E, false, false) ;


		ICustSet allCusts = new CustSet();
		Customer gompei = new Customer("Gompei", 1865);
		allCusts.addCust(gompei);
		BankingService b = new BankingService(allCusts, new AccountSet());
		BankingConsole bc = new BankingConsole(b);


		bc.loginScreen();


	}
}


