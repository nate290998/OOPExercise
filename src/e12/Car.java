package e12;

public class Car extends Vehicle{ 

	private int seatNumber; 

	private String engine; 

	public Car() { 

		super(); 

	} 

	public Car(String id, String brand, int year, double price, String color, int seatNumber, String engine) { 

		super(id, brand, year, price, color); 

		this.seatNumber = seatNumber; 

		this.engine = engine; 

	} 

	public int getSeatNumber() { 

		return seatNumber; 

	} 

	public void setSeatNumber(int seatNumber) { 

		this.seatNumber = seatNumber; 

	} 

	public String getEngine() { 

		return engine; 

	} 

	public void setEngine(String engine) { 

		this.engine = engine; 

	} 

	@Override 

	public String toString() { 

		return "Car [seatNumber=" + seatNumber + ", engine=" + engine + ", id=" + id + ", brand=" + brand + ", year=" 

				+ year + ", price=" + price + ", color=" + color + "]"; 

	} 

		 

	 

} 
