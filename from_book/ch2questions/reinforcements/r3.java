package from_book.ch2questions.reinforcements;

import java.util.Scanner;

public class r3 {
    public static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter n: ");    
        n = scanner.nextInt();

        for(int i = 2 ; i <= n ; i++){
            System.out.println("#"+(i-2)+"........"+cal(i));
        }

        scanner.close();
    }

    public static int cal(int n){
        if(n<=2){
            return n;
        }else{
            return cal(n-1)+cal(n-2);
        }
    }
    
}
