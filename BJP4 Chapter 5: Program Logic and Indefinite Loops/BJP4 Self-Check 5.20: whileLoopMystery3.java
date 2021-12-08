/*
Given the following method:

public static int mystery(int x, int y) {
    while (x != 0 && y != 0) {
        if (x < y) {
            y = y - x;
        } else {
            x = x - y;
        }
    }
    return x + y;
}
Write the value returned by each of the following calls.

mystery(3, 3)	
mystery(5, 3)	
mystery(2, 6)	
mystery(12, 18)	
mystery(30, 75)
*/

a. mystery(3, 3) --->	3
b. mystery(5, 3) --->	1
c. mystery(2, 6) --->	2
d. mystery(12, 18) --->	6
e. mystery(30, 75) --->	15
