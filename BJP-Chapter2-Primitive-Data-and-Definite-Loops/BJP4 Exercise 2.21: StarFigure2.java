/*
Modify your StarFigure code from the previous problem to use a constant for the size. 
The outputs below use a constant size of 3 (left) and 6 (right):

size 3	size 6
////////\\\\\\\\
////********\\\\
****************
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************
(You must solve this problem using only ONE public static final constant, not multiple constants; 
and its value must be used in the way described in this problem.)
*/

public class StarFigure2 {
    public static final int size;
    public static void main (String [] args) {
        for (int rows = 0; rows < size; rows++) {
            for (int forwardSlash = size * 4 - 4; forwardSlash > rows * 4; forwardSlash--) {
                System.out.print("/");
            }
            for (int stars = 0; stars < 8 * rows; stars++) {
                System.out.print("*");
            }
            for (int backSlash = size * 4 - 4; backSlash > rows * 4; backSlash--) {
                System.out.print("\\");
            }
            System.out.println();    
        }
    }
}
