public class Player {
    Hand hand;
    String name;

    public Player(Hand hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public int getScore() {
        return this.hand.getValue();
    }

    public String getName() {
        return this.name;
    }
}
