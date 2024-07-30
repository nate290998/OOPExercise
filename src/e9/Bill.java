package e9;

public class Bill { 

	private Customer customer; 

	private int oldIndexNumber; 

	private int newIndexNumber; 

	private int duePayment; 

	public Bill() { 

		super(); 

	} 

	public Bill(Customer customer, int oldIndexNumber, int newIndexNumber, int duePayment) { 

		super(); 

		this.customer = customer; 

		this.oldIndexNumber = oldIndexNumber; 

		this.newIndexNumber = newIndexNumber; 

		this.duePayment = duePayment; 

	} 

	public Customer getCustomer() { 

		return customer; 

	} 

	public void setCustomer(Customer customer) { 

		this.customer = customer; 

	} 

	public int getOldIndexNumber() { 

		return oldIndexNumber; 

	} 

	public void setOldIndexNumber(int oldIndexNumber) { 

		this.oldIndexNumber = oldIndexNumber; 

	} 

	public int getNewIndexNumber() { 

		return newIndexNumber; 

	} 

	public void setNewIndexNumber(int newIndexNumber) { 

		this.newIndexNumber = newIndexNumber; 

	} 

	public int getDuePayment() { 

		return duePayment; 

	} 

	public void setDuePayment(int duePayment) { 

		this.duePayment = duePayment; 

	} 

	@Override 

	public String toString() { 

		return "Bill [customer=" + customer + ", oldIndexNumber=" + oldIndexNumber + ", newIndexNumber=" 

				+ newIndexNumber + ", duePayment=" + duePayment + "]"; 

	} 

	 

} 
