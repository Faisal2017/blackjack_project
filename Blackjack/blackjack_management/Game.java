package blackjack_management;
import java.util.ArrayList;
import java.util.HashMap;

public class Game {

  private Deck deck;
  private ArrayList<Player> players;
  private HashMap<Enum, Integer> cardRules;

  public Game() {
    this.deck = new Deck();
    this.players = new ArrayList<Player>();
    //deck.shuffle();
    cardRules = new HashMap<Enum, Integer>();
    
    cardRules.put(Rank.ACE, 1);
    cardRules.put(Rank.TWO, 2);
    cardRules.put(Rank.THREE, 3);
    cardRules.put(Rank.FOUR, 4);
    cardRules.put(Rank.FIVE, 5);
    cardRules.put(Rank.SIX, 6);
    cardRules.put(Rank.SEVEN, 7);
    cardRules.put(Rank.EIGHT, 8);
    cardRules.put(Rank.NINE, 9);
    cardRules.put(Rank.TEN, 10);
    cardRules.put(Rank.KING, 10);
    cardRules.put(Rank.QUEEN, 10);
    cardRules.put(Rank.JACK, 10);
  }

  // public int checkValue(Card card){
  //   return cardRules.get(card.getRank());
  // }

  public void addPlayer(Player player) {
    this.players.add(player);
  }

  public int checkValue(ArrayList<Card> hand) {
    int valueOfCards = 0;

    for (Card card : hand) {
      valueOfCards += cardRules.get(card.getRank());
    }

    return valueOfCards;
  }
  
  public void dealCardFromDeck(Player player) {
    Card dealtCard = deck.getCard();
    deck.removeCard(0);
    player.addCardToHand(dealtCard);
  }


}