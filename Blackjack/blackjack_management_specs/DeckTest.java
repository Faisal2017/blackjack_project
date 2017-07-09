import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import blackjack_management.*;

public class DeckTest {

  private Deck deck;

  @Before
  public void before() {
    deck = new Deck(); 
  }

  @Test
  public void testDeckNumbers() {
    assertEquals(52, deck.cardCount());
  }

  @Test
  public void testDeckShuffle() {
    deck.shuffle();
    assertNotNull(deck.getCard());
  }

}