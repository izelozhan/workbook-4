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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game! \n");
        System.out.println("How many players?");

        int numberOfPlayers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter player " + (i + 1) + " name: "); //ndx 0, add +1
            String playerName = scanner.nextLine();
            players.add(new Player(playerName));
        }

        deck.shuffle();

        for (Player player: players){
            player.getHand().deal(deck.deal());
            player.getHand().deal(deck.deal());
        }
    }
}
