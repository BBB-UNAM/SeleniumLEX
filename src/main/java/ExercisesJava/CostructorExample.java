package ExercisesJava;

public class CostructorExample {
    public static void main(String args[]){
        Product product = new Product("class");
    }
}

class Product {
    public Product(String cadena){ //this is a cotruct method
        System.out.println("This is the constructor of product " + cadena);
    }
}


