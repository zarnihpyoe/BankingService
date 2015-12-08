import java.util.Scanner;

public class BankingConsole {
	private Scanner keyboard = new Scanner(System.in);
	BankingService forService;
	
	//constructor
	BankingConsole(BankingService forService) {
		this.forService = forService;
	}

	public void loginScreen() {
		// prompt for user to enter username and password
		System.out.println("Welcome to the bank! Please log in.");
		System.out.print("Enter your username: ");
		String username = keyboard.next();
		System.out.print("Enter your password: ");
		int password = keyboard.nextInt();
		try {
			forService.login(username, password);
		} catch(FailedLoginException e) {
			System.out.println("Login failed. Try again.");
			this.loginScreen();
		}
	}
}
