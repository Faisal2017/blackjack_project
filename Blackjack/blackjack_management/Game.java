package blackjack_management;
import java.util.ArrayList;

public class Game() {

  private Deck deck;
  private Player player;

  public Game() {
    cardRules = new Hashmap<Enum, int>();
    
    cardRules.put(RANK.ACE, 1);
    cardRules.put(RANK.TWO, 2);
    cardRules.put(RANK.THREE, 3);
    cardRules.put(RANK.FOUR, 4);
    cardRules.put(RANK.FIVE, 5);
    cardRules.put(RANK.SIX, 6);
    cardRules.put(RANK.SEVEN, 7);
    cardRules.put(RANK.EIGHT, 8);
    cardRules.put(RANK.NINE, 9);
    cardRules.put(RANK.TEN, 10);
    cardRules.put(RANK.KING, 10);
    cardRules.put(RANK.QUEEN, 10);
    cardRules.put(RANK.JACK, 10);
  }
  


}