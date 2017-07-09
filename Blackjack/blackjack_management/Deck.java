package blackjack_management;
import java.util.ArrayList;

public class Deck {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
    this.setUpDeck();
  }

  public int cardCount() {
    return this.deck.size();
  }

  public void setUpDeck() {
    this.deck = new ArrayList<Card>();

    for (Rank rank : Rank.values()){
      for (Suit suit : Suit.values()){

        Card card = new Card(rank, suit);
        deck.add(card);
      }
    }
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