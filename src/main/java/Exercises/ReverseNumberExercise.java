package Exercises;

import java.util.Scanner;

public class ReverseNumberExercise {
    public static void main(String args[]){
        System.out.println("Introduce a number with two characters: ");
        Scanner number =new Scanner(System.in);

        int invertido = 0;
        int secondnum = 0;

        int num = number.nextInt();

        while(num > 0){
            secondnum = num % 10;
            invertido = (secondnum * 10) + (num / 10);
            num = 0;
        }

        System.out.println("The reverse number of " + num + " is " + invertido);

    }
}
