import java.util.ArrayList;
import java.util.Arrays;

public class operacion {

    int Num;
    int arreglo[];

    public operacion(int Num) {
        this.Num= Num;
    }

    public void Primos(int Num) {
        int x=0;

        ArrayList<Integer> lista = new ArrayList<Integer>(); 

        for (int i = 0; lista.size() < Num; i++) {

            x = esPrimo(i);
            lista.add(x);
            lista.removeAll(Arrays.asList(Integer.valueOf(0)));
            
        }

        System.out.println(lista);
    }

    public static int esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
        if(numero % contador == 0)
            primo = false;
            contador++;
        }
        if(primo)
        {
            return numero;
        }
        else
        {
            return 0;
        }
}

    public int fibonacci(int Num){

    

        if (Num == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (Num == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacci(Num - 1) + fibonacci(Num - 2);
        }
    }
}
    

