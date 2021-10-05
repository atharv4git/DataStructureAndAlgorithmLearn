package from_book.chap1questions.Projects.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class p1type3 {
    public static ArrayList<String> array1 = new ArrayList<String>(8);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println("<ascedending>");

        for (int i = 0; i < array1.size(); i++){
            array1.add(i,scanner.next());
        }

        System.out.println("<descending>");

        for(int i = array1.size() - 1; i >= 0; i--){
            System.out.println(array1.get(i));
        }

        scanner.close();
    }    
}
