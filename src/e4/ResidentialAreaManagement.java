package e4;

import java.util.Scanner;

public class ResidentialAreaManagement { 

 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); 

Street street = new Street(); 

 

System.out.print("Enter number of Family: "); 

int n = scanner.nextInt(); 

scanner.nextLine(); 

 

for (int i = 0; i < n; i++) { 

System.out.println("Enter the family number: " + (i + 1) + ":"); 

System.out.print("Adress: "); 

String address = scanner.nextLine(); 

 

System.out.print("Số thành viên: "); 

int residentNum = scanner.nextInt(); 

scanner.nextLine(); 

 

Family families = new Family(residentNum, address); 

 

for (int j = 0; j < residentNum; j++) { 

System.out.println("Nhập thông tin thành viên thứ " + (j + 1) + ":"); 

System.out.print("Họ tên: "); 

String name = scanner.nextLine(); 

 

System.out.print("Tuổi: "); 

int age = scanner.nextInt(); 

scanner.nextLine(); // consume newline 

 

System.out.print("Nghề nghiệp: "); 

String job = scanner.nextLine(); 

 

System.out.print("Số CMND: "); 

String idNumber = scanner.nextLine(); 

 

Resident resident = new Resident(name, age, job, idNumber); 

families.addResident(resident); 

} 

 

street.addFamily(families); 

} 

 

System.out.println("Thông tin các hộ trong khu phố: "); 

street.showInfoStreet(); 

} 

	 

	 

 

} 
