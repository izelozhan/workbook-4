import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Deck deck;
    ArrayList<Player> players;

    public Game(){
        deck = new Deck();
        players = new ArrayList<>();
    }

    public void startGame(){
        String[] names = {"Izel", "Million", "Noah", "Gio"};

        for(String name: names) {
            Hand hand = new Hand();
            for (int i = 0; i < 2; i++) {
                Card currentCard = deck.deal();
                hand.deal(currentCard);
            }
            Player player = new Player(hand, name);
            players.add(player);
        }
        Player winner = null;

        for(Player player: players) {
            System.out.println("Player : " + player.getName() + " has " + player.getScore() );
            if (player.getScore() > 21) {
                continue;
            }
            if(winner == null) {
                winner = player;
            }
            else {
                if(player.getScore() > winner.getScore()) {
                    winner = player;
                }
            }
        }

        // Declare winner
        System.out.println("\n\n");
        if (winner == null) {
            System.out.println("Everyone busted!");
        }
        else {
            System.out.println("The winner: " + winner.getName() + " with " + winner.getScore() + "🎉");
        }


    }
}
