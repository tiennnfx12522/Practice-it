/*
Modify your DollarFigure program from the previous exercise to become a new program called DollarFigure2 
that uses a global constant for the figure's height. 
(You may want to make loop tables first.) The previous output used a constant height of 7. 
The outputs below use a constant size of 3 (left) and 5 (right):

size 3	

$$$******$$$
**$$****$$**
****$**$****

size 5

$$$$$**********$$$$$
**$$$$********$$$$**
****$$$******$$$****
******$$****$$******
********$**$********

(You must solve this problem using only ONE public static final constant, not multiple constants; 
and its value must be used in the way described in this problem.)
*/

public class DollarFigure2 {
    public static final int size;
    public static void main (String [] args) {
        for (int rows = 0; rows < size; rows++) {
            for (int stars = 0; stars < rows * 2; stars++) {
                System.out.print("*");
            }
            for (int money = size; money > rows; money--) {
                System.out.print("$");
            }
            for (int midStars = size * 2; midStars > rows * 2; midStars--) {
                System.out.print("*");
            }
            for (int money = size; money > rows; money--) {
                System.out.print("$");
            }    
            for (int stars = 0; stars < rows * 2; stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
