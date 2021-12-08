/*
Using "Boolean Zen," write an improved version of the following method, which returns whether the given string starts 
and ends with the same character. (In other words, remove unnecessary logical tests and remove if/else statements 
that test the value of a boolean variable.)

Type your solution here:
public static boolean startEndSame(String str) {
    if (str.charAt(0) == str.charAt(str.length() - 1)) {
        return true;
    } else {
        return false;
    }
}
*/

public static boolean startEndSame(String str) {
    return str.charAt(0) == str.charAt(str.length() - 1);
}
