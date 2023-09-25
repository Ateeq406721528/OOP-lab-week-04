package Week4;

public class Card {
    final String ranks;
    final String suit;

    // constructor......
    Card(String ranks, String suit) {
        this.ranks = ranks;
        this.suit = suit;
    }

    public String getRank() {
        return ranks;
    }
    public String getSuit() {
        return suit;
    }

    // toString Function....
    public String toString() {

        return String.format("%s of %s",ranks, suit);
    }

    //Signature function (equal)...
    public boolean equals(Object o) {

        Card temp = (Card)o;
        return (this.ranks.equals(temp.ranks) && this.suit.equals(temp.suit));
    }
}
