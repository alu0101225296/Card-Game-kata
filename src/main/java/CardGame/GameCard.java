package CardGame;

public class GameCard {
    int numberOfCards = 2;
    GameCard(){};

    String play(Player player1, Player player2) {
        Card[] player1Cards = player1.getCards();
        Card[] player2Cards = player2.getCards();

        for(int i = 0; i < player1Cards.length; i++) {
            if(player1Cards[i].higher(player2Cards[i]))
                player1.increase_score(1);
            else if (player2Cards[i].higher(player1Cards[i]))
                player2.increase_score(1);
        }

        if(player1.getScore() > player2.getScore())
            return String.format("Player 1 won: %d - %d", player1.getScore(), player2.getScore());
        if(player1.getScore() < player2.getScore())
            return String.format("Player 2 won: %d - %d", player1.getScore(), player2.getScore());
        return String.format("Draw: %d - %d", player1.getScore(), player2.getScore());
    }
}
