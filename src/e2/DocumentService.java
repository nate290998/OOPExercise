package e2;

import java.util.ArrayList;
import java.util.List;

public class DocumentService { 

	List<Document> listDocument; 

 

	public DocumentService() { 

		this.listDocument = new ArrayList<>(); 

	} 

	 

	public void add(Document document) { 

		this.listDocument.add(document); 

	} 

	 

	public boolean delete(String id) { 

		Document doc = this.listDocument 

		.stream() 

		.filter(d -> d.getId().equals(id)) 

		.findFirst() 

		.orElse(null); 

		if (doc == null) { 

			return false; 

		} 

		this.listDocument.remove(doc); 

		return true; 

	} 

	 

	public void showInfo() { 

		this.listDocument.forEach(d -> System.out.println(d.toString())); 

	} 

	 

	public void searchByBook() { 

		this.listDocument.stream() 

		.filter(doc -> doc instanceof Book) 

		.forEach(doc -> System.out.println(doc.toString())); 

	} 

	public void searchByNews() { 

		this.listDocument.stream() 

		.filter(doc -> doc instanceof Newspaper) 

		.forEach(doc -> System.out.println(doc.toString())); 

	} 

	public void searchByMagazine() { 

		this.listDocument.stream() 

		.filter(doc -> doc instanceof Magazine) 

		.forEach(doc -> System.out.println(doc.toString())); 

	} 

} 
