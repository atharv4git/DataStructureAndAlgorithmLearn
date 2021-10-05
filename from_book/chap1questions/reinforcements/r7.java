package from_book.chap1questions.reinforcements;
import java.util.Scanner;

public class r7 {
    public static String str;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str = scanner.next();

        searchVowels();

        scanner.close();        
    }

    public static int searchVowels(){
        int Slen = str.length();
        char[] chr = str.toCharArray();
        int Vcount = 0;

        for (int i = 0; i < Slen; i++){
            char c = chr[i];
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.println("vovel found "+(Vcount+1));
                ++Vcount;                                
            }
        }

        return Vcount;
    }
    
}
