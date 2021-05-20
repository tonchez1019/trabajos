import java.util.*;
import java.util.Collections;

public class Array {

    public ArrayList<String> lista = new ArrayList<String>();

    public ArrayList<String> getLista() {
        return this.lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public void contenido() {
        lista.add("salmon");
        lista.add("bistec");
        lista.add("cabeza");
        lista.add("chorizo");
        lista.add("puerquita");
        lista.add("cochinilla");
        lista.add("trompo");
        lista.add("cerdo");
        lista.add("tibom");
        lista.add("cobe");
    }


    public void Anonima() {


        System.out.print("Metodo Anonima Alfabeticamente");
        Array Orden = new Array() {
            @Override

            public void contenido() {
                
                Collections.sort(Array.this.lista);
                System.out.println("\n"+Array.this.lista);
            }
        };
        Orden.contenido();

        System.out.print("\n"+"Metodo Anonima Longitud");
        Array Ordenl = new Array() {
            @Override

            public void contenido() {
                Collections.sort(Array.this.lista, Comparator.comparing(String::length));
                System.out.println("\n"+Array.this.lista);
            }
        };
        Ordenl.contenido();

    }

    public void lamba(){
        System.out.print("Metodo Lamba Alfabeticamente");
        lista.sort((p1, p2) -> p1.compareTo(p2));
        System.out.println(lista+"\n");

        System.out.print("Metodo Lamba Longitud");
        lista.sort((s1, s2) -> Math.abs(s1.length() - "intelligent".length()) - Math.abs(s2.length() - "intelligent".length()));
        System.out.println(lista+"\n");
    }

    public void Alfa(){

        System.out.print("Metodo referencia Alfabeticamente");
        lista.sort((p1, p2) -> p1.compareTo(p2));
        System.out.println(lista+"\n");
    }

    public void longi(){

        System.out.print("Metodo Referencia Longitud");
        lista.sort((s1, s2) -> Math.abs(s1.length() - "intelligent".length()) - Math.abs(s2.length() - "intelligent".length()));
        System.out.println(lista+"\n");
    }
    
}
