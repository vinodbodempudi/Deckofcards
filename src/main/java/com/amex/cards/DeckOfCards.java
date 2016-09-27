package com.amex.cards;

import java.util.ArrayList;

public class DeckOfCards {
	
	private ArrayList<Card> cards ;
	
	//constructor 
	public DeckOfCards(){
		 
		 this.cards = new ArrayList<Card>();
		 Card card;
		    for (Suit suit : Suit.values())
		    {
		     for (Rank rank : Rank.values())
		      {
		        card = new Card(rank, suit);
		        this.cards.add(card);
		      }
		    }
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	

}
