public class Card {
    String suit;
    String value;
    boolean isFaceUp;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue() {
        if (isFaceUp) {
            return switch (value) {
                case "J", "Q", "K" -> 10;
                case "A" -> 11;
                default -> Integer.parseInt(value);
            };
        } else {
            return 0;
        }
    }

    public boolean flip() {
        return isFaceUp = !isFaceUp;
    }

}
