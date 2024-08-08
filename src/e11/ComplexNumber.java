// package e11;

// import java.util.Scanner;

// public class ComplexNumber { 

//     private double phanThuc; 

// private double phanAo; 



// // Hàm khởi tạo mặc định 

// public ComplexNumber() { 

// this.phanThuc = 0.0; 

// this.phanAo = 0.0; 

// } 



// // Hàm khởi tạo với tham số 

// public ComplexNumber(double phanThuc, double phanAo) { 

// this.phanThuc = phanThuc; 

// this.phanAo = phanAo; 

// } 



// // Getter và Setter cho phanThuc và phanAo 

// public double getPhanThuc() { 

// return phanThuc; 

// } 



// public void setPhanThuc(double phanThuc) { 

// this.phanThuc = phanThuc; 

// } 



// public double getPhanAo() { 

// return phanAo; 

// } 



// public void setPhanAo(double phanAo) { 

// this.phanAo = phanAo; 

// } 



// // Yêu cầu 2: Các phương thức khác 



// // Nhập một số phức 

// public void nhapSoPhuc() { 

// Scanner scanner = new Scanner(System.in); 

// System.out.print("Nhập phần thực: "); 

// this.phanThuc = scanner.nextDouble(); 

// System.out.print("Nhập phần ảo: "); 

// this.phanAo = scanner.nextDouble(); 

// } 



// // Hiển thị số phức 

// public void hienThiSoPhuc() { 

// System.out.println(this.toString()); 

// } 



// // Cộng 2 số phức 

// public ComplexNumber cong(ComplexNumber sp) { 

// double thuc = this.phanThuc + sp.getPhanThuc(); 

// double ao = this.phanAo + sp.getPhanAo(); 

// return new ComplexNumber(thuc, ao); 

// } 



// // Nhân 2 số phức 

// public ComplexNumber nhan(ComplexNumber sp) { 

// double thuc = this.phanThuc * sp.getPhanThuc() - this.phanAo * sp.getPhanAo(); 

// double ao = this.phanThuc * sp.getPhanAo() + this.phanAo * sp.getPhanThuc(); 

// return new ComplexNumber(thuc, ao); 

// } 



// @Override 

// public String toString() { 

// if (phanAo >= 0) { 

// return phanThuc + " + " + phanAo + "i"; 

// } else { 

// return phanThuc + " - " + (-phanAo) + "i"; 

// } 

// } 

// } 


