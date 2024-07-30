package e2;

public class Newspaper extends Document{ 

	private String publisherDate; 

 

	public Newspaper() { 

		super(); 

	} 

 

	public Newspaper(String publisherDate) { 

		this.publisherDate = publisherDate; 

	} 

 

	public Newspaper(String id, String publisher, int copies, String publisherDate) { 

		super(id, publisher, copies); 

		this.publisherDate = publisherDate; 

	} 

 

	public String getPublisherDate() { 

		return publisherDate; 

	} 

 

	public void setPublisherDate(String publisherDate) { 

		this.publisherDate = publisherDate; 

	} 

 

	@Override 

	public String toString() { 

		return "Newspaper [publisherDate=" + publisherDate + ", id=" + id + ", publisher=" + publisher + ", copies=" 

				+ copies + "]"; 

	} 

	 

	 

} 
