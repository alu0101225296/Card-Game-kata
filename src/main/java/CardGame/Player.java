package CardGame;

public class Player {
    Card[] playerCards = new Card[2]; // cte para size?  COMPROBAR QUE TIENE TAMANO IGUAL EN CONSTRUCTOR

    Player(String[] cards) {
        for(int i = 0; i < cards.length; i++)
            playerCards[i] = new Card(cards[i]);
    }
}
