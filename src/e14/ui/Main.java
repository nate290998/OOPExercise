package e14.ui;

import java.util.Scanner;

import e14.service.UIManager;
import example_13.ui.ScannerFactory;

public class Main {

    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        Scanner scanner = ScannerFactory.getScanner();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To update by ID: ");
            System.out.println("Enter 3: To remove employee's information by ID: ");
            System.out.println("Enter 4: To show all employees' information: ");
            System.out.println("Enter 5: To show all employees' information by type: ");
            System.out.println("Enter 6: To recruit students");
            System.out.println("Enter 7: To exit:");

            String ch = scanner.nextLine();

            switch (ch) {
                case "1":
                    System.out.println("0. Good Student");
                    System.out.println("1. Normal Student");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    uiManager.insert(type);
                    break;

                case "2":
                    uiManager.update();
                    break;

                case "3":
                    uiManager.delete();
                    break;

                case "4":
                    uiManager.showAllEmployeeInfo();
                    break;

                case "5":
                    uiManager.showAllEmployeeByType();
                    break;

                case "6":
                    System.out.println("Enter number of students to recruit (11-15):");
                    int numberOfStudents = scanner.nextInt();
                    scanner.nextLine();
                    if (numberOfStudents >= 11 && numberOfStudents <= 15) {
                        uiManager.recruit(numberOfStudents);
                    } else {
                        System.out.println("Invalid number of students. Please enter a number between 11 and 15.");
                    }
                    break;

                case "7":
                    System.out.println("Exit the application");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Not Available");
                    break;
            }
        }
    }
}
