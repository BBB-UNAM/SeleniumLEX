package ExercisesJava;

import java.util.Scanner;

public class LuckyNumberExercise {
    public static void main(String args[]){

        System.out.println("Give me a lucky number");
        do{
            Scanner mynumber = new Scanner(System.in);
            Integer number = mynumber.nextInt();
            String numString= number.toString();

            if(numString.length() == 4){
                Character a = numString.charAt(1);
                Character b = numString.charAt(3);
                double aa = Math.pow(Character.getNumericValue(a),2);
                double bb = Math.pow(Character.getNumericValue(b),2);

                if((aa % 9 == 0) & (bb % 9 == 0)){
                    System.out.println("This is a lucky number");
                }else{
                    System.out.println("This is not a lucky number");
                }
                break;
            } else{
                System.out.println("This is not a valid number");
            }
        }while(true);
        //Scanner mynumber = new Scanner(System.in);
        //Integer number = mynumber.nextInt();
        //String numString= number.toString();
        //System.out.println(numString.charAt(3));
    }
}
