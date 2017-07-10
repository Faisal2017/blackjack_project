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


  @Before
  public void before() {
    game = new Game();
    card1 = new Card(Rank.KING, Suit.CLUBS);
    card2 = new Card(Rank.TWO, Suit.HEARTS);
    card3 = new Card(Rank.FIVE, Suit.DIAMONDS);
    card4 = new Card(Rank.SEVEN, Suit.SPADES);
    Player player1 = new Player("Player One");
    Player player2 = new Player("Player Two");
  }

  

}