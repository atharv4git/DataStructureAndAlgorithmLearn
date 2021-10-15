package from_book.ch2questions.creativity.c11;

import java.util.Scanner;

public class Alice {
    public static int numpack;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter no. of packages you wanna send: ");
        numpack = scanner.nextInt();


        scanner.close();

    }
   
}
