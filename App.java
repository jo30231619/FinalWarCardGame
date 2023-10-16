package finalCodingproject;

import java.util.Arrays;

public class App {
	
	static Player player1 = new Player("Player 1");
    static Player player2 = new Player("Player 2");
   
	public static void main(String[] args) {
		//Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
		deck.shuffle();
	    deck.describe();
	    
	    System.out.println("Lets start the Game! " + "\n");
	    
	     for (int i = 0; i < 26; i++) {
	    	 player1.getHand().add(deck.draw());
	    	 player2.getHand().add(deck.draw());
	    	 
	     }
	    	  for (int j = 0; j < 26; j++) {
	    		 Card card1 = player1.flip();
	    		 Card card2 = player2.flip();
	    		 
	    		 if (card1 == null || card2 == null) {
		    		 break;
		    	 }
	    		 
	    		 System.out.println("********* NEW ROUND **********");
	    		 System.out.println(player1.getName() + " drew " + card1.getName() + " of " + card1.getSuit() + " -- " +  card1.getValue());
	    		 System.out.println("Player 1 has " + player1.getScore() + " points");
		    	 System.out.println(player2.getName() + " drew " + card2.getName() + " of " + card2.getSuit() + " -- " +  card2.getValue());
		    	 System.out.println("Player 2 has " + player2.getScore() + " points");
		    	 System.out.println("--------------------------------------");
		    	 
		    	 int comparison = Integer.compare(card1.getValue(), card2.getValue());
		    	 
		    	 if (comparison > 0) {
		    		 player1.incrementScore();
		    		 System.out.println(player1.getName() + " wins the round and gets a point!\n\n");
		    		 
		    	 } else if (comparison < 0) {
		    		 player2.incrementScore();
		    		 System.out.println(player2.getName() + " wins the round and gets a point!\n\n");
		    		 
		    	 } else {
		    		 System.out.println("Tie! No points will be awarded.\n");
		    	 }
	 	     }
	    
	     
	     player1.describe();
	     player2.describe();
	     
	   if (player1.getScore() > player2.getScore()) {
		   System.out.println(player1.getName() + " wins the game!");
	   } else if (player2.getScore() > player1.getScore()) {
		   System.out.println(player2.getName() + " wins the game!");
	   } else {
		   System.out.println("Draw!");
	   }
	   
	     
	     
	}

}
