package blackjack_management;
import java.util.ArrayList;
import java.util.HashMap;

public class Game {

  private Deck deck;
  private Player player;

  public Game() {
    HashMap<Enum, Integer> cardRules = new HashMap<Enum, Integer>();
    
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
  
  public void dealCardFromDeck(Player player) {
    dealtCard = deck.get(0);
    deck.remove(0);
    return player.add(dealtCard);
  }

}