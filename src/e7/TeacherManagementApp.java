package e7;

import java.util.Scanner;

public class TeacherManagementApp { 

 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); 

TeacherService teacherService = new TeacherService(); 

 

while (true) { 

System.out.println("1. Thêm cán bộ giáo viên mới"); 

System.out.println("2. Xóa cán bộ giáo viên theo mã số"); 

System.out.println("3. Hiển thị danh sách cán bộ giáo viên"); 

System.out.println("4. Thoát"); 

System.out.print("Chọn chức năng: "); 

int choice = scanner.nextInt(); 

scanner.nextLine(); 

 

switch (choice) { 

case 1: 

System.out.print("Nhập họ tên: "); 

String hoTen = scanner.nextLine(); 

System.out.print("Nhập tuổi: "); 

int tuoi = scanner.nextInt(); 

scanner.nextLine(); 

System.out.print("Nhập quê quán: "); 

String queQuan = scanner.nextLine(); 

System.out.print("Nhập mã số giáo viên: "); 

String maSoGV = scanner.nextLine(); 

System.out.print("Nhập lương cứng: "); 

double luongCung = scanner.nextDouble(); 

System.out.print("Nhập lương thưởng: "); 

double luongThuong = scanner.nextDouble(); 

System.out.print("Nhập tiền phạt: "); 

double tienPhat = scanner.nextDouble(); 

Teacher teacher = new Teacher(hoTen, tuoi, queQuan, maSoGV, luongCung, luongThuong, tienPhat, luongCung + luongThuong - tienPhat); 

teacherService.add(teacher); 

break; 

case 2: 

System.out.print("Nhập mã số giáo viên để xóa: "); 

String maSoXoa = scanner.nextLine(); 

teacherService.deleteById(maSoXoa); 

break; 

case 3: 

	teacherService.showInfo(); 

	break; 

case 4: 

System.out.println("Thoát chương trình."); 

scanner.close(); 

System.exit(0); 

break; 

default: 

System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại."); 

} 

} 

	} 

 

} 
