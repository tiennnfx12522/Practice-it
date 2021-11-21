/*
Write a method named smallestLargest that asks the user to enter numbers, 
then prints the smallest and largest of all the numbers typed in by the user. 
You may assume the user enters a valid number greater than 0 for the number of numbers to read. 
Here is an example dialogue:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11
*/

public static void smallestLargest() {
    Scanner input = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int number = input.nextInt();
    System.out.print("Number 1: ");
    int firstNumber = input.nextInt();
    int min = firstNumber;
    int max = firstNumber;
    
    for (int i = 2; i <= number; i++) {
        System.out.print("Number " + i + ": ");
        int num = input.nextInt();
        if (num < min) {
            min = num;
        } 
        if (num > max) {
            max = num;
        }
    }
    System.out.println("Smallest = " + min);
    System.out.println("Largest = " + max);
}
