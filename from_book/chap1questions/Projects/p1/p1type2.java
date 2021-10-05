package from_book.chap1questions.Projects.p1;

import java.util.Scanner;

public class p1type2 {
    public static String array1[] = new String[8];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println("<ascedending>");

        for (int i = 0; i < array1.length; i++){
            array1[i] = scanner.next();
        }

        System.out.println("<descending>");

        for(int i = array1.length - 1; i >= 0; i--){
            System.out.println(array1[i]);
        }

        scanner.close();
    }
}
