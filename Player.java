package finalCodingproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	
	public Player(String name) {
		this.setScore(0);
		this.setName(name);
	}
	

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + " has " + score + " points.");
		for (Card card : this.hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card hand = this.hand.remove(0);
		return hand;	
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		score++;
	}
	
	
}
