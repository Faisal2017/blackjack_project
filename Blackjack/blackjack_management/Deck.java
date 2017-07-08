package blackjack_management;
import java.util.ArrayList;

public class Deck {

  private Card card;
  private ArrayList<Card> deck;


  public Deck() {
    this.deck = new ArrayList<Card>();

    for (Suit suit : Suit.values())
      for (Rank rank : Rank.values())

        deck.add(new Card(rank, suit));
  }



  // public void createDeck() {


  // public void setUpDeck() {

  //     Enum[] cardsToAdd = {
            
  //       for (Card card : card.getRank()) {
  //         Enum.add(card);
  //       }

  //       for (Card card : card.getSuit()) {
  //         Enum.add(card);
  //       }

  // }




  // private void setUpAnswers() {

  //     String[] answersToAdd = {
  //             "The Stars Have Not Yet Spoken",
  //             "More Tea Leaves Required",
  //             "I Wouldn't Bet On it",
  //             "The Answer You Seek Is Behind You"
  //     };

  //     for (String answer : answersToAdd) {
  //         this.answers.add(answer);
  //     }
  // }
}