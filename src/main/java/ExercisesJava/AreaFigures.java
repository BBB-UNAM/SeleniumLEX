package ExercisesJava;

import java.util.Scanner;

public class AreaFigures {
    public static void main(String args[]){

        System.out.println("Calculo de area de figuras geometricas usando POO");
        System.out.println("Menu de opciones de area de figuras");
        System.out.println("a - Cuadrado");
        System.out.println("b - triangulo");
        System.out.println("c - Circulo");
        System.out.println("d - Rectangulo");
        System.out.println("e - Salir");

        Figuras figuras = new Figuras();


        String Option;
        char option;

        do {

            Option = "";
            option = '\0';

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduca la opcion seleccionada: ");
            Option = scanner.nextLine();
            option = Option.charAt(0);

            switch (option) {

                case 'a':
                    System.out.println("Introduca un lado del cuadrado");
                    double lado1 = scanner.nextDouble();
                    //figuras.cuadrado(lado1);
                    System.out.println("El area del cuadrado es " + figuras.cuadrado(lado1));
                    break;

                case 'b':
                    System.out.println("Introduca la base del triangulo:");
                    float base = scanner.nextFloat();
                    System.out.println("Introduca la altura del triangulo:");
                    float altura = scanner.nextFloat();
                    System.out.println("El area del triangulo es :" + figuras.triangulo(base, altura));
                    break;

                case 'c':
                    System.out.println("Introduca el radio del circulo");
                    double radio = scanner.nextDouble();
                    System.out.println("El area del triagulo es: " + figuras.circulo(radio));
                    break;

                case 'd':
                    System.out.println("Introduca la base del rectangulo: ");
                    float baseR = scanner.nextFloat();
                    System.out.println("Introduca la altura del rectangulo: ");
                    float alturaR = scanner.nextFloat();
                    System.out.println("La base del rectangulo es: " + figuras.rectangulo(baseR, alturaR));
                    break;
            }
            scanner.close();

        } while(option != 'e');

    }
}

class Figuras{

    public double cuadrado(double lado){
        return Math.pow(lado,2);
    }

    public float triangulo(float a, float b){
        return a * b / 2;
    }

    public double circulo(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public float rectangulo(float base, float altura){
        return base * altura;
    }
}
