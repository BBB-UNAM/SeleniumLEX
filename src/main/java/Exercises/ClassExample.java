package Exercises;

public class ClassExample {

    public void imprimirProducto(){
        System.out.println("Este es un producto nuevo");
    }

    public static void main(String args[]){
        Productos productos = new Productos();
        ClassExample  classExample = new ClassExample();
        classExample.imprimirProducto();
        productos.imprimirProducto();
    }
}

class Productos {
    public void imprimirProducto(){
        System.out.println("Este es un producto nuevo");
    }
}
