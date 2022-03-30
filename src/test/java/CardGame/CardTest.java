package CardGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void add_points_to_player() {
        Player player1 = new Player(new String[] {"Q", "5"});

        player1.increase_score(4);

        assertEquals(player1.getScore(), 4);
    }

    @Test
    void play_game() {
        Player player1 = new Player(new String[] {"3", "5"});
        Player player2 = new Player(new String[] {"1", "7"});
        Player player3 = new Player(new String[] {"10", "2"});
        GameCard game = new GameCard();

        assertEquals(game.play(player1, player2), "Player 2 won: 0 - 2");
        assertEquals(game.play(player1, player3), "Draw: 1 - 1");
    }
    /*
    @Test
    void card_number_must_be_correct() {

    }*/
}
