package from_book.chap1questions.creativity;

import java.util.ArrayList;
import java.util.Collections;

public class c7 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("c");
        arr1.add("a");
        arr1.add("r");
        arr1.add("b");
        arr1.add("o");
        arr1.add("n");

        for(int i = 1 ; i <= 36 ; i++){
            Collections.shuffle(arr1);
            System.out.println(arr1);
        }
    }
    
}
