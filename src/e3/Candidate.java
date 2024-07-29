package e3;

public class Candidate {
	/**
	 * @return the number
	 */
	protected String number;
	protected String name;
	protected String address;
	protected String priority;
	
	public Candidate() {
		super();
	}
	public Candidate(String number, String name, String address, String priority) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.priority = priority;
	}
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
		}
	@Override
	public String toString() {
		return "Candidate [number=" + number + ", name=" + name + ", address=" + address + ", priority=" + priority
				+ "]";
	}
}
