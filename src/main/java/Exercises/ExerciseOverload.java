package Exercises;

import java.util.Scanner;

public class ExerciseOverload {
    public static void main(String args[]){
        Point points = new Point();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a X1 number");
        double xx1 = scanner.nextDouble();

        System.out.println("Give me a Y1 number");
        double yy1 = scanner.nextDouble();

        System.out.println("Give me a X2 number");
        double xx2 = scanner.nextDouble();

        System.out.println("Give me a Y2 number");
        double yy2 = scanner.nextDouble();

        points.setX(xx1);
        points.setY(yy1);

        System.out.println("The distance of p1 from the origin is " + points.distance());

        System.out.println("The distance of p1 from p2 is " + points.distance(xx2,yy2));

        
    }
}

class Point{
    private double x1;
    private double y1;

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
