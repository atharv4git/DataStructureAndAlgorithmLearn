package from_book.chap1questions.creativity;

import java.util.Scanner;

public class c2 {
    public static int a,b,c;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a : ");
        a = scanner.nextInt();
        System.out.print("enter b : ");
        b = scanner.nextInt();
        System.out.print("enter c : ");
        c = scanner.nextInt();

        System.out.println("----stored input----");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("checking...");
        System.out.println("\nResult :");

        check(a,b,c);

        scanner.close();
        
    }

    public static void check(int a,int b,int c){
        if((a+b)==c){
            System.out.println("can do a+b=c");
        }else{
            System.out.println("cannot do a+b=c");
        }
        
        if(a==(b-c)){
            System.out.println("can do a=b-c");
        }else{
            System.out.println("cannot do a=b-c");
        }

        if((a*b)==c){
            System.out.println("can do a*b=c");
        }else{
            System.out.println("cannot do a*b=c");
        }
    }
    
}
