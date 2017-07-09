package blackjack_management;

public class Card {

  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  // public String toString() {
  //   String card = "";
  //   card += rank.getRank() + suit.getSuit();
  //   return card;
  // }

}