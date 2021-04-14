import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Deck deckP = new Deck();
        deckP.cards();
        System.out.println(deckP.toString());
        deckP.shuffle();
        System.out.println(deckP.toString());
        deckP.head();
        deckP.pick();
        deckP.hand();


    }
}
