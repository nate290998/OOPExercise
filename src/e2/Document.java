package e2;

public class Document { 

	protected String id;  

	protected String publisher; 

	protected int copies; 

	 

	 

	public Document() { 

	} 

 

 

	public Document(String id, String publisher, int copies) { 

		this.id = id; 

		this.publisher = publisher; 

		this.copies = copies; 

	} 

 

 

	public String getId() { 

		return id; 

	} 

 

 

	public void setId(String id) { 

		this.id = id; 

	} 

 

 

	public String getPublisher() { 

		return publisher; 

	} 

 

 

	public void setPublisher(String publisher) { 

		this.publisher = publisher; 

	} 

 

 

	public int getCopies() { 

		return copies; 

	} 

 

 

	public void setCopies(int copies) { 

		this.copies = copies; 

	} 

 

 

	@Override 

	public String toString() { 

		return "Document [id=" + id + ", publisher=" + publisher + ", copies=" + copies + "]"; 

	} 

	 

	 

} 
