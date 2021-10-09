package from_book.ch2questions.reinforcements;

import java.util.Scanner;

public class r4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = 1;
        int an;
        int l = (int)Math.pow(2,63)-1;

        

        System.out.println("enter the common difference you want:");
        int d = scanner.nextInt();

        System.out.println("enter total no. of element you want:");
        int n = scanner.nextInt();

        System.out.println("==========================");

        for(int i = 1 ; i <= n ; i++){
            an = a1 + (i-1)*d;
            System.out.println("#"+i+"...."+an);
            if(i==n){
                System.out.println("============END============");
            }
        }

        int num = ((l-a1)/128)+1;
        System.out.println(num);

        

        scanner.close();
    }
    
}
