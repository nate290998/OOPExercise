package e2;

public class Magazine extends Document{ 

	private int publicationNumber; 

	private int publicationMonth; 

	 

	 

	public Magazine() { 

	} 

 

 

	public Magazine(int publicationNumber, int publicationMonth) { 

		this.publicationNumber = publicationNumber; 

		this.publicationMonth = publicationMonth; 

	} 

 

 

	public Magazine(String id, String publisher, int copies, int publicationNumber, int publicationMonth) { 

		super(id, publisher, copies); 

		this.publicationNumber = publicationNumber; 

		this.publicationMonth = publicationMonth; 

	} 

 

 

	public int getPublicationNumber() { 

		return publicationNumber; 

	} 

 

 

	public void setPublicationNumber(int publicationNumber) { 

		this.publicationNumber = publicationNumber; 

	} 

 

 

	public int getPublicationMonth() { 

		return publicationMonth; 

	} 

 

 

	public void setPublicationMonth(int publicationMonth) { 

		this.publicationMonth = publicationMonth; 

	} 

 

 

	@Override 

	public String toString() { 

		return "Magazine [publicationNumber=" + publicationNumber + ", publicationMonth=" + publicationMonth + ", id=" 

				+ id + ", publisher=" + publisher + ", copies=" + copies + "]"; 

	} 

	 

	 

}