package CardGame;

public class Player {
    private Card[] playerCards = new Card[2];
    private Number score;

    Player(String[] cards) {
        for(int i = 0; i < cards.length; i++)
            playerCards[i] = new Card(cards[i]);
        score = 0;
    }

    Number getScore() {
        return score;
    }

    void increase_score(Integer addition) {
        score = addition.intValue() + score.intValue();
    }
}
