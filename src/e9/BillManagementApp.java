package e9;

import java.util.Scanner;

public class BillManagementApp { 

 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); 

		BillService billService = new BillService(); 

		 

		while(true) { 

			System.out.println("1. Insert"); 

			System.out.println("2. Remove By ID"); 

			System.out.println("3. Show Info"); 

			System.out.println("4. Update Info Customer"); 

			System.out.println("5. Exit"); 

			String choice = scanner.nextLine(); 

			switch(choice) { 

				case "1": 

					System.out.print("Enter name: "); 

	 String name = scanner.nextLine(); 

	 System.out.print("Enter address: "); 

	 String address = scanner.nextLine(); 

	 System.out.print("Enter electricity meter code: "); 

	 String electricityMeterCode = scanner.nextLine(); 

	 System.out.print("Enter old index number: "); 

	 int oldIndexNumber = scanner.nextInt(); 

	 System.out.print("Enter new index number: "); 

	 int newIndexNumber = scanner.nextInt(); 

	 scanner.nextLine(); 

	 int duePayment = billService.calculateFee(oldIndexNumber, newIndexNumber); 

	 Customer customer = new Customer(name, address, electricityMeterCode);; 

	 Bill bill = new Bill(customer, oldIndexNumber, newIndexNumber, duePayment); 

	 billService.addBill(bill); 

	 break; 

				case "2": 

					System.out.println("Enter electricity meter code to delete: "); 

					String emc = scanner.nextLine(); 

					billService.removeByID(emc); 

					break; 

				case "3": 

					billService.showInfo(); 

					break; 

				case "4": 

					System.out.println("Enter electricity meter code to update: "); 

					String emCode = scanner.nextLine(); 

					System.out.println("Enter name: "); 

					String cusName = scanner.nextLine(); 

					System.out.println("Enter address: "); 

					String cusAddress = scanner.nextLine(); 

					billService.updateInfoCus(emCode, cusName, cusAddress); 

					System.out.println("Updated successully"); 

					break; 

				case "5": 

					System.out.println("Exit the application"); 

scanner.close(); 

System.exit(0); 

break; 

				default: 

	 System.out.println("Please choose again"); 

	 continue; 

			} 

		} 

	} 

 

} 
