package e3;

public class BlockB extends Candidate{
	public static final String MON_TOAN = "Toan";
	public static final String MON_HOA = "Hoa";
	public static final String MON_SINH = "Sinh";
	
	public BlockB(String number, String name, String address, String priority) {
		super(number, name, address, priority);
	}
	@Override
	public String toString() {
		return "BlockB [number=" + number + ", name=" + name + ", address=" + address + ", priority=" + priority + "]";
	}
	
	
	
}
