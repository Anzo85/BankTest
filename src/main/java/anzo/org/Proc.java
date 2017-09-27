package anzo.org;

import java.util.List;


public class Proc {

    Card card;
    List<Card> cards ;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proc proc = (Proc) o;

        if (card != null ? !card.equals(proc.card) : proc.card != null) return false;
        return cards != null ? cards.equals(proc.cards) : proc.cards == null;

    }

    @Override
    public int hashCode() {
        int result = card != null ? card.hashCode() : 0;
        result = 31 * result + (cards != null ? cards.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Proc{" +
                "card=" + card +
                ", cards=" + cards +
                '}';
    }


}
