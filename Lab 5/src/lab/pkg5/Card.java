//Name: Kyle Johnson
//Class: ETEC2104
//Section: 02
//Assignment: 5
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

/**
 *
 * @author Brumo
 */
public abstract class Card {
    //in Suit.java
    public enum Suit {
        HEARTS, CLUBS, DIAMONDS, SPADES
    }
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;
    protected int rank;
    protected Suit suit;
    public int getRank(){
        return this.rank;       //'this' is optional
    }
    public Suit getSuit(){
        return this.suit;
    }
    public Card(int rank, Suit suit){
        if( rank < 2 || rank > Card.ACE )
            throw new RuntimeException("Bad rank");
        this.rank = rank;
        this.suit = suit;
    }
    public abstract boolean outranks( Card other, Suit lead, Suit trump );
    
    public String toString()
    {
        if(this.getSuit() == Suit.SPADES && this.getRank() <= 10)
        {
            return this.rank + " of Spades";
        }
        if(this.getSuit() == Suit.SPADES && this.getRank() == 11)
        {
            return "Jack" + " of Spades";
        }
        if(this.getSuit() == Suit.SPADES && this.getRank() == 12)
        {
            return "Queen" + " of Spades";
        }
        if(this.getSuit() == Suit.SPADES && this.getRank() == 13)
        {
            return "King" + " of Spades";
        }
        if(this.getSuit() == Suit.SPADES && this.getRank() == 14)
        {
            return "Ace" + " of Spades";
        }
        if(this.getSuit() == Suit.HEARTS && this.getRank() <= 10)
        {
            return this.rank + " of Hearts";
        }
        if(this.getSuit() == Suit.HEARTS && this.getRank() == 11)
        {
            return "Jack" + " of Hearts";
        }
        if(this.getSuit() == Suit.HEARTS && this.getRank() == 12)
        {
            return "Queen" + " of Hearts";
        }
        if(this.getSuit() == Suit.HEARTS && this.getRank() == 13)
        {
            return "King" + " of Hearts";
        }
        if(this.getSuit() == Suit.HEARTS && this.getRank() == 14)
        {
            return "Ace" + " of Hearts";
        }
        if(this.getSuit() == Suit.HEARTS && this.getRank() <= 10)
        {
            return this.rank + " of Hearts";
        }
        if(this.getSuit() == Suit.DIAMONDS && this.getRank() == 11)
        {
            return "Jack" + " of Hearts";
        }
        if(this.getSuit() == Suit.DIAMONDS && this.getRank() == 12)
        {
            return "Queen" + " of Diamonds";
        }
        if(this.getSuit() == Suit.DIAMONDS && this.getRank() == 13)
        {
            return "King" + " of Diamonds";
        }
        if(this.getSuit() == Suit.DIAMONDS && this.getRank() == 14)
        {
            return "Ace" + " of Diamonds";
        }
        if(this.getSuit() == Suit.DIAMONDS && this.getRank() <= 10)
        {
            return this.rank + " of Diamonds";
        }
        if(this.getSuit() == Suit.CLUBS && this.getRank() == 11)
        {
            return "Jack" + " of Clubs";
        }
        if(this.getSuit() == Suit.CLUBS && this.getRank() == 12)
        {
            return "Queen" + " of Clubs";
        }
        if(this.getSuit() == Suit.CLUBS && this.getRank() == 13)
        {
            return "King" + " of Clubs";
        }
        if(this.getSuit() == Suit.CLUBS && this.getRank() == 14)
        {
            return "Ace" + " of Clubs";
        }
        if(this.getSuit() == Suit.CLUBS && this.getRank() <= 10)
        {
            return this.rank + " of Clubs";
        }
        else
        {
            return "Not a Standard Card";
        }
    }
    public boolean matchesSuit( Suit s )
    {
        if(this.getSuit() == s)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}