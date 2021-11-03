/*
Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
*/

public class StarFigures{
    public static void main (String[]args){
        Shape1();
        System.out.println();
        Shape1();
        Shape2();
        Shape1();
    }
    
    public static void Shape1 () {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    
    public static void Shape2 () {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
