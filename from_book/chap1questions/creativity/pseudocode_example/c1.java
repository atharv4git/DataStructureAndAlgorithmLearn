package from_book.chap1questions.creativity.pseudocode_example;
import java.util.Scanner;

public class c1 {
    public  static Integer[] arr = new Integer[8];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("enter an array: ");
        for(int a = 0 ; a < arr.length ; a++) {
            arr[a] = scanner.nextInt();
            System.out.println("array element #"+a+" stored as "+arr[a]+" successfully");
        }
        System.out.println("processing...");
        
        processing();

        scanner.close();   
    }

    public static void processing(){
        int b1 = (arr[0]<arr[1])?arr[1]:arr[0];
        int b2 = (arr[2]<arr[3])?arr[3]:arr[2];
        int b3 = (arr[4]<arr[5])?arr[5]:arr[4];
        int b4 = (arr[6]<arr[7])?arr[7]:arr[6];

        int b5 = (b1<b2)?b2:b1;
        int b6 = (b3<b4)?b4:b3;

        int biggest = (b5<b6)?b6:b5;

        System.out.println(biggest + " is the biggest element in the array you entered."); 
    }
}
