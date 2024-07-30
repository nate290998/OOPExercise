package e1;

import java.util.Scanner;

public class OfficerManagementApp { 
public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 

    OfficerService officerService = new OfficerService(); 

    while(true) { 

        System.out.println("Application Manager Officer"); 

        System.out.println("1: Insert Officer"); 

        System.out.println("2: Find Officer By Name"); 

        System.out.println("3: View Officer Information"); 

        System.out.println("4: Exit"); 

        String line = scanner.nextLine(); 

        switch (line) { 

        case "1":{ 

            System.out.println("1: Engineer"); 

            System.out.println("2: Worker"); 

            System.out.println("3: Staff"); 

            String job = scanner.nextLine(); 

            switch (job) { 

            case "1":{ 

                System.out.print("Enter Name: "); 

                String name = scanner.nextLine(); 

                System.out.print("Enter Age: "); 

                int age = scanner.nextInt(); 

                System.out.print("Enter Gender: "); 

                scanner.nextLine(); 

                String gender = scanner.nextLine(); 

                System.out.print("Enter Address: "); 

                String address = scanner.nextLine(); 

                System.out.print("Enter Major: "); 

                String major = scanner.nextLine(); 

                Officer engineer = new Engineer(name, age, gender, address, major); 

                officerService.addOfficer(engineer); 

                System.out.println(engineer.toString()); 

                break; 

            } 

            case "2":{ 

                System.out.print("Enter Name: "); 

                String name = scanner.nextLine(); 

                System.out.print("Enter Age: "); 

                int age = scanner.nextInt(); 

                System.out.print("Enter Gender: "); 

                scanner.nextLine(); 

                String gender = scanner.nextLine(); 

                System.out.print("Enter Adress: "); 

                String address = scanner.nextLine(); 

                System.out.print("Enter Level"); 

                int level = scanner.nextInt(); 

                if(level > 12 || level < 1 ) { 

                    break; 

                } 

                Officer worker = new Worker(name, age, gender, address, level); 

                officerService.addOfficer(worker); 

                System.out.println(worker.toString()); 

                break; 

            } 

            case "3":{ 

                System.out.print("Enter Name: "); 

                String name = scanner.nextLine(); 

                System.out.print("Enter Age: "); 

                int age = scanner.nextInt(); 

                System.out.print("Enter Gender: "); 

                scanner.nextLine(); 

                String gender = scanner.nextLine(); 

                System.out.print("Enter Adress: "); 

                String address = scanner.nextLine(); 

                System.out.print("Enter Job: "); 

                String jobStaff = scanner.nextLine(); 

                Officer staff = new Staff(name, age, gender, address, jobStaff); 

                officerService.addOfficer(staff); 

                System.out.println(staff.toString()); 

                break; 

            } 

            default: 

                System.out.println("Not available"); 

                break; 

            } 

            break; 

        } 

        case "2": { 

            System.out.println("Enter name to find: "); 

            String name = scanner.nextLine(); 

            officerService.findOfficer(name).forEach(o -> { 

                System.out.println(o.toString()); 

            }); 

            break; 

        } 

        case "3": { 

            officerService.showOfficerInfo(); 

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
