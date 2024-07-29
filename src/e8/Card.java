package e8;

import java.util.ArrayList;
import java.util.List;

public class Card {
	private String cardNumber;
	private String borrowedDate;
	private String returnedDate;
	private String cardId;
	private String bookId;
	private Student student;
	
	public Card() {
		super();
	}
	
	public Card(String cardNumber, String borrowedDate, String returnedDate, String cardId, String bookId,
			Student student) {
		super();
		this.cardNumber = cardNumber;
		this.borrowedDate = borrowedDate;
		this.returnedDate = returnedDate;
		this.cardId = cardId;
		this.bookId = bookId;
		this.student = student;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the borrowedDate
	 */
	public String getBorrowedDate() {
		return borrowedDate;
	}

	/**
	 * @param borrowedDate the borrowedDate to set
	 */
	public void setBorrowedDate(String borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	/**
	 * @return the returnedDate
	 */
	public String getReturnedDate() {
		return returnedDate;
	}

	/**
	 * @param returnedDate the returnedDate to set
	 */
	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}

	/**
	 * @return the cardId
	 */
	public String getCardId() {
		return cardId;
	}

	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	/**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", borrowedDate=" + borrowedDate + ", returnedDate=" + returnedDate
				+ ", cardId=" + cardId + ", bookId=" + bookId + ", student=" + student.getName() + 
				", " + student.getAge() + ", " + student.getStudentClass()+"]";
	}

	/**
	 * @return the cardNumber
	 */
	
	
	
}
