package e12;

public class Motorbike extends Vehicle{ 

	private String power; 

 

	public Motorbike(String id, String brand, int year, double price, String color, String power) { 

		super(id, brand, year, price, color); 

		this.power = power; 

	} 

 

	public String getPower() { 

		return power; 

	} 

 

	public void setPower(String power) { 

		this.power = power; 

	} 

 

	@Override 

	public String toString() { 

		return "Motorbike [power=" + power + ", id=" + id + ", brand=" + brand + ", year=" + year + ", price=" + price 

				+ ", color=" + color + "]"; 

	} 

} 
