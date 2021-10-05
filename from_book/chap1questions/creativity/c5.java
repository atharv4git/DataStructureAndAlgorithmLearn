package from_book.chap1questions.creativity;
import java.util.Scanner;

public class c5 {
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
        int count = 0;
        int sameCount = 0;
        int distinctCount = 0;
        for(int i = 0 ; i<=arr.length-1 ; i++){
            for(int j = i+1 ; j<=arr.length-1 ; j++){
                if(arr[i]==arr[j]){
                    sameCount++;
                    System.out.println("found " + sameCount + " same pair");
                    count++;
                }else{
                    distinctCount++;
                    System.out.println("found " + distinctCount + " distinct pair");
                    count++;
                }            
            }
            
        }
        System.out.println("all count = " + count);           
        System.out.println("same count = " + sameCount);      
        System.out.println("distinct count = " + distinctCount);         
        
    }
}
