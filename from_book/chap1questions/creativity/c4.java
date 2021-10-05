package from_book.chap1questions.creativity;

import java.util.Scanner;

public class c4 {
    static int num;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number greater than two: ");
        num = scanner.nextInt();

        int c = numOfDivisibles();  
        
        System.out.println(c);
        
        scanner.close();
    }

    public static int numOfDivisibles(){
        int count = 0;

        while(true){
            if(num<2){
                break;
            }else{
                num=num-2;
                count++;
            }
        }

        return count;
    }
}
