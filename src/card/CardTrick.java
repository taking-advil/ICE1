/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * 
 * Alex Yu
 * 991756815
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.ceil(Math.random() * 13));
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random() * 4)]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        for (int n = 0; n < magicHand.length; n += 1){
            System.out.printf("%d of %s\n",magicHand[n].getValue(), magicHand[n].getSuit());
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs

        //Ace of spades
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit(Card.SUITS[2]);
        
        //Search every item in the Card array for a match
        String result = "The card is not in the magic hand.";
        for(int n = 0; n < magicHand.length; n += 1) {
            if(magicHand[n].getValue() == luckyCard.getValue() &&
            magicHand[n].getSuit().equals(luckyCard.getSuit())) {
                result = "The card is inside the magic hand.";
                break;
            }
        }
        System.out.println(result);
    }
    
}
