package e9;

import java.util.ArrayList;
import java.util.List;

public class BillService { 

	List<Bill> listBills; 

 

	public BillService() { 

		this.listBills = new ArrayList<>(); 

	} 

	 

	public void addBill(Bill bill) { 

		this.listBills.add(bill); 

	} 

	 

	public void removeByID(String code) { 

		this.listBills.stream() 

		.filter(b -> b.getCustomer().getElectricityMeterCode().equals(code)); 

	} 

	 

	public void showInfo() { 

		this.listBills.forEach(b -> System.out.println(b.toString())); 

	} 

	 

	public void updateInfoCus(String electricityMeterCode, String name, String address){ 

		this.listBills.stream() 

		.filter(b -> b.getCustomer().getElectricityMeterCode().equals(electricityMeterCode)) 

		.forEach(b -> {b.getCustomer().setName(name); b.getCustomer().setAddress(address); 

	}); 

		 

	} 

	public int calculateFee(int oldFee, int newFee) { 

		return (oldFee - newFee) * 5; 

	} 

} 
