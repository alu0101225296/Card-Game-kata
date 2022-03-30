package CardGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    private List<String> cards = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
    private String cardValue;

    Card(String value) {
        if(!cards.contains(value))
            return; // check throw exception
        cardValue = value;
    }

    boolean higher(Card other) {
        return cards.indexOf(this.cardValue) > cards.indexOf(other.cardValue);
    }
}
