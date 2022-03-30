package CardGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CardTest {
    @Test
    void create_valid_card() {
       Card card = new Card("2");
       assertNotNull(card);
    }

    @Test
    void compare_cards() {
        Card card1 = new Card("3");
        Card card2 = new Card("8");
        Card card3 = new Card("Q");

        assertEquals(card1.higher(card2), false);
        assertEquals(card3.higher(card2), true);
    }
}
