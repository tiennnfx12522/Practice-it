/*
The following code is poorly structured. It contains redundant statements that unnecessarily occur multiple times. 
Factor out redundant code from the following example by moving it out of the if/else statement, 
while preserving the same behavior and output.

Type your solution here:
if (x < 30) {
    a = 2;
    x++;
    System.out.println("Java is awesome! " + x);
} else {
    a = 2;
    System.out.println("Java is awesome! " + x);
}
*/

a = 2;
if (x < 30) {
    x++;
    }
System.out.println("Java is awesome! " + x);
