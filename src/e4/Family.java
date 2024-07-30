package e4;

import java.util.ArrayList;
import java.util.List;

public class Family { 

    private List<Resident> residents; 

    private int residentNumber; 

private String address; 



public Family(int residentNumber, String address) { 

       this.residentNumber = residentNumber; 

       this.address = address; 

this.residents = new ArrayList<>(); 

   } 



   public List<Resident> getResidents() { 

return residents; 

} 



public void setResidents(List<Resident> residents) { 

this.residents = residents; 

} 



public int getResidentNumber() { 

       return residentNumber; 

   } 



   public void setResidentNumber(int residentNumber) { 

       this.residentNumber = residentNumber; 

   } 



   public String getAddress() { 

return address; 

} 



public void setAddress(String address) { 

this.address = address; 

} 

 

public void addResident(Resident resident) { 

residents.add(resident); 

} 



public void showInfoFamily() { 

System.out.println("Address: " + address); 

System.out.println("Number of member: " + residentNumber); 

for (Resident resident : residents) { 

    resident.toString(); 

} 

} 



   @Override 

   public String toString() { 

       return "Family [residents=" + residents + ", residentNumber=" + residentNumber + ", address=" + address 

               + "]"; 

   } 



 

} 
