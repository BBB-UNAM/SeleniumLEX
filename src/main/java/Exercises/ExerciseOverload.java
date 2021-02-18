package Exercises;

import java.util.Scanner;

public class ExerciseOverload {
    public static void main(String args[]){
        Point points = new Point();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a X1 number");
        
    }
}

class Point{
    double x1;
    double y1;

    public double distance(){
        return Math.sqrt(Math.pow(this.x1,2)+Math.pow(this.y1,2));
    }

    public double distance(double x2, double y2){
        return Math.sqrt(Math.pow((x2 - this.x1),2) + Math.pow((y2 - this.y1),2));
    }

    public void setX(double a){
        this.x1 = a;
    }

    public void setY(double b){
        this.y1 = b;
    }

    ///vedvbiurbuiberuvuire

}
