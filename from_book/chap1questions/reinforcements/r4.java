package from_book.chap1questions.reinforcements;
import java.util.Scanner;
public class r4 {
    public static int num1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();

        System.out.println(addAll());

        scanner.close();
    }

    public static int addAll(){
        int all = 0;
        int ini = 0;
        
        for(int i = 0 ; i <= num1 ; i++){
           ini += i; 
           System.out.println(ini);
        }
        all = ini + num1;

        return all;
    }
}
