package e3;

public class BlockA extends Candidate{
	public static final String MON_TOAN = "Toan";
	public static final String MON_LY = "Ly";
	public static final String MON_HOA = "Hoa";
	public BlockA(String number, String name, String address, String priority) {
		super(number, name, address, priority);
	}
	@Override
	public String toString() {
		return "BlockA [number=" + number + ", name=" + name + ", address=" + address + ", priority=" + priority + "]";
	}
	
}
