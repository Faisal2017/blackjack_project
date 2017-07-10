import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;
import java.util.ArrayList;

public class GameTest {

  private Game game;
  private Card card1;
  private Card card2;
  private Card card3;
  private Card card4;
  private Player player1;
  private Player player2;


  @Before
  public void before() {
    card1 = new Card(Rank.KING, Suit.CLUBS);
    card2 = new Card(Rank.TWO, Suit.HEARTS);
    card3 = new Card(Rank.FIVE, Suit.DIAMONDS);
    card4 = new Card(Rank.SEVEN, Suit.SPADES);
    player1 = new Player("Player One");
    player2 = new Player("Player Two");
    game = new Game();
    game.addPlayer(player1);
    game.addPlayer(player2);
  }

  @Test
  public void playerCanRecieveCard() {
    game.dealCardFromDeck(player1);
    assertEquals(1, player1.getHand().size());
  }

  @Test
  public void playerRecievesAceOfHeartsCard() {
    game.dealCardFromDeck(player1);
    assertEquals("ACE OF HEARTS", player1.getHand().get(0).toString());
  }  

  @Test
  public void playersCardhasValue() {
    game.dealCardFromDeck(player1);
    ArrayList<Card> hand = player1.getHand();
    int result = game.checkValue(hand);
    assertEquals(1, result);
  }
  
  @Test
  public void playersHandHasValue() {
    game.dealCardFromDeck(player2);
    game.dealCardFromDeck(player2);
    game.dealCardFromDeck(player2);
    ArrayList<Card> cards = player2.getHand();
    int result = game.checkValue(cards);
    assertEquals(3, result);
  }

  //note player has been given specific cards directly in below test
  @Test
  public void comparePlayerHands() {
    player1.addCardToHand(card1);
    player1.addCardToHand(card2);
    player2.addCardToHand(card3);
    player2.addCardToHand(card4);
    assertEquals(player1, game.compareHands());
  }

}