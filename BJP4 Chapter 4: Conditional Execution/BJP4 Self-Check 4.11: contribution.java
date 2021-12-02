/*
Rewrite the code below by factoring to eliminate redundancy. Your code must produce the same results.
To simplify things, you may assume that the user always types 1 or 2 for the multiplier.

Type your solution here:
System.out.print("Is your money multiplied 1 or 2 times? ");
int times = console.nextInt();

if (times == 1) {
    System.out.print("And how much are you contributing? ");
    int donation = console.nextInt();
    sum = sum + donation;
    count1++;
    total = total + donation;
}
if (times == 2) {
    System.out.print("And how much are you contributing? ");
    int donation = console.nextInt();
    sum = sum + 2 * donation;
    count2++;
    total = total + donation;
}
*/

System.out.print("Is your money multiplied 1 or 2 times? ");
int times = console.nextInt();

System.out.print("And how much are you contributing? ");
int donation = console.nextInt();

if (times == 1) {
    sum = sum + donation;
    count1++;
} else {
    sum = sum + (2 * donation);
    count2++;
}

total = total + donation;
