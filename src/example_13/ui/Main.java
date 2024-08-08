package example_13.ui;

import java.util.Scanner;

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
            System.out.println("Enter 6: To exit:");
            String ch = scanner.nextLine();
            switch (ch) {
                case "1":
                    System.out.println("0. Experience");
                    System.out.println("1. Fresher");
                    System.out.println("2. Intern");
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
