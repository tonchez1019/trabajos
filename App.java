import java.util.Random;
import java.util.Scanner;

public class App2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        int respuesta=1;
        Deck deckP = new Deck();
     


        System.out.println("Bienvenido a Poker");
        
        while(respuesta != 0){
            
        System.out.println("Selecciona una opcion" + "\n" + "1- Mezclar deck \n 2- Sacar Carta \n 3- Carta al alzar \n 4- Generar una mano de 5 cartas \n 0- Salir");
        respuesta = sc.nextInt();

        switch (respuesta) 
        { 
            case 1: 
                deckP.shuffle();
                     break;
            case 2:  
                deckP.head();
                     break;
            case 3:  
                deckP.pick();
                     break;
            case 4:  
                deckP.hand();
                     break;
            case 0: 
                System.out.println("Gracias por jugar ");
                break;
            default:
                System.out.println("Error");
                break;
            }
        }
    }
}
