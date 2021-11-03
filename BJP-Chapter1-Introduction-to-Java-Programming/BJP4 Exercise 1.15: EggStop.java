/*
Write a complete Java program in a class named EggStop that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  ______
 /      \
/        \
\        /
 \______/

  ______
 /      \
/        \
\        /
 \______/
+--------+

  ______
 /      \
/        \
|  STOP  |
\        /
 \______/
+--------+
*/

public class EggStop {
    public static void main (String[]args) {
        hexaTop();
        hexaBottom();
        System.out.println();
        hexaTop();
        hexaBottom();
        Strip2();
        System.out.println();
        hexaTop();
        stopStrip();
        hexaBottom();
        Strip2();
    }
    
    public static void hexaTop () {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    
    public static void hexaBottom () {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    
    public static void stopStrip () {
        System.out.println("|  STOP  |");
    }
    
    public static void Strip2 () {
        System.out.println("+--------+");
    }
}
