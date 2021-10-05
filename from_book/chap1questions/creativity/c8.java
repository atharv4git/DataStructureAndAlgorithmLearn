package from_book.chap1questions.creativity;
import java.util.Scanner;

public class c8 {
    public  static Integer[] arr1 = new Integer[8];
    public  static Integer[] arr2 = new Integer[8];
    public  static Integer[] c = new Integer[8];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("enter array 1: ");
        for(int a = 0 ; a < arr1.length ; a++) {
            arr1[a] = scanner.nextInt();
            System.out.println("array element #"+a+" stored as "+arr1[a]+" successfully");
        }

        System.out.println("enter array 2: ");
        for(int a = 0 ; a < arr2.length ; a++) {
            arr2[a] = scanner.nextInt();
            System.out.println("array element #"+a+" stored as "+arr2[a]+" successfully");
        }
        System.out.println("processing...");
        System.out.println("new array: ");        
        processing();

        int count2 = 0;

        for(int i : c){
            count2++;
            System.out.println("printing #"+count2);
            System.out.println(i);
        }

        scanner.close();   
    }

    public static void processing(){
        int count = 0;
        for(int i = 0; i <= c.length-1 ; i++){
            count++;
            System.out.println("processing #" + count);
            c[i] = arr1[i]*arr2[i];
        }
        
    }
}
