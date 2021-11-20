/*
Write code to read an integer from the user, then print that number multiplied by 2. 
You may assume that the user types a valid integer. A sample run of the code would produce the following:

Type an integer: 4
4 times 2 = 8
*/

Scanner sc = new Scanner(System.in);
System.out.print("Type an integer: ");
int number = sc.nextInt();
System.out.print(number + " times 2 = " + number * 2);
