/*
Given the following method:

public static void mystery(int x) {
    int y = 0;
    while (x % 2 == 0) {
        y++;
        x = x / 2;
    }
    System.out.println(x + " " + y);
}
Write the output of each of the following calls.

mystery(19);	
mystery(42);	
mystery(48);	
mystery(40);	
mystery(64);
*/
mystery(19); ---> 19 0
mystery(42); ---> 21 1
mystery(48); ---> 3 4
mystery(40); ---> 5 3
mystery(64); ---> 1 6

