package CardGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CardTest {
    @Test
    void create_valid_card() {
       Card card = new Card("2");
       assertNotNull(card);
    }
}
