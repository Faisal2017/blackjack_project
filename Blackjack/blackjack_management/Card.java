package blackjack_management;

public class Card {

  RankType rank;
  SuitType suit;

  public Card(RankType rank, SuitType suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public RankType getRank() {
    return this.rank;
  }

  public SuitType getSuit() {
    return this.suit;
  }

}