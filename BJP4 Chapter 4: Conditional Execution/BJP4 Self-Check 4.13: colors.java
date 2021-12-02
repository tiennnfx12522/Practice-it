/*
Write a piece of code that reads a shorthand text description of a color and prints the longer equivalent. 
Acceptable color names are B for Blue, G for Green, and R for Red.
If the user types something other than B, G, or R, the program should print an error message. 
Make your program case-insensitive so that the user can type an uppercase or lowercase letter. 

Here are two example executions:
What color do you want? R
You have chosen Red.
What color do you want? Bork
Unknown color: Bork
*/

Scanner sc = new Scanner(System.in);
System.out.print("What color do you want? ");
String input = sc.next();
if (input.equalsIgnoreCase("R")) {
    System.out.print("You have chosen Red.");
} else if (input.equalsIgnoreCase("B")) {
    System.out.print("You have chosen Blue.");
} else if (input.equalsIgnoreCase("G")) {
    System.out.print("You have chosen Green.");
} else {
    System.out.print("Unknown color: " + input);
}
