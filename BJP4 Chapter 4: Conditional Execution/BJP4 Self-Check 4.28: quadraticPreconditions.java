/*
Exercise 3.8 asked you to write a method called quadratic that solves quadratic equations and prints their roots. 
Recall that a quadratic equation is a polynomial equation in terms of a variable x of the form a x2 + b x + c = 0. 
The formula for solving a quadratic equation is:
Image of quadratic equation

Here are some example equations and their roots:

equation	        x2 - 7x + 12	             x2 + 3x + 2
call	        quadratic(1, -7, 12);	      quadratic(1, 3, 2);
output	        First root = 4.0          First root = -1.0
                Second root = 3.0         Second root = -2.0

But for some values of a, b, and c, the formula does not find any valid roots. 
Under what conditions would this formula fail? 
Modify the quadratic method so that it will reject invalid values of a, b, or c by throwing an IllegalArgumentException.
(You may want to go back and complete the exercise in the previous chapter first.)
*/

public static void quadratic(int a, int b, int c) {
        double preSqrt = b * b - 4 * a * c;
    if (a == 0) {
        throw new IllegalArgumentException( "Invalid value of a");
    }
    if (preSqrt < 0) {
        throw new IllegalArgumentException( "Invalid determinant");
    }
	    double r1 = (-b + Math.sqrt(preSqrt)) / (2 * a);
	    double r2 = (-b - Math.sqrt(preSqrt)) / (2 * a);
	    
	    System.out.println("First root = " + r1);
	    System.out.println("Second root = " + r2);
	}
