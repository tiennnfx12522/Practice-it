/*
Write a method named isVowel that returns whether a String is a vowel 
(a single-letter string containing a, e, i, o, or u, case-insensitively).
*/

public static boolean isVowel (String input) {
    input = input.toLowerCase();
    return input.equals("a") || input.equals("e") || input.equals("i") || 
        input.equals("o") || input.equals("u");
}
