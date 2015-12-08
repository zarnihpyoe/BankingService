// Using LinkedList as a data structure

import java.util.LinkedList;

public class CustSet implements ICustSet {
	private LinkedList<Customer> customers = new LinkedList<Customer>();
	
	// adds customer to the list of customers
	public void addCust(Customer newC) {
		this.customers.add(newC);
	}
	
	public Customer findByName(String custName) throws CustNotFoundException {
		for (Customer cust : customers) {
			if (cust.hasName(custName)) 
				return cust;
		}
		throw new CustNotFoundException(custName);			// throw exception about "No such customer"
	}
}
