package ExercisesJava;

public class AbstractaClassExample {
    public static void main(String args[]){
        Circulo c =  new Circulo(4);
        Rectangulo r = new Rectangulo(10,5);
        Triangulo t = new Triangulo(3,6);

        System.out.println(c.area());
        System.out.println(r.area());
        System.out.println(t.area());

    }
}

abstract class FiguraGeometrica {
    public abstract double area();
}

class Rectangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Rectangulo(double b, double a){
        this.base = b;
        this.altura = a;
    }

    public double area(){
        return this.base * this.altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }
}

class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double r){
        this.radio = r;
    }

    public double area(){
        return Math.PI * Math.pow(this.radio,2);
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }
}

class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double B, double A){
        this.base = B;
        this.altura = A;
    }

    public double area(){
        return (this.base * this.altura) / 2;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getalturAltura(){
        return this.altura;
    }
}
