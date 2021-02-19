package ExercisesJava;

import java.util.Scanner;

public class AreaFiguras {
    public static void main(String args[]){
        System.out.println("Calculo de areas de figuras geometricas: Elija la opcion deseada:");
        System.out.println("a - Triangulo");
        System.out.println("b - Cuadrado");
        System.out.println("c - Rectangulo");
        System.out.println("d - Circulo");
        System.out.println("e - salir");

        Scanner scanner = new Scanner(System.in);
        char option2;
        String option;

        do{
            //option = null;
            option = scanner.nextLine();
            option2 = option.charAt(0);

            switch (option2){
                case 'a':
                    System.out.println("Introdusca la base del tringulo: ");
                    float base = scanner.nextFloat();
                    System.out.println("Introduca la altura del triangulo:");
                    float altura = scanner.nextFloat();
                    System.out.println("El area del triangulo es igual a: "+ (base * altura /2));
                    break;

                case 'b':
                    System.out.println("Introdusca un lado del cuadrado:");
                    float lado = scanner.nextFloat();
                    System.out.println("El area del cuadrado es" + Math.pow(lado, 2));
                    break;

                case 'c':
                    System.out.println("Introdusca la base del rectangulo:");
                    float base1 = scanner.nextFloat();
                    System.out.println("Introdusca la altura delrectangulo");
                    float altura1 = scanner.nextFloat();
                    System.out.println("El area del rectangulo es igual a " + (base1 * altura1));
                    break;
                case 'd':
                    System.out.println("Introdusca el radio del circulo");
                    float radio = scanner.nextFloat();
                    System.out.println("El radio del circulo es igual a : " + (3.1416 * Math.pow(radio, 2)));
                    break;
                case 'e':
                    break;
            }
        }while(option2 != 'e');
    }
}
