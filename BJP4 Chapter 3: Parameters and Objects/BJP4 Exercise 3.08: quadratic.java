/*
Write a method called quadratic that solves quadratic equations and prints their roots. 
Recall that a quadratic equation is a polynomial equation in terms of a variable x of the form a x2 + b x + c = 0. 
The formula for solving a quadratic equation is:

image of quadratic equation

Here are some example equations and their roots:

equation	    x^2 - 7x + 12	              x^2 + 3x + 2
call	      quadratic(1, -7, 12);	    quadratic(1, 3, 2);
output	    First root = 4.0          First root = -1.0
            Second root = 3.0         Second root = -2.0


Your method should accept the coefficients a, b, and c as parameters and should print the roots of the equation. 
You may assume that the equation has two real roots, though mathematically this is not always the case.

Also, there should be two roots, one the result of the addition, the other, the result of the subtraction. 
Print the root resulting from the addition first.
*/

public static void quadratic (int a, int b, int c) {
    double firstRoot = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
    double secondRoot = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
    System.out.println("First root = " + firstRoot);
    System.out.println("Second root = " + secondRoot);
}
