package from_book.ch2basics.progression.fibonacci;

import java.util.Scanner;

public class fib {
    public static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter n: ");    
        n = scanner.nextInt();

        for(int i = 0 ; i <= n ; i++){
            System.out.println("#"+i+"........"+cal(i));
        }

        scanner.close();
    }

    public static int cal(int n){
        if(n<=1){
            return n;
        }else{
            return cal(n-1)+cal(n-2);
        }
    }
    
}
