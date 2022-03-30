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

    @Test
    void can_create_new_player() {
        Player player1 = new Player(new String[] {"Q", "5"});

        assertNotNull(player1);
    }

    @Test
    void play_game() {
        Player player1 = new Player(new String[] {"Q", "5"});
        Player player2 = new Player(new String[] {"A", "7"});

        assertEquals(play(player1, player2), "Player 2 win: 2 - 0");
    }
}
