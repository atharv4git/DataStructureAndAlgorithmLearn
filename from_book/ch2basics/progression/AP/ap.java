package from_book.ch2basics.progression.AP;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = 1;
        int an;
        int am;

        

        System.out.println("enter the common difference you want:");
        int d = scanner.nextInt();

        System.out.println("enter total no. of element you want:");
        int n = scanner.nextInt();

        am=a1 + (n-1)*d;

        System.out.println("==========================");

        for(int i = 1 ; i <= n ; i++){
            an = a1 + (i-1)*d;
            System.out.println("#"+i+"...."+an);
            if(i==n){
                System.out.println("============END============");
            }
        }

        int sum = (n*(a1+am))/2;

        System.out.println("sum: "+sum);

        scanner.close();
    }
    
}
