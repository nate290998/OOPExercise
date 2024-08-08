package e12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleService { 

	List<Vehicle> listVehicles; 

 

	public VehicleService() { 
		listVehicles = new ArrayList<>(); 
	} 

	 

	public void addVehicle(Vehicle vehicle) { 

		this.listVehicles.add(vehicle); 

	} 

	 

	public void removeByID(String id) { 

		this.listVehicles.stream().filter(v -> v.getId().equals(id)); 

	} 

	 

	public List<Vehicle> findByColorBrand(String userDefined) { 

		return this.listVehicles.stream() 

		.filter(v -> v.getBrand().contains(userDefined) || v.getColor().contains(userDefined)) 

		.collect(Collectors.toList()); 
	} 

} 

 
