/*
Write a program in a class named StarFigure that produces the following output using for loops.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************
*/

public class StarFigure {
    public static void main (String [] args) {
        for (int rows = 0; rows < 5; rows++) {
            for (int forwardSlash = 16; forwardSlash > rows * 4; forwardSlash--) {
                System.out.print("/");
            }
            for (int stars = 0; stars < 8 * rows; stars++) {
                System.out.print("*");
            }
            for (int backSlash = 16; backSlash > rows * 4; backSlash--) {
                System.out.print("\\");
            }
            System.out.println();    
        }
    }
}
