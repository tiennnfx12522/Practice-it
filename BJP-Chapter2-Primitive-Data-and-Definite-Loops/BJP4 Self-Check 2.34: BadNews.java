/*
Suppose that you are trying to write a program that produces the following output using loops. The program below is an attempt at a solution, but it contains at least four major errors. Identify and fix them all.

1 3 5 7 9 11 13 15 17 19 21 
1 3 5 7 9 11 
*/

public class BadNews {
    public static final int MAX_ODD = 21;

    public static void writeOdds() {
        // print each odd number
        for (int count = 1; count <= MAX_ODD; count += 2) {
            System.out.print(count + " ");
        }

        // print new line
        System.out.println();
    }
    
    public static void writeOddsHalf() {
        // print each odd number
        for (int count = 1; count <= (MAX_ODD + 2) / 2; count += 2) {
            System.out.print(count + " ");
        }
    }    

    public static void main(String[] args) {
        // write all odds up to 21
        writeOdds();

        // now, write all odds up to 11
        writeOddsHalf();
    }
}
