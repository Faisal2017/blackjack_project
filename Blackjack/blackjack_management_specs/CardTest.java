import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(Rank.KING, Suit.CLUBS);
  }

  @Test
  public void canGetRank() {
    assertEquals(Rank.KING, card.getRank());
  }

  @Test
  public void canGetSuit() {
    assertEquals(Suit.CLUBS, card.getSuit());
  }
}