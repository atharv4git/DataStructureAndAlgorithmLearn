package from_book.ch2basics.progression.GP;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int r;
        int n;
        int an;

        System.out.println("enter a: ");
        a = scanner.nextInt();

        System.out.println("enter r: ");
        r = scanner.nextInt();

        System.out.println("enter n: ");
        n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++){
            an = a*((int)Math.pow(r,(i-1)));
            System.out.println("#"+i+"..."+an);
        }

        int sum = (a*(1-(int)Math.pow(r,n)))/(1-r);

        System.out.println("sum: "+sum);

        scanner.close();

    }
    
}
