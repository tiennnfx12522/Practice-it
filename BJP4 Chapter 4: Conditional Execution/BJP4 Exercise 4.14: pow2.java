/*
Write a method named pow2 (a variation of the previous pow exercise) that accepts a real number base and an integer exponent as parameters 
and returns the base raised to the given power. Your code should work for both positive and negative exponents. 
For example, the call pow2(2.0, -2) returns 0.25. Do not use Math.pow in your solution.

*/

public static double pow2 (double base, int exp) {
    double result = 1;
    if (exp == 0) {
        result = 1;
    } else if (exp < 0) {
        for (int i = 0; i > exp; i--) {
            result *= 1/base;
        }
    } else {
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
    }
    return result;
}
