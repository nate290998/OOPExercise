package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfficerService { 

	private List<Officer> listOfficer; 

 

	public OfficerService() { 

		this.listOfficer = new ArrayList<>(); 

	} 

	 

	public void addOfficer(Officer officer) { 

		this.listOfficer.add(officer); 

	} 

	 

	public List<Officer> findOfficer(String name) { 

		return this.listOfficer.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());	 

	} 

	 

	public void showOfficerInfo() { 

		this.listOfficer.stream().forEach(o -> System.out.println(o.toString())); 

	} 

} 

 

 

