package e10;

public class CountCharacters { 

 

	private String xauKyTu; 

 

// Hàm khởi tạo mặc định 

public CountCharacters() { 

this.xauKyTu = ""; 

} 

 

// Hàm khởi tạo với tham số xâu ký tự 

public CountCharacters(String xauKyTu) { 

this.xauKyTu = xauKyTu; 

} 

 

// Getter và Setter cho thuộc tính xauKyTu 

public String getXauKyTu() { 

return xauKyTu; 

} 

 

public void setXauKyTu(String xauKyTu) { 

this.xauKyTu = xauKyTu; 

} 

 

// Yêu cầu 2: Đếm số từ của văn bản 

public int demSoTu() { 

if (xauKyTu == null || xauKyTu.isEmpty()) { 

return 0; 

} 

String[] words = xauKyTu.trim().split("\\s+"); 

return words.length; 

} 

 

// Yêu cầu 3: Đếm số lượng ký tự A (không phân biệt hoa thường) của văn bản 

public int demSoKyTuA() { 

if (xauKyTu == null || xauKyTu.isEmpty()) { 

return 0; 

} 

int count = 0; 

for (char c : xauKyTu.toCharArray()) { 

if (Character.toLowerCase(c) == 'a') { 

count++; 

} 

} 

return count; 

} 

 

// Yêu cầu 4: Chuẩn hóa văn bản 

public String chuanHoa() { 

if (xauKyTu == null || xauKyTu.isEmpty()) { 

return ""; 

} 

return xauKyTu.trim().replaceAll("\\s+", " "); 

} 

 

public static void main(String[] args) { 

	CountCharacters vb = new CountCharacters(" Nguyen Van A "); 

System.out.println("Số từ: " + vb.demSoTu()); 

System.out.println("Số ký tự 'A': " + vb.demSoKyTuA()); 

System.out.println("Văn bản chuẩn hóa: '" + vb.chuanHoa() + "'"); 

} 

 

} 
