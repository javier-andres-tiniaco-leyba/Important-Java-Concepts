// Nested enums are implicitly static

class Card {
    enum Suit {
        DIAMONDS("Diamonds"),
        CLUBS("Clubs"),
        HEARTS("Hearts"),
        SPADES("Spades");

        private String text;

        Suit(String text) {
            this.text = text;
        }

        String getText() {
            return text;
        }
    }

    enum Rank {
        ACE("Ace"),
        DEUCE("Deuce"),
        THREE("Three"),
        FOUR("Four"),
        FIVE("Five"),
        SIX("Six"),
        SEVEN("Seven"),
        EIGHT("Eight"),
        NINE("Nine"),
        TEN("Ten"),
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King");

        private String text;

        Rank(String text) {
            this.text = text;
        }

        String getText() {
            return text;
        }
    }

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    // Investigate differences between this method and next one
    public static String rankToString(Rank rank) {
        Rank R = rank;
        for (Rank r : Rank.values()) {
            if (r.equals(rank))
                R = r;
        }
        return R.getText();
    }

    public static String suitToString(Suit suit) {
        Suit S = suit;
        for (Suit s : Suit.values()) {
            if (s.equals(suit))
                S = s;
        }
        return S.getText();
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
            rank.getText(),
            suit.getText()
            );
    }

    public static String toString(Card card) {
        return String.format("%s of %s",
            card.getRank().getText(),
            card.getSuit().getText()
            );
    }


    // Next to methods are not necesary, since only predefined values
    // can be choosen, so invalid ranks can NOT be passed.
    // Notice also that <=, =>, <, > can not be used with enums,
    // compareTo() method inherited from Comparable Interface
    // must be used instead for comparisons
    // public static boolean isValidRank(Card.Rank rank) {
    //     return Card.Rank.DIAMONDS <= rank && rank <= Card.Rank.SPADES;
    // }
    // public static boolean isValidSuit(Card.Suit suit) {
    //     return Suit.DIAMONDS <= suit && suit <= Suit.SPADES;
    // }

}

// There should be a better way to implement this using enumMap
class Deck {

    private java.util.List<Card> deck = new java.util.ArrayList<>();

    public Deck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card getCard(Card.Rank rank, Card.Suit suit) {
        Card card = new Card(rank, suit);
        for (Card c : deck) {
            if (c.getRank() == rank && c.getSuit() == suit)
                card = c;
        }
        return card;
    }
}

class Test {
    public static void main(String[] args) {
        Card card = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
        System.out.println(Card.rankToString(Card.Rank.ACE));
        System.out.println(Card.suitToString(Card.Suit.DIAMONDS));
        System.out.println(Card.toString(card));
        System.out.println(card.toString());

        Deck deck = new Deck();
        System.out.println(deck.getCard(Card.Rank.KING, Card.Suit.SPADES));
    }
}
