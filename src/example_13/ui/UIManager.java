package example_13.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import example_13.entity.Certificate;
import example_13.entity.Employee;
import example_13.entity.Experience;
import example_13.entity.Fresher;
import example_13.entity.Intern;
import example_13.exception.BirthdayException;
import example_13.exception.EmailException;
import example_13.exception.FullNameException;
import example_13.exception.PhoneException;
import example_13.service.EmployeeManager;
import example_13.service.ValidatorManager;

public class UIManager {
    private EmployeeManager employeeManager = new EmployeeManager();
    private List<Employee> listEmployees;

    public UIManager() {
        listEmployees = new ArrayList<>();
    }

    public void insert(int type) {
        Employee employee = null;
        Scanner scanner = ScannerFactory.getScanner();
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.print("Input birthday (yyyy-MM-dd): ");
        LocalDate birthday = null;
        try {
            birthday = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format for birthday. Please enter the date in the format yyyy-MM-dd.");
            return; // Exit if the date is invalid
        }
        System.out.print("Input Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        List<Certificate> lstCertificates = new ArrayList<>();
        boolean addMoreCertificates = true;
        while (addMoreCertificates) {
            System.out.print("Input certificate id: ");
            String idCertificate = scanner.nextLine();
            System.out.print("Input certificate name: ");
            String nameCertificate = scanner.nextLine();
            System.out.print("Input certificate rank: ");
            String rank = scanner.nextLine();
            try {
                System.out.print("Input certificate date (yyyy-MM-dd): ");
                LocalDate dateCertificate = LocalDate.parse(scanner.nextLine(),
                        DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                lstCertificates.add(new Certificate(idCertificate, nameCertificate, rank, dateCertificate));
            } catch (DateTimeParseException e) {
                System.out.println(
                        "Invalid date format for certificate date. Please enter the date in the format yyyy-MM-dd.");
                continue; // Skip this certificate and ask for the next one
            }
            System.out.print("Add another certificate? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreCertificates = addMore.equalsIgnoreCase("yes");
        }
        if (type == 0) {
            System.out.print("Input Year of Experience: ");
            int yearOfExperience = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input Pro Skill: ");
            String proSkill = scanner.nextLine();
            Experience experience = new Experience(id, name, birthday, phone, email, lstCertificates, yearOfExperience,
                    proSkill);
            employee = experience;
        }
        if (type == 1) {
            System.out.print("Input graduation date (yyyy-MM-dd): ");
            LocalDate graduationDate = null;
            try {
                graduationDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (DateTimeParseException e) {
                System.out.println(
                        "Invalid date format for graduation date. Please enter the date in the format yyyy-MM-dd.");
                return; // Exit if the date is invalid
            }
            System.out.print("Input graduation rank: ");
            String graduationRank = scanner.nextLine();
            System.out.print("Input Phone: ");
            String universityName = scanner.nextLine();
            Fresher fresher = new Fresher(id, name, birthday, phone, email, lstCertificates, graduationDate,
                    graduationRank, universityName);
            employee = fresher;
        }
        if (type == 2) {
            System.out.print("Input Major: ");
            String major = scanner.nextLine();
            System.out.print("Input Semester: ");
            int semester = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input university name: ");
            String universityNames = scanner.nextLine();
            Intern intern = new Intern(id, name, birthday, phone, email, lstCertificates, major, semester,
                    universityNames);
            employee = intern;
        }
        try {
            checkData(employee);
        } catch (BirthdayException e) {
            // insert => insert(type);
            System.out.println("Birthday is not valid! (yyyy-MM-dd)");
            insert(type);
        } catch (PhoneException e) {
            // insert => insert(type);
            System.out.println("Phone is not valid! ");
            insert(type);
        } catch (EmailException e) {
            // insert => insert(type);
            System.out.println("Email is not valid! ");
            insert(type);
        } catch (FullNameException e) {
            // insert => insert(type);
            System.out.println("Fullname is not valid!");
            insert(type);
        }

        this.employeeManager.insert(employee);
        System.out.println("New employee has been updated!");
    }

    // private Experience insertExperience() {
    // Scanner scanner = ScannerFactory.getScanner();
    // System.out.print("Input ID: ");
    // String id = scanner.nextLine();
    // System.out.print("Input Name: ");
    // String name = scanner.nextLine();
    // System.out.print("Input birthday (yyyy-MM-dd): ");
    // LocalDate birthday = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // System.out.print("Input Phone: ");
    // String phone = scanner.nextLine();
    // System.out.print("Input Email: ");
    // String email = scanner.nextLine();
    // List<Certificate> lstCertificates = new ArrayList<>();
    // boolean addMoreCertificates = true;
    // while (addMoreCertificates) {
    // System.out.print("Input certificate id: ");
    // String idCertificate = scanner.nextLine();
    // System.out.print("Input certificate name: ");
    // String nameCertificate = scanner.nextLine();
    // System.out.print("Input certificate rank: ");
    // String rank = scanner.nextLine();
    // System.out.print("Input certificate date (yyyy-MM-dd): ");
    // LocalDate dateCertificate = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // lstCertificates.add(new Certificate(idCertificate, nameCertificate, rank,
    // dateCertificate));
    // System.out.print("Add another certificate? (yes/no): ");
    // String addMore = scanner.nextLine();
    // addMoreCertificates = addMore.equalsIgnoreCase("yes");
    // }
    // System.out.print("Input Year of Experience: ");
    // int yearOfExperience = scanner.nextInt();
    // System.out.print("Input Pro Skill: ");
    // String proSkill = scanner.nextLine();
    // Experience experience = new Experience(id, name, birthday, phone, email,
    // lstCertificates, yearOfExperience,
    // proSkill);
    // return experience;
    // }

    // private Intern insertIntern() {
    // Scanner scanner = ScannerFactory.getScanner();
    // System.out.print("Input ID: ");
    // String id = scanner.nextLine();
    // System.out.print("Input Name: ");
    // String name = scanner.nextLine();
    // System.out.print("Input birthday (yyyy-MM-dd): ");
    // LocalDate birthday = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // System.out.print("Input Phone: ");
    // String phone = scanner.nextLine();
    // System.out.print("Input Email: ");
    // String email = scanner.nextLine();
    // List<Certificate> lstCertificates = new ArrayList<>();
    // boolean addMoreCertificates = true;
    // while (addMoreCertificates) {
    // System.out.print("Input certificate id: ");
    // String idCertificate = scanner.nextLine();
    // System.out.print("Input certificate name: ");
    // String nameCertificate = scanner.nextLine();
    // System.out.print("Input certificate rank: ");
    // String rank = scanner.nextLine();
    // System.out.print("Input certificate date (yyyy-MM-dd): ");
    // LocalDate dateCertificate = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // lstCertificates.add(new Certificate(idCertificate, nameCertificate, rank,
    // dateCertificate));
    // System.out.print("Add another certificate? (yes/no): ");
    // String addMore = scanner.nextLine();
    // addMoreCertificates = addMore.equalsIgnoreCase("yes");
    // }
    // System.out.print("Input Major: ");
    // String major = scanner.nextLine();
    // System.out.print("Input Semester: ");
    // int semester = scanner.nextInt();
    // System.out.print("Input university name: ");
    // String universityNames = scanner.nextLine();
    // Intern intern = new Intern(id, name, birthday, phone, email, lstCertificates,
    // major, semester, universityNames);
    // return intern;
    // }

    // private Fresher insertFresher() {
    // Scanner scanner = ScannerFactory.getScanner();
    // System.out.print("Input ID: ");
    // String id = scanner.nextLine();
    // System.out.print("Input Name: ");
    // LocalDate birthday = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // System.out.print("Input birthday (yyyy-MM-dd): ");
    // String name = scanner.nextLine();
    // System.out.print("Input Phone: ");
    // String phone = scanner.nextLine();
    // System.out.print("Input Email: ");
    // String email = scanner.nextLine();
    // List<Certificate> lstCertificates = new ArrayList<>();
    // boolean addMoreCertificates = true;
    // while (addMoreCertificates) {
    // System.out.print("Input certificate id: ");
    // String idCertificate = scanner.nextLine();
    // System.out.print("Input certificate name: ");
    // String nameCertificate = scanner.nextLine();
    // System.out.print("Input certificate rank: ");
    // String rank = scanner.nextLine();
    // System.out.print("Input certificate date (yyyy-MM-dd): ");
    // LocalDate dateCertificate = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // lstCertificates.add(new Certificate(idCertificate, nameCertificate, rank,
    // dateCertificate));
    // System.out.print("Add another certificate? (yes/no): ");
    // String addMore = scanner.nextLine();
    // addMoreCertificates = addMore.equalsIgnoreCase("yes");
    // }
    // LocalDate graduationDate = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // System.out.print("Input graduation date (yyyy-MM-dd): ");
    // System.out.print("Input graduation rank: ");
    // String graduationRank = scanner.nextLine();
    // System.out.print("Input Phone: ");
    // String universityName = scanner.nextLine();
    // Fresher fresher = new Fresher(id, name, birthday, phone, email,
    // lstCertificates, graduationDate, graduationRank,
    // universityName);
    // return fresher;
    // }

    // private Employee insertEmployee(Employee employee) {
    // Scanner scanner = ScannerFactory.getScanner();
    // System.out.print("Input ID: ");
    // String id = scanner.nextLine();
    // System.out.print("Input Name: ");
    // LocalDate birthday = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // System.out.print("Input birthday (yyyy-MM-dd): ");
    // String name = scanner.nextLine();
    // System.out.print("Input Phone: ");
    // String phone = scanner.nextLine();
    // System.out.print("Input Email: ");
    // String email = scanner.nextLine();
    // List<Certificate> lstCertificates = new ArrayList<>();
    // boolean addMoreCertificates = true;
    // while (addMoreCertificates) {
    // System.out.print("Input certificate id: ");
    // String idCertificate = scanner.nextLine();
    // System.out.print("Input certificate name: ");
    // String nameCertificate = scanner.nextLine();
    // System.out.print("Input certificate rank: ");
    // String rank = scanner.nextLine();
    // System.out.print("Input certificate date (yyyy-MM-dd): ");
    // LocalDate dateCertificate = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // lstCertificates.add(new Certificate(idCertificate, nameCertificate, rank,
    // dateCertificate));
    // System.out.print("Add another certificate? (yes/no): ");
    // String addMore = scanner.nextLine();
    // addMoreCertificates = addMore.equalsIgnoreCase("yes");
    // }
    // if (employee instanceof Fresher) {
    // LocalDate graduationDate = LocalDate.parse(scanner.nextLine(),
    // DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    // System.out.print("Input graduation date (yyyy-MM-dd): ");
    // System.out.print("Input graduation rank: ");
    // String graduationRank = scanner.nextLine();
    // System.out.print("Input Phone: ");
    // String universityName = scanner.nextLine();
    // Fresher fresher = new Fresher(id, name, birthday, phone, email,
    // lstCertificates, graduationDate,
    // graduationRank, universityName);
    // return fresher;
    // } else if (employee instanceof Intern) {
    // System.out.print("Input Major: ");
    // String major = scanner.nextLine();
    // System.out.print("Input Semester: ");
    // int semester = scanner.nextInt();
    // System.out.print("Input university name: ");
    // String universityNames = scanner.nextLine();
    // Intern intern = new Intern(id, name, birthday, phone, email, lstCertificates,
    // major, semester,
    // universityNames);
    // return intern;
    // } else if (employee instanceof Experience) {
    // System.out.print("Input Year of Experience: ");
    // int yearOfExperience = scanner.nextInt();
    // System.out.print("Input Pro Skill: ");
    // String proSkill = scanner.nextLine();
    // Experience experience = new Experience(id, name, birthday, phone, email,
    // lstCertificates, yearOfExperience,
    // proSkill);
    // return experience;
    // }
    // System.out.println("Successfully updated!!!");
    // return null;

    // }

    public void update() {
        Scanner scanner = ScannerFactory.getScanner();
        System.out.print("Insert ID to update info: ");
        String id = scanner.nextLine();
        Employee employee = this.employeeManager.findEmployeeByID(id);
        if (employee != null) {
            System.out.print("Input Name: ");
            String name = scanner.nextLine();
            employee.setFullName(name);
            System.out.print("Input Phone: ");
            String phone = scanner.nextLine();
            employee.setPhone(phone);
            System.out.print("Input Email: ");
            String email = scanner.nextLine();
            employee.setEmail(email);
            try {
                LocalDate birthday = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                System.out.print("Input birthday (yyyy-MM-dd): ");
                employee.setBirthDay(birthday);
            } catch (DateTimeParseException e) {
                System.out.println(
                        "Invalid date format for graduation date. Please enter the date in the format yyyy-MM-dd.");
                return; // Exit if the date is invalid
            }
            System.out.print("Input Certificate: ");

        }

        if (employee instanceof Experience) {
            System.out.println("Experience");
            System.out.print("Insert Years of Experience ");
            int yearOfExperience = scanner.nextInt();
            ((Experience) employee).setYearOfExperience(yearOfExperience);
            scanner.nextLine();
            System.out.print("Insert Pro SKill: ");
            String proSkill = scanner.nextLine();
            ((Experience) employee).setProSkill(proSkill);

        } else if (employee instanceof Fresher) {
            System.out.println("Fresher");
            System.out.print("Input graduation date (yyyy-MM-dd): ");
            LocalDate graduationDate = null;
            try {
                graduationDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                ((Fresher) employee).setGraduationDate(graduationDate);
            } catch (DateTimeParseException e) {
                System.out.println(
                        "Invalid date format for graduation date. Please enter the date in the format yyyy-MM-dd.");
                return; // Exit if the date is invalid
            }
            System.out.print("Input graduation rank: ");
            String graduationRank = scanner.nextLine();
            ((Fresher) employee).setGraduationRank(graduationRank);
            System.out.print("Input Phone: ");
            String universityName = scanner.nextLine();
            ((Fresher) employee).setUniversityName(universityName);
        } else if (employee instanceof Intern) {
            System.out.println("Intern");
            System.out.print("Input Major: ");
            String major = scanner.nextLine();
            ((Intern) employee).setMajor(major);
            System.out.print("Input Semester: ");
            int semester = scanner.nextInt();
            ((Intern) employee).setSemester(semester);
            scanner.nextLine();
            System.out.print("Input university name: ");
            String universityNames = scanner.nextLine();
            ((Intern) employee).setUniversityNames(universityNames);
        } else {
            System.out.println("not avlb");
        }
        System.out.println("Updated successfully!");

    }

    public void delete() {
        System.out.print("Insert ID to delete employee: ");
        String id = ScannerFactory.getScanner().nextLine();
        this.employeeManager.deleteByID(id);
        System.out.println("Deleted employee successfully!");
    }

    public void showAllEmployeeInfo() {
        this.employeeManager.findAll().forEach(Employee::showInformation);
    }

    private void checkData(Employee employee)
            throws BirthdayException, PhoneException, EmailException, FullNameException {
        ValidatorManager.birthdayCheck(employee.getBirthDay());
        ValidatorManager.phoneCheck(employee.getPhone());
        ValidatorManager.emailCheck(employee.getEmail());
        ValidatorManager.nameCheck(employee.getFullName());
    }

    public void showAllEmployeeByType() {
        Scanner scanner = ScannerFactory.getScanner();
        System.out.print("Insert type to show info: ");
        int type = scanner.nextInt();
        this.employeeManager.findByType(type).forEach(Employee::showInformation);
    }
}
