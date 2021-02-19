package ExercisesJava;

public class CastExercise {
    public static void main(String args[]){

        //this is a basic example of implicit cast
        int a = 10;
        long b = a;
        double c = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //this is a basi example of explicit cast

        int d = 20;
        float e;
        e = (float) ((float)d / 3.56);
        System.out.println(e);

    }
}
