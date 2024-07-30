package e6;

import java.util.Scanner;

public class ClassesManagement { 

 

	public static void main(String[] args) { 

		 	Scanner scanner = new Scanner(System.in); 

	 Classes classes = new Classes(); 

 

	 while (true) { 

	 System.out.println("1. Thêm học sinh mới"); 

	 System.out.println("2. Hiển thị các học sinh 20 tuổi"); 

	 System.out.println("3. Số lượng học sinh 23 tuổi và quê ở DN"); 

	 System.out.println("4. Thoát"); 

	 System.out.print("Chọn chức năng: "); 

	 String choice = scanner.nextLine(); 

	 switch (choice) { 

	 case "1":{ 

	 System.out.print("Nhập họ tên: "); 

	 String hoTen = scanner.nextLine(); 

	 System.out.print("Nhập tuổi: "); 

	 int tuoi = scanner.nextInt(); 

	 scanner.nextLine(); // consume newline 

	 System.out.print("Nhập quê quán: "); 

	 String queQuan = scanner.nextLine(); 

	 System.out.print("Nhập lớp: "); 

	 String lop = scanner.nextLine(); 

	 Student student = new Student(hoTen, tuoi, queQuan, lop); 

	 classes.add(student); 

	 break; 

	 } 

	 case "2": { 

	 	System.out.println(classes.getStudent20YearOld()); 

	 break;} 

	 case "3":{ 

	 int soLuong = classes.countStudent23YearOldInDN(); 

	 System.out.println("Số lượng học sinh 23 tuổi và quê ở DN: " + soLuong); 

	 break; 

	 } 

	 case "4":{ 

	 System.out.println("Thoát chương trình."); 

	 scanner.close(); 

	 System.exit(0); 

	 break; 

	 } 

	 default:{ 

	 System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại."); 

	 continue; 

	 } 

	 } 

	 } 

	} 

 

} 
