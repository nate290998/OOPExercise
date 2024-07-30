package e4;

import java.util.ArrayList;
import java.util.List;

public class Street { 

	List<Family> families; 

 

public Street() { 

this.families = new ArrayList<>(); 

} 

 

public List<Family> getFamilies() { 

return families; 

} 

 

public void setFamilies(List<Family> families) { 

this.families = families; 

} 

 

public void addFamily(Family family) { 

this.families.add(family); 

} 

public void showInfoStreet() { 

for (Family family : families) { 

	family.showInfoFamily(); 

} 

} 

} 
