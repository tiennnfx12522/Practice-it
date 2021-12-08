/*
Write a sentinel loop that repeatedly prompts the user to enter a number and, once the number -1 is typed, 
displays the maximum and minimum numbers that the user entered. Here is a sample dialogue:

Type a number (or -1 to stop): 5
Type a number (or -1 to stop): 2
Type a number (or -1 to stop): 17
Type a number (or -1 to stop): 8
Type a number (or -1 to stop): -1
Maximum was 17
Minimum was 2
*/

int sentinel = -1; 
System.out.print("Type a number (or " + sentinel + " to stop): ");
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
int max = input;
int min = input;
while (input != sentinel) {
    if (input < min) {
        min = input;
    } else if (input > max) {
        max = input;
    } 
    
    System.out.print("Type a number (or " + sentinel + " to stop): ");
    input = sc.nextInt();
}

if (min != sentinel) {
    System.out.println("Maximum was " + max);
    System.out.println("Minimum was " + min);
}
