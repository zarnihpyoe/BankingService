
public class CustNotFoundException extends Exception{
	String name;
	
	CustNotFoundException(String name) {
		this.name = name;
	}
	
	public String getUnfoundName() {
		return this.name;
	}
}
