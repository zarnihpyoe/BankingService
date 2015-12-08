import java.util.LinkedList;

public class Customer {
	private String name;
	private int password;
	private LinkedList<Account> accounts;

	// constructor
	Customer (String name, int password) {
		this.name = name;
		this.password = password;
	}
	
	// getter
	public String getName() {
		return this.name;
	}

	// checking whether customer has given name
	public boolean hasName(String aName) {
		return this.name.equals(aName);
	}

	// method throws FailedLoginException when the password does not match with the user's password
	public void tryLogin(int withPwd) throws FailedLoginException {
		if (this.password != withPwd)
			throw new FailedLoginException();
	}
}