package e8;

import java.util.ArrayList;
import java.util.List;

public class CardService {
	List<Card> listCards;

	public CardService() {
		this.listCards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		this.listCards.add(card);
	}
	
	public boolean deleteByID(String id) {
		Card card = this.listCards.stream()
				.filter(c -> c.getCardId().equals(id))
				.findFirst().orElse(null);
		if (card == null) {
			System.out.println("Not Available");
			return false;
		} else {
			this.listCards.remove(card);
			return true;
		}
	}
	
	public void showInfo() {
		this.listCards.forEach(c -> System.out.println(c.toString()));
	}
}
