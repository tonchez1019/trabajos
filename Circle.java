import java.util.*;

public class Circle implements shape {

    double resultado = 0;
    double radio = 0;
    double perimetro = 0;

    // getters and setters
    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    // constructor
    public Circle(double radio) {
        this.radio = radio;
    }

    // interface
    @Override
    public void getArea() {

        resultado = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es:" + resultado);
    }

    @Override
    public void getPerimeter() {

        resultado = 2 * Math.PI * radio;

        System.out.println("El perimetro es:" + resultado);

    }

}
