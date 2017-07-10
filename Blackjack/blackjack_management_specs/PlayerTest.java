import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;
import java.util.ArrayList;

public class PlayerTest {

  private Player player;

  @Before
  public void Before() {
    player = new Player("Player One");
  }

  @Test
  public void testhasName() {
    assertEquals("Player One", player.getName());
  }
}