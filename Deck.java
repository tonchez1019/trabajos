import java.lang.reflect.Array;
import java.util.*;


public class Deck {
    
    private ArrayList<Card> deck;


    public Deck() {
		deck= new ArrayList<Card>();

		for (int i = 2; i < 15; i++) {
			deck.add(new Card("" + i, "Espadas","Negro"));
			deck.add(new Card("" + i, "Diamantes","Rojo"));
			deck.add(new Card("" + i, "Treboles","Negro"));
			deck.add(new Card("" + i, "Corazones","Rojo"));
		}
        for (int i = 0; i < 52; i++) {

            int x =Integer.parseInt(deck.get(i).Valor);

            if (x >= 2 && x <= 10) {
            }

            else if (x >= 11 && x <= 14) {
                if (x == 11) {
                    deck.get(i).Valor = "J";
                } else if (x == 12) {
                    deck.get(i).Valor = "Q";
                } else if (x == 13) {
                    deck.get(i).Valor = "K";
                } else if (x == 14) {
                    deck.get(i).Valor = "A";
                } else {
                    deck.get(i).Valor = "no fue c";
                }
            }

        }
	}

    public ArrayList<Card> cards() {
		return deck;
	}

    public String toString() {
		String result = "";
		
		for (int i = 0; i < deck.size(); i++) {

			

            result += deck.get(i).Valor + "/" + deck.get(i).palo + "/" + deck.get(i).Color + "\n";
		
		}
		
		return result;
	}

    public void shuffle() {
        Collections.shuffle(deck,new Random());
        System.out.println("se mezclo el deck");
    }

    public void head(){

        System.out.println(deck.get(0).toString());
        deck.remove(0);
        System.out.println("Quedan de cartas en el deck - " + deck.size());
    }

    public void pick(){

        int auxiliar =(int)(Math.random()* deck.size());
        System.out.println(deck.get(auxiliar).toString());
        deck.remove(auxiliar);
        System.out.println("Quedan de cartas en el deck - " + deck.size());

    }

    public Card[] hand(){
        
        Card[] cartas = new Card[5];
        for (int i = 0; i < 5; i++) {

            int auxiliar =(int)(Math.random()* deck.size());
            System.out.println("au: "+auxiliar);
            System.out.println("tam: " +deck.size());
            System.out.println(deck.get(auxiliar).toString());
            cartas[i] = deck.get(auxiliar);
            deck.remove(auxiliar);  

        }
        
        System.out.println("Quedan de cartas en el deck - " + deck.size());
        
        return cartas;
    }
}
