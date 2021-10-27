package from_book.ch2questions.creativity.c11;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Alice {
    public static int numpack;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter no. of packages you wanna send: ");
        numpack = scanner.nextInt();

        try{

            File file = new File("c11f1.txt");

            if(!file.exists()){
                file.createNewFile();
            }   

            PrintWriter pw = new PrintWriter(file);
            pw.println(numpack);
            pw.close();
            System.out.println("done");
        }

        
        
        catch(IOException e){
            e.printStackTrace();

        }


        
        
        scanner.close();

    }
   
}