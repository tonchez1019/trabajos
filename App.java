import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int num;
        double aul,base,altura;
        String respuesta = "done";

       

        System.out.println("Bienvenido \n Que figura deseas calcular \n 1- cuadrado \n 2-Circulo \n 3-Triangulo"); 
        num = sc.nextInt();

        sc.nextLine();

        System.out.println("Quieres calular el perimetro o area? ");
        respuesta = sc.nextLine();


        switch (num) {
            case 1:
                System.out.println("dame el Tamaño de lado: ");
                aul = sc.nextInt();
                Square cuadrado = new Square(aul);

                if (respuesta != "area") {

                    cuadrado.getArea();

                } else {

                    cuadrado.getPerimeter();

                }

                break;
            case 2:
                System.out.println("dame el Tamaño de lado: ");
                aul = sc.nextInt();

                Circle circulo = new Circle(aul);

                if (respuesta != "area") {
                    circulo.getArea();
                } else {
                    circulo.getPerimeter();
                }
                break;

            case 3:
                System.out.println("dame el Tamaño de lado: ");
                aul = sc.nextDouble();
                System.out.println("dame el Tamaño de la base: ");
                base = sc.nextDouble();
                System.out.println("dame el Tamaño de altura : ");
                altura = sc.nextDouble();

                Triangle triangulo = new Triangle(aul, base, altura);

                if (respuesta != "area") {
                    System.out.println("dame el Tamaño de la base: ");
                    base = sc.nextDouble();
                    System.out.println("dame el Tamaño de altura : ");
                    altura = sc.nextDouble();
                    triangulo.getArea();
                } else {
                    triangulo.getPerimeter();
                }
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}
