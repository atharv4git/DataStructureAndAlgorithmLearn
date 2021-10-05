package from_book.chap1questions.creativity;
import java.util.ArrayList;
import java.util.Collections;

public class c6 {
    public  static Integer[] arr = new Integer[3];
    public static void main(String[] args) {        

        ArrayList<Integer> solution = new ArrayList<>();
            for (int i = 1; i <= 54; i++) {
                solution.add(i);
            } 

            int count = 0;
            
            for(int i = 1 ; i<=2916 ; i++){
                count++;
                System.out.println("array #" + count);
                Collections.shuffle(solution);
                System.out.println(solution);
            }
                
    }

}
