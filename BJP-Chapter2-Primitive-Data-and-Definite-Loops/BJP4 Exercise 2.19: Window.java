/*
Write a Java program in a class named Window that produces the preceding figure as output. 
Use nested for loops to print the repeated parts of the figure. 
Once you get it to work, add one class constant to your program so that the size of the figure can be changed 
simply by changing that constant's value. The example output shown is at a constant size of 3, 
but if you change the constant, the figure should grow larger and wider proportionally.

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
(You must solve this problem using only ONE public static final constant, 
not multiple constants; and its value must be used in the way described in this problem.)
*/

public class Window {
    public static final int size = 3;
    
    public static void main (String [] args) {
        System.out.print("+");
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < size; j++) {
                System.out.print("=");
            } 
            System.out.print("+");
        }
        System.out.println();
        
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < size; l++) {
                System.out.print("|");
                for (int m = 0; m < 2; m++){
                    for (int n = 0; n < size; n++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                } 
                System.out.println();
            }
            System.out.print("+");
            for (int i = 0; i < 2; i++) { 
                for (int j = 0; j < size; j++) {
                    System.out.print("=");
                } System.out.print("+");
            } System.out.println();
        }       
    }
}
