package io.robusta.hand.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck{

	
	private static final long serialVersionUID = -4686285366508321800L;
	
	public Deck() {

	}
	
	@Override
	public Card pick() {
		
		// shuffle;
		// remove card from deck and returns it
		Collections.shuffle(this);	
		return this.pollFirst();
	}


	

	@Override
	public TreeSet<Card> pick(int number) {
		int i= 0;
		TreeSet<Card> cards=new TreeSet<>();
		// reuse pick()
		while(i<number){
			cards.add(this.pick());	
			i++;
		}
		return cards;
	}

	
	
	@Override
	public Hand giveHand() {
		Hand hand = new Hand();
		hand.addAll(pick(5));
		return hand;
	}
	
	// A hand is a **5** card TreeSet
}
