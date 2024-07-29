package e3;

public class BlockC extends Candidate{
	public static final String MON_VAN= "Van";
	public static final String MON_SU = "Su";
	public static final String MON_DIA = "Dia";
	public BlockC(String number, String name, String address, String priority) {
		super(number, name, address, priority);
	}
	@Override
	public String toString() {
		return "BlockC [number=" + number + ", name=" + name + ", address=" + address + ", priority=" + priority + "]";
	}
	
}
