/*
Write a for loop that produces the following output:

1 4 9 16 25 36 49 64 81 100 
For added challenge, try to modify your code so that it does not need to use the * multiplication operator. 
(It can be done! Hint: Look at the differences between adjacent numbers.)
*/

for (int i = 1; i < 11; i++) {
    int j = i * i;
    System.out.print(j + " ");
}
