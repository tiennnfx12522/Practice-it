/*
Using "Boolean Zen," write an improved version of the following method, 
which returns whether the given number of cents would require any pennies 
(as opposed to being an amount that could be made exactly using coins other than pennies): 
(In other words, remove unnecessary logical tests and remove if/else statements that test the value of a boolean variable.)

Type your solution here:
public static boolean hasPennies(int cents) {
    boolean nickelsOnly = (cents % 5 == 0);
    if (nickelsOnly == true) {
        return false;
    } else {
        return true;
    }
}
*/

public static boolean hasPennies(int cents) {
    return cents % 5 != 0;
}
