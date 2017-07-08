import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import blackjack_management.*;

public class DeckTest {

  // private Card card;
  private ArrayList<Card> deck;

  // @Before
  // public void before() {
  //   card = new Card
  // }

  @Test
  public void testDeckNumbers() {
    assertEquals(52, deck);
  }
}