package Exercises;

public class AverageSales {
    public static void main(String[] args) {
        int sum = 0;
        int[] sales = { 6, 9, 7, 10, 11, 9, 7, 12, 14, 15, 13, 11 };
        for (int index = 0; index <= 6; index++) {
            sum += sales[index];
        }
        float average = (float) sum / 6;
        System.out.println("Average sale for first half of the year: " + average);
    }
}
