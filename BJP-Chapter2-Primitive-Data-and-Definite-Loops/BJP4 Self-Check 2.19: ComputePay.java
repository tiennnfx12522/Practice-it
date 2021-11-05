/*
The following program redundantly repeats the same expressions many times. 
Modify the program to remove all redundant expressions using variables of appropriate types. 
(Your variables should be used to help solve the overall problem. 
You must use a sufficient number of variables to receive credit for solving this problem. 
Declare and initialize each variable in its own statement on its own line.)

*/

public class ComputePay {
    public static void main(String[] args) {
        // Calculate pay at work based on hours worked each day
        int hours = 4 + 5 + 8 + 4;
        System.out.println("My total hours worked:");
        System.out.println(hours);
                  
       
        double salary = 8.75;
        System.out.println("My hourly salary: ");
        System.out.println("$" + salary);
        
        double pay = hours * salary;
        System.out.println("My total pay:");
        System.out.println(pay);
        
        double tax = pay * 0.2;
        System.out.println("My taxes owed:");
        System.out.println(tax);
    }
}
