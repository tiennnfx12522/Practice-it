/*
// a.
System.out.println("a.");
int max = 5;
for (int n = 1; n <= max; n++) {
    System.out.println(n);
}
System.out.println();

// b.
System.out.println("b.");
int total = 25;
for (int number = 1; number <= (total / 2); number++) {
    total = total - number;
    System.out.println(total + " " + number);
}
System.out.println();

// c.
System.out.println("c.");
for (int i = 1; i <= 2; i++) {
    for (int j = 1; j <= 3; j++) {
        for (int k = 1; k <= 4; k++) {
            System.out.print("*");
        }
        System.out.print("!");
    }
    System.out.println();
}
System.out.println();

// d.
System.out.println("d.");
int number = 4;
for (int count = 1; count <= number; count++) {
    System.out.println(number);
    number = number / 2;
}
*/

// a.
System.out.println("a.");
int max = 5;
int n = 1;
while (n <= max) {
    System.out.println(n);
    n++;
}
System.out.println();

// b.
System.out.println("b.");
int total = 25;
int number = 1;
while (number <= (total / 2)) {
    total = total - number;
    System.out.println(total + " " + number);
    number++; 
}
System.out.println();

// c.
System.out.println("c.");
int i = 1; 
while (i <= 2) {
    int j = 1;
    while (j <= 3) {
        int k = 1; 
        while (k <= 4) {
            System.out.print("*");
            k++; 
        }
        System.out.print("!");
        j++; 
    }
    System.out.println();
    i++; 
}
System.out.println();

// d.
System.out.println("d.");
int numberx = 4;
int count = 1;
while (count <= numberx) {
    System.out.println(numberx);
    numberx = numberx / 2;
    count++;
}
