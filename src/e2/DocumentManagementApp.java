package e2;

import java.util.Scanner;

public class DocumentManagementApp { 

 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); 

		DocumentService documentService = new DocumentService(); 

		while(true) { 

			System.out.println("Application Document Management"); 

			System.out.println("1: Insert Document"); 

			System.out.println("2: Search by Category"); 

			System.out.println("3: Show Info"); 

			System.out.println("4: Remove By ID"); 

			System.out.println("5: Exit App"); 

			String line = scanner.nextLine(); 

			switch (line) { 

			case "1":{ 

				System.out.println("1: Book"); 

				System.out.println("2: Newspaper"); 

				System.out.println("1: Magazine"); 

				String doc = scanner.nextLine(); 

				switch (doc) { 

				case "1":{ 

					System.out.print("ID: "); 

					String id = scanner.nextLine(); 

					System.out.print("Publisher: "); 

					String publisher = scanner.nextLine(); 

					System.out.print("Copies: "); 

					int copies = scanner.nextInt(); 

					scanner.nextLine(); 

					System.out.println("Author: "); 

					String author = scanner.nextLine(); 

					System.out.println("Number of pages: "); 

					int pageNumber = scanner.nextInt(); 

					Document book = new Book(id, publisher, copies, author, pageNumber); 

					documentService.add(book); 

					System.out.println(book.toString()); 

					scanner.nextLine(); 

					break; 

			} 

				case "2":{ 

					System.out.print("ID: "); 

					String id = scanner.nextLine(); 

					System.out.print("Publisher: "); 

					String publisher = scanner.nextLine(); 

					System.out.print("Copies: "); 

					int copies = scanner.nextInt(); 

					scanner.nextLine(); 

					System.out.println("Date"); 

					String date = scanner.nextLine(); 

					Document news = new Newspaper(id, publisher, copies, date); 

					documentService.add(news); 

					System.out.println(news.toString()); 

					break; 

			} 

				case "3":{ 

					System.out.print("ID: "); 

					String id = scanner.nextLine(); 

					System.out.print("Publisher: "); 

					String publisher = scanner.nextLine(); 

					System.out.print("Copies: "); 

					int copies = scanner.nextInt(); 

					scanner.nextLine(); 

					System.out.println(""); 

					int publicationNum = scanner.nextInt(); 

					scanner.nextLine(); 

					System.out.println(""); 

					int publicationMonth = scanner.nextInt(); 

					Document mgz = new Magazine(id, publisher, copies, publicationNum, publicationMonth); 

					documentService.add(mgz); 

					System.out.println(mgz.toString()); 

					scanner.nextLine(); 

					break; 

				} 

				default:  

					break; 

			} 

				break; 

			} 

			case "2":{ 

				System.out.println("1: Book"); 

				System.out.println("2: News"); 

				System.out.println("3: Magazine"); 

				String search = scanner.nextLine(); 

				switch (search) { 

				case "1": { 

					documentService.searchByBook(); 

					break; 

				} 

				case "2": { 

					documentService.searchByNews(); 

					break; 

				} 

				case "3": { 

					documentService.searchByMagazine(); 

					break; 

				} 

				default: 

					System.out.println("Not Available"); 

					break; 

				} 

			} 

			case "3": { 

				documentService.showInfo(); 

				break; 

			} 

			case "4": { 

				System.out.println("Enter ID to remove: "); 

				String id = scanner.nextLine(); 

				documentService.delete(id); 

				System.out.println("Delete Successfully"); 

				break; 

			} 

			case "5": { 

				return; 

			} 

			default: 

				System.out.println("Not available"); 

				continue; 

			} 

 

		} 

 

	} 

 

} 
