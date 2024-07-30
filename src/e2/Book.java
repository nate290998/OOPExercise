package e2;

public class Book extends Document{ 

	private String author; 

	private int pageNumber; 

	 

	public Book() { 

	} 

	 

	public Book(String author, int pageNumber) { 

		this.author = author; 

		this.pageNumber = pageNumber; 

	} 

	 

	 

	public Book(String id, String publisher, int copies, String author, int pageNumber) { 

		super(id, publisher, copies); 

		this.author = author; 

		this.pageNumber = pageNumber; 

	} 

 

	public String getAuthor() { 

		return author; 

	} 

	public void setAuthor(String author) { 

		this.author = author; 

	} 

	public int getPageNumber() { 

		return pageNumber; 

	} 

	public void setPageNumber(int pageNumber) { 

		this.pageNumber = pageNumber; 

	} 

	 

	@Override 

	public String toString() { 

		return "Book [author=" + author + ", pageNumber=" + pageNumber + ", id=" + id + ", publisher=" + publisher 

				+ ", copies=" + copies + "]"; 

	} 

	 

} 