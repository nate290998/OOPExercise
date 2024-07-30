package e9;

public class Customer { 

	private String name; 

	private String address; 

	private String electricityMeterCode; 

	 

	 

	public Customer() { 

		super(); 

	} 

 

 

	public Customer(String name, String address, String electricityMeterCode) { 

		super(); 

		this.name = name; 

		this.address = address; 

		this.electricityMeterCode = electricityMeterCode; 

	} 

 

 

	public String getName() { 

		return name; 

	} 

 

 

	public void setName(String name) { 

		this.name = name; 

	} 

 

 

	public String getAddress() { 

		return address; 

	} 

 

 

	public void setAddress(String address) { 

		this.address = address; 

	} 

 

 

	public String getElectricityMeterCode() { 

		return electricityMeterCode; 

	} 

 

 

	public void setElectricityMeterCode(String electricityMeterCode) { 

		this.electricityMeterCode = electricityMeterCode; 

	} 

 

 

	@Override 

	public String toString() { 

		return "Customer [name=" + name + ", address=" + address + ", electricityMeterCode=" + electricityMeterCode 

				+ "]"; 

	} 

	 

} 
