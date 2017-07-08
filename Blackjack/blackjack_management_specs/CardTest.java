import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(RankType.KING, SuitType.CLUBS);
  }

  @Test
  public void canGetRank() {
    assertEquals(RankType.KING, card.getRank());
  }
}