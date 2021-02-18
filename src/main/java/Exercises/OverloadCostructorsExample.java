package Exercises;

public class OverloadCostructorsExample {


    public static void main (String args[]){
        Movie m1 = new Movie();
        Movie m2 = new Movie(1001,"ToyStory");

        System.out.println("El Id es: " + m1.getMovieId());
        System.out.println("El nombre es: " + m1.getMovieName());
        System.out.println("Eñ precio es: " + m1.getTicketPrice());

        System.out.println("El Id es: " + m2.getMovieId());
        System.out.println("El nombre es: " + m2.getMovieName());
    }
}

class Movie{

    private int movieId;
    private String movieName;
    private double ticketPrice;

    public Movie(){
        ticketPrice = 100;
        movieName = "Happy feet";
        movieId =5165;
    }
    public Movie(int id, String Name){
        this.movieId = id;
        this.movieName = Name;
    }

    public int getMovieId(){
        return this.movieId;
    }

    public String getMovieName(){
        return this.movieName;
    }

    public double getTicketPrice(){
        return this.ticketPrice;
    }
}
