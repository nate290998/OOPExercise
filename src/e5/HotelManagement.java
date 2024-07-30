package e5;

import java.util.Scanner;

public class HotelManagement { 

 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); 

HotelService hotel = new HotelService(); 

while (true) { 

System.out.println("Application Manager Candidate"); 

System.out.println("Enter 1: To insert person for rent"); 

System.out.println("Enter 2: To remove person by passport"); 

System.out.println("Enter 3: To calculator price by passport"); 

System.out.println("Enter 4: To show infor"); 

System.out.println("Enter 5: To exit:"); 

String line = scanner.nextLine(); 

switch(line) { 

case "1": { 

System.out.print("Enter name: "); 

String name = scanner.nextLine(); 

System.out.print("Enter age: "); 

int age = scanner.nextInt(); 

System.out.print("Enter passport: "); 

scanner.nextLine(); 

String passport = scanner.nextLine(); 

System.out.println("Choose a to rent room type A"); 

System.out.println("Choose b to rent room type B"); 

System.out.println("Choose c to rent room type C"); 

String choice = scanner.nextLine(); 

Room room; 

if (choice.equals("a")) { 

room = new RoomA(); 

} else if (choice.equals("b")) { 

room = new RoomB(); 

} else if (choice.equals("c")) { 

room = new RoomC(); 

} else { 

continue; 

} 

System.out.print("Enter number day for rent: "); 

int numberRent = scanner.nextInt(); 

Person person = new Person(name, age, passport, room, numberRent); 

hotel.addPerson(person); 

scanner.nextLine(); 

break; 

} 

case "2": { 

System.out.print("Enter passport: "); 

String passport = scanner.nextLine(); 

hotel.delete(passport); 

break; 

} 

case "3": { 

System.out.print("Enter passport: "); 

String passport = scanner.nextLine(); 

System.out.println("Price: " + hotel.calculator(passport)); 

break; 

} 

case "4": { 

hotel.show(); 

break; 

} 

case "5": { 

return; 

} 

default: 

System.out.println("Invalid"); 

continue; 

} 

} 

 

	} 

 

} 