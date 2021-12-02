/*
Write a Java program called DollarFigure that produces the following output. 
Use nested for loops to capture the structure of the figure.

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************
*/

public class DollarFigure {
    public static void main (String [] args) {
        for (int rows = 0; rows < 7; rows++) {
            for (int stars = 0; stars < rows * 2; stars++) {
                System.out.print("*");
            }
            for (int money = 7; money > rows; money--) {
                System.out.print("$");
            }
            for (int midStars = 14; midStars > rows * 2; midStars--) {
                System.out.print("*");
            }
            for (int money = 7; money > rows; money--) {
                System.out.print("$");
            }    
            for (int stars = 0; stars < rows * 2; stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
