package from_book.ch2questions.reinforcements;

import java.util.Scanner;

public class r6 {
    public static Integer array1[] = new Integer[8];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println("<ascedending>");

        for (int i = 0; i < array1.length; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.println("<descending>");

        try{
            for(int i = array1.length; i >= 0; i--){
                System.out.println(array1[i]);
            }
        }catch (Exception e){
            System.out.println("Don't try buffer overflow in Java!");
        }

        scanner.close();
    }
    
}
