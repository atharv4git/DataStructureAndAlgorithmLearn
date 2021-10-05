package from_book.chap1questions.reinforcements;
import java.util.Scanner;
public class r6 {
    public static int num1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();

        System.out.println("final   "+addAll());

        scanner.close();
    }

    public static int addAll(){
        int all = 0;
        int mult = 0;
        
        for(int i = 0 ; i < num1 ; i++){
           mult = i*i;
           System.out.println("#1   "+mult);
           mult += mult;
           System.out.println("#2   "+mult);
        }
        all = mult + (num1*num1);

        return all;
    }
}
