
public interface ICustSet {
	public void addCust(Customer newC);
	public Customer findByName(String custName) throws CustNotFoundException;
}
