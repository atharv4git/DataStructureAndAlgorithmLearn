package from_book.chap1questions.reinforcements;
import java.util.Scanner;

public class r8 {
    public static String str;
    public static Character chr[];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str = scanner.next();

        deleteCharecters();

        scanner.close();        
    }

    public static int deleteCharecters(){
        int Slen = str.length();
        char[] chr = str.toCharArray();
        int Ccount = 0;
        //StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Slen; i++){
            //Character c = chr[i];
            if(chr[i]=='~' || chr[i]=='!' || chr[i]=='@' || chr[i]=='#' || chr[i]=='$' || chr[i]=='%' || chr[i]=='^' || chr[i]=='&' || chr[i]=='*' ||chr[i]=='(' ||chr[i]==')' ||chr[i]=='-' ||chr[i]=='_' ||chr[i]=='=' ||chr[i]=='+' ||chr[i]=='{' ||chr[i]=='}'){
                System.out.println("chars found "+(Ccount+1));
                ++Ccount;
                String strNew = str.replaceAll("([!-@])", "");
                System.out.println(strNew);
            }
        }

        return Ccount;
    }
    
}