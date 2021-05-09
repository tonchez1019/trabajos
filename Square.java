import java.util.*;

public class Square implements shape {

    double resultado = 0;
    double lado = 0;

    // getter and setters
    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // constructor
    public Square(double lado) {
        this.lado = lado;
    }

    // interface
    @Override
    public void getArea() {

        resultado = lado * lado;
        System.out.println("El area es:" + resultado);
    }

    @Override
    public void getPerimeter() {

        resultado = lado + lado + lado + lado;

        System.out.println("El perimetro es:" + resultado);

    }

}
