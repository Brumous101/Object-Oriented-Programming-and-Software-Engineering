/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;


public class WarCard extends Card{
    public WarCard(int rank, Suit suit){
        super(rank, suit);
    }
    @Override
    public boolean outranks(  Card other, Suit lead, Suit trump ) {
        if(this.rank > other.rank)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}