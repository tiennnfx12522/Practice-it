/*
Write a method called printPowersOf2 that accepts a maximum number as an argument 
and prints each power of 2 from 20 (1) up to that maximum power, inclusive. 
For example, consider the following calls:

printPowersOf2(3);
printPowersOf2(10);
These calls should produce the following output:

1 2 4 8
1 2 4 8 16 32 64 128 256 512 1024
You may assume that the value passed to printPowersOf2 is 0 or greater. 
(The Math class may help you with this problem. 
If you use it, you may need to cast its results from double to int 
so that you don't see a .0 after each number in your output. 
Also, can you write this program without using the Math class?)
*/

import java.util.Math;
public static void printPowersOf2 (double max) {
    for (double i = 0; i <= max; i++) {
        int output = (int) Math.pow(2, i);
        System.out.print(output + " ");
    }
}


/*
No Math class solution
public static void printPowersOf2 (int max) {
    int output = 1;
    for (int i = 0; i <= max; i++) {
        System.out.print(output + " ");
        output *=2;
    }
}
*/
