package com.amex.cards;



public class Casino {
	
	
	public static void main(String args[]){
		
		Dealer dealer = new Dealer();
		DeckOfCards deck = new DeckOfCards();
		
		System.out.println("---------FRESH DECK OF CARDS -------------");
		for(Card card : deck.getCards()){
			System.out.println(card.rank +" of "+ card.suit);
		}
		
		dealer.shuffleCards(deck);
		
		System.out.println("-----------SHUFFULED CARDS----------");
		for(Card card : deck.getCards()){
			System.out.println(card.rank +" of "+ card.suit);
		}
		
		dealer.sortCards(deck);
		
		System.out.println("-----------ORDERED CARDS----------");
		for(Card card : deck.getCards()){
			System.out.println(card.rank +" of "+ card.suit);
		}
	}

}
