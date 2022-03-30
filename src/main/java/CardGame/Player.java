package CardGame;

public class Player {
    private Card[] playerCards;
    private int score;

    Player(String[] cards) {
        playerCards = new Card[cards.length];
        for(int i = 0; i < cards.length; i++)
            playerCards[i] = new Card(cards[i]);
        score = 0;
    }

    int getScore() {
        return score;
    }

    void increase_score(int addition) {
        score += addition;
    }

    Card[] getCards() {
        return playerCards;
    }
}
