// using HashMap as a data structure
import java.util.HashMap;

public class CustHM implements ICustSet {
	private HashMap<String, Customer> customers = new HashMap<String, Customer>();
	
	public Customer findByName(String name) throws CustNotFoundException {
		if (customers.containsKey(name))
			return customers.get(name);
		else
			throw new CustNotFoundException(name);
	}

	@Override
	public void addCust(Customer newC) {
		customers.put(newC.getName(), newC);
	}

	
	
}
