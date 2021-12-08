/*
For each of the following do/while loops, how many times will the loop execute its body? 
Remember that "zero," "infinity," and "unknown" are legal answers.

a)
int x = 1;
do {
    System.out.print(x + " ");
    x += 10;
} while (x < 100);
b)
int max = 10;
do {
    System.out.println("count down: " + max);
    max--;
} while (max < 10);
c)
int x = 250;
do {
    System.out.println(x);
} while (x % 3 != 0);
d)
int x = 100;
do {
    System.out.println(x);
    x = x / 2;
} while (x % 2 == 0);
e)
int x = 2;
do {
    System.out.print(x + " ");
    x *= x;
} while (x < 200);
f)
String word = "a";
do {
    word = "b" + word + "b";
} while (word.length() < 10);
System.out.println(word);
g)
int x = 100;
do {
    System.out.println(x / 10);
    x = x / 2;
} while (x > 0);
h)
String str = "/\\";
do {
    str += str;
} while (str.length() < 10);
System.out.println(str);
*/

a. ---> 10
b. ---> infinity
c. ---> infinity
d. ---> 2
e. ---> 3
f. ---> 5
g. ---> 7
h. ---> 3
