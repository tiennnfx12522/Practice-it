/*
Write code to produce a cumulative product by multiplying together many numbers that are read from the console. Match the following format:

How many numbers? 4
Next number --> 7
Next number --> 2
Next number --> 3
Next number --> 15
Product = 630
*/

Scanner sc = new Scanner(System.in);
System.out.print("How many numbers? ");
int numbers = sc.nextInt();
int product = 1;
for (int i = 0; i < numbers; i++) {
    System.out.print("Next number --> ");
    int input = sc.nextInt();
    product *= input;
}
System.out.print("Product = " + product);
