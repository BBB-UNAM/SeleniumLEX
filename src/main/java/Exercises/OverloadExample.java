package Exercises;

public class OverloadExample {
    public static void main(String args[]){
        Areas areas = new Areas();
        System.out.println(areas.area(3.45558));
        System.out.println(areas.area(10,12));
        System.out.println(areas.area(4.587));

    }
}

class Areas{

    public final double Pi = 3.141592;

    public double area(double radio){
        return Math.pow(radio, 2) * this.Pi;
    }

    public int area(int a, int b){
        return a * b;
    }

    public float area(float lado){
        return (float) Math.pow(lado, 2);
    }
}
