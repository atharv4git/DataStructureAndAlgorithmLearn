package from_book.chap1questions.Projects.p1;

import java.util.Scanner;

public class p1type1 {
    public static String array1[] = new String[8];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n1 = scanner.next();
        String n2 = scanner.next();
        String n3 = scanner.next();
        String n4 = scanner.next();
        String n5 = scanner.next();
        String n6 = scanner.next();

        scanner.close();

        System.out.println("<reverse>");

        System.out.println(n6);
        System.out.println(n5);
        System.out.println(n4);
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);
        
    }    
}
