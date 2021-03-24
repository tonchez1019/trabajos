import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        
        int Num;

        
        System.out.println("Dame un numero");
        Num = sc.nextInt();

        operacion proceso = new operacion(Num);

        proceso.Primos(Num);

       
 
        for (int i = 0; i < Num; i++) {
 
            System.out.print(" - " + proceso.fibonacci(i));
        }
    }

    
}
