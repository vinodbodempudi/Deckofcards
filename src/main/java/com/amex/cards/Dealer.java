package com.amex.cards;

import java.util.Collections;

public class Dealer {

	public void shuffleCards(DeckOfCards deck) {
		Collections.shuffle(deck.getCards());

	}

	public void sortCards(DeckOfCards deck) {
		Collections.sort(deck.getCards());

	}

}
