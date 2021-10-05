package from_book.chap1questions.reinforcements;

import java.util.Scanner;

public class r3 {
    public static int a;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter a number : ");
        int num1 = scanner.nextInt();
        a = (num1%2);
        System.out.println(isOdd());

        scanner.close();
    }

    public static boolean isOdd(){
        boolean isOdd = false;
        if(a==0){
            isOdd = false;
        }else{
            isOdd = true;
        }

        return isOdd;
        
    }
}
