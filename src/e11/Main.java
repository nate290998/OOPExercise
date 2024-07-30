package e11;

public class Main { 

	public static void main(String[] args) { 

// Tạo và nhập hai số phức 

ComplexNumber sp1 = new ComplexNumber(); 

sp1.nhapSoPhuc(); 

ComplexNumber sp2 = new ComplexNumber(); 

sp2.nhapSoPhuc(); 

 

// Hiển thị hai số phức 

System.out.println("Số phức thứ nhất: "); 

sp1.hienThiSoPhuc(); 

System.out.println("Số phức thứ hai: "); 

sp2.hienThiSoPhuc(); 

 

// Cộng hai số phức 

ComplexNumber tong = sp1.cong(sp2); 

System.out.println("Tổng hai số phức: "); 

tong.hienThiSoPhuc(); 

 

// Nhân hai số phức 

ComplexNumber tich = sp1.nhan(sp2); 

System.out.println("Tích hai số phức: "); 

tich.hienThiSoPhuc(); 

} 

} 
