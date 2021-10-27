package from_book.ch2questions.creativity.c11;

import java.io.*;

public class Bob {
    public static String inpack;
    public static void main(String[] args) {

        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("c11f1.txt"));
            inpack = br.readLine();
        
        }catch(IOException e){

        }  
        System.out.println(inpack);

    }
    public static void decrease(){
        int i=Integer.parseInt(inpack);  
        i--;
    }
    
}
