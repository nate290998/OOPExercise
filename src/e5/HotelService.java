package e5;

import java.util.ArrayList;
import java.util.List;

public class HotelService { 

	private List<Person> people; 

 

	public HotelService() { 

		people = new ArrayList<>(); 

	} 

	 

	public void addPerson(Person person) { 

		this.people.add(person); 

	} 

	 

	public boolean delete(String passport) { 

		Person person = this.people.stream() 

				.filter(p -> p.getPassport().equals(passport)) 

				.findFirst().orElse(null); 

		if (person == null) { 

			return false; 

		} else { 

			this.people.remove(person); 

			return true; 

		} 

	} 

	 

	public int calculator(String passport) { 

		Person person = this.people 

				.stream().filter(p -> p.getPassport().equals(passport)) 

				.findFirst().orElse(null); 

		return person.getRoom().getPrice() * person.getNumberRent(); 

	} 

	 

	public void show() { 

		this.people.forEach(p -> System.out.println(p.toString())); 

	} 

} 
