package from_book.chap1questions.creativity;
import java.util.Scanner;

public class c3 {
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
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0 ; i<=arr.length-1 ; i++){
            for(int j = 0 ; j<=arr.length-1 ; j++){
                if((arr[i]*arr[j])%2==1){
                    System.out.println("odd");
                    count++;
                    oddCount++;
                }else{
                    System.out.println("even");
                    count++;
                    evenCount++;
                }            
            }
            
        }
        System.out.println("all count = " + count);           
        System.out.println("odd count = " + oddCount);      
        System.out.println("even count = " + evenCount);        
        
    }
}
