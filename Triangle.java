public class Triangle implements shape {

    double resultado;
    double base, altura, lado;

    // getters and setters
    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // constructor
    public Triangle(double lado, double base, double altura) {
        
        this.lado=lado;
        this.base=base;
        this.altura=altura;
    }

    // interface
    @Override
    public void getArea() {

        resultado = (base * altura) / 2;
        System.out.println("El area es:" + resultado);
    }

    @Override
    public void getPerimeter() {

        resultado = lado + lado + base;
        System.out.println(base +" "+ altura +" "+ lado);
        System.out.println("El perimetro es:" + resultado);

    }

}
