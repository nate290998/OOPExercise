package e12;

public class Lorry extends Vehicle{ 

	private String capacity; 

	 

	public Lorry(String id, String brand, int year, double price, String color, String capacity) { 

		super(id, brand, year, price, color); 

		this.capacity = capacity; 

	} 

 

	public String getCapacity() { 

		return capacity; 

	} 

 

	public void setCapacity(String capacity) { 

		this.capacity = capacity; 

	} 

 

	@Override 

	public String toString() { 

		return "Lorry [capacity=" + capacity + ", id=" + id + ", brand=" + brand + ", year=" + year + ", price=" + price 

				+ ", color=" + color + "]"; 

	} 

	 

} 
