package e12;

import java.util.Scanner;

public class VehicleManagementApp { 

 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); 

		VehicleService vehicleServices = new VehicleService(); 

		while (true) { 

			System.out.println("Vehicle Management Application"); 

			System.out.println("1. Choose vehicle to insert"); 

			System.out.println("2. Delete vehicle by its ID"); 

			System.out.println("3. Find Vehicle by its brand or "); 

			System.out.println("4. Exit the application"); 

			String choice = scanner.nextLine(); 

			switch (choice) { 

			case "1": 

				System.out.println("1. Car"); 

				System.out.println("2. Motorbike"); 

				System.out.println("3. Lorry"); 

				String vehicle = scanner.nextLine(); 

				switch (vehicle){ 

				case "1":{ 

					vehicleServices.addVehicle(newVehicle(scanner, "1")); 
					break; 
				} 

				case "2":{ 

					vehicleServices.addVehicle(newVehicle(scanner, "2")); 
					break; 
				} 

				case "3":{ 
					vehicleServices.addVehicle(newVehicle(scanner, "3")); 
					break; 
				} 

				default: 
					System.out.println("Not available"); 
					break; 
				} 
				break; 

			case "2": 

				System.out.println("Enter ID to remove the vehicle: "); 
				String id = scanner.nextLine(); 
				vehicleServices.removeByID(id); 
				break; 

			case "3": 

				System.out.println("Enter Brand or Color to find the vehicle: "); 
				String userType = scanner.nextLine(); 
				System.out.println(vehicleServices.findByColorBrand(userType)); 
				break; 

			case "4": 

				System.out.println("Exit the application"); 
				scanner.close(); 

				System.exit(0); 

				break; 

			default: 

				System.out.println("Not Available"); 

				continue; 

			} 

		} 

	} 

	 

	public static Vehicle newVehicle(Scanner scanner, String veh) { 

		System.out.println("Enter ID: "); 

		String id = scanner.nextLine(); 

		System.out.println("Enter Brand: "); 

		String brand = scanner.nextLine(); 

		System.out.println("Enter Year: "); 

		int year = scanner.nextInt(); 

		scanner.nextLine(); 

		System.out.println("Enter Price: "); 

		double price = scanner.nextDouble(); 

		scanner.nextLine(); 

		System.out.println("Enter Color: "); 

		String color = scanner.nextLine(); 

		if (veh.equals("1")) { 

			System.out.println("Enter seat number: "); 

			int seat = scanner.nextInt(); 

			scanner.nextLine(); 

			System.out.println("Enter engine: "); 

			String engine = scanner.nextLine(); 

			Vehicle vehicle1 = new Car(id, brand, year, price, color, seat, engine); 

			return vehicle1; 

		} else if(veh.equals("2")) { 

			System.out.println("Enter power: "); 

			String power = scanner.nextLine(); 

			Vehicle vehicle2 = new Motorbike(id, brand, year, price, color, power); 

			return vehicle2; 

		} else if(veh.equals("3")) { 

			System.out.println("Enter capacity: "); 

			String capacity = scanner.nextLine(); 

			Vehicle vehicle3 = new Lorry(id, brand, year, price, color, capacity); 

			return vehicle3; 

		} 

		return null; 

	} 

 

} 