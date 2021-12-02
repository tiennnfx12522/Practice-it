/*
The following code is poorly structured. Rewrite it so that it has a better structure and avoids redundancy. 
To help eliminate redundancy, convert the code into a method named spending that accepts two parameters: 
a Scanner for the console, and a String for a single person's name, 
and prints the appropriate information about that person's bills. 
Your method could be called twice (once for John and once for Jane) to replicate the original code's behavior.

Type your solution here:
Scanner console = new Scanner(System.in);
System.out.print("How much will John be spending? ");
double amount = console.nextDouble();
System.out.println();
int numBills1 = (int) (amount / 20.0);
if (numBills1 * 20.0 < amount) {
    numBills1++;
}
System.out.print("How much will Jane be spending? ");
amount = console.nextDouble();
System.out.println();
int numBills2 = (int) (amount / 20.0);
if (numBills2 * 20.0 < amount) {
    numBills2++;
}
System.out.println("John needs " + numBills1 + " bills");
System.out.println("Jane needs " + numBills2 + " bills");
*/

public static void spending(Scanner console, String name) {
    System.out.print("How much will " + name + " be spending? ");
    double amount = console.nextDouble();
    
    int numBills = (int) (amount / 20.0);
    if (numBills * 20.0 < amount) {
        numBills++;
    }
  
    System.out.println();
    System.out.println(name + " needs " + numBills + " bills");
}
