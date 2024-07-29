package e8;

import java.util.Scanner;

import e3.Candidate;

public class CardManagementApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService cardService = new CardService();
		while (true) {
			System.out.println("Application Card Management");
			System.out.println("1: Insert Card");
			System.out.println("2: Delete Card");
			System.out.println("3: Show Info");
			System.out.println("4: Exit");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.print("Enter card number: ");
				String cardNumber = scanner.nextLine();
				System.out.print("Enter borrowed Date: ");
				String borrowedDate = scanner.nextLine();
				System.out.print("Enter returned Date: ");
				String returnedDate = scanner.nextLine();
				System.out.print("Enter card ID: ");
				String cardID = scanner.nextLine();
				System.out.print("Enter book ID: ");
				String bookID = scanner.nextLine();
				System.out.println("Enter Student Name: ");
				String name = scanner.nextLine();
				System.out.println("Enter Student Age: ");
				String age = scanner.nextLine();
				System.out.println("Enter Student Class: ");
				String studentClass = scanner.nextLine();
				Student student = new Student(name, age, studentClass);
				Card card = new Card(cardNumber, borrowedDate, returnedDate, cardID, bookID, student);
				cardService.addCard(card);
				break;
			}
			case "2": {
				System.out.print("Enter ID: ");
                String number = scanner.nextLine();
                cardService.deleteByID(number);
                break;
			}
			case "3": {
				
                cardService.showInfo();
				break;
                }
			case "4": {
                return;
            }
            default:
                System.out.println("Not Available");
                continue;
			}
		}
	}

}
