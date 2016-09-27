package com.amex.cards;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DealerTest {

	Dealer dealer;
	DeckOfCards deck;
	DeckOfCards newDeck;

	@Before
	public void setUp() {
		dealer = new Dealer();
		deck = new DeckOfCards();
		newDeck = new DeckOfCards();
	}

	@Test
	public void testShuffleCards() {
		dealer.shuffleCards(deck);

		Assert.assertFalse(deck.getCards().equals(newDeck.getCards()));

	}
	
	@Test
	public void testSortCards() {
		dealer.shuffleCards(deck);
		dealer.sortCards(deck);

		Assert.assertTrue(deck.getCards().equals(newDeck.getCards()));

	}

}
