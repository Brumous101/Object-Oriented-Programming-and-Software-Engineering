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
public class SlobberhannesCard extends Card{
    public SlobberhannesCard(int rank, Suit suit){
        super(rank, suit);
    }
    @Override
    public boolean outranks(  Card other, Card.Suit lead, Card.Suit trump ) {
        if(this.suit == lead)
        {
            if(other.suit == lead)
            {
                if(this.rank > other.rank)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
        else // Could make all this return false but makes logic more easy to understand
        {
            if(other.suit == lead)
            {
                return false;
            }
            else
            {
                return false;
            }
        }
    }
}
