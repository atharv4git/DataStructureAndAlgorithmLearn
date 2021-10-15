package from_book.ch2questions.projects.p1;

import java.util.Scanner;

public class p1main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = """
        aaaaa
        aaaaa
        aaaaa
        bbb
        """
        ;

        //char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int Acount = 0;
        int Bcount = 0;
        int Ccount = 0;
        int Dcount = 0;
        int Ecount = 0;
        int Fcount = 0;
        int Gcount = 0;
        int Hcount = 0;
        int Icount = 0;
        int Jcount = 0;
        int Kcount = 0;
        int Lcount = 0;
        int Mcount = 0;
        int Ncount = 0;
        int Ocount = 0;
        int Pcount = 0;
        int Qcount = 0;
        int Rcount = 0;
        int Scount = 0;
        int Tcount = 0;
        int Ucount = 0;
        int Vcount = 0;
        int Wcount = 0;
        int Xcount = 0;
        int Ycount = 0;
        int Zcount = 0;
        int totalCount = 0;

    
            for(int j = 0; j <= s.length()-1 ; j++){
                totalCount++;

                    if(s.charAt(j) =='a'){
                        Acount++;
                    } if(s.charAt(j) =='b'){
                        Bcount++;
                    } if(s.charAt(j) =='c'){
                        Ccount++;
                    } if(s.charAt(j) =='d'){
                        Dcount++;
                    } if(s.charAt(j) =='f'){
                        Fcount++;
                    } if(s.charAt(j) =='g'){
                        Gcount++;
                    } if(s.charAt(j) =='h'){
                        Hcount++;
                    } if(s.charAt(j) =='i'){
                        Icount++;
                    } if(s.charAt(j) =='j'){
                        Jcount++;
                    } if(s.charAt(j) =='k'){
                        Kcount++;
                    } if(s.charAt(j) =='l'){
                        Lcount++;
                    } if(s.charAt(j) =='m'){
                        Mcount++;
                    } if(s.charAt(j) =='n'){
                        Ncount++;
                    } if(s.charAt(j) =='o'){
                        Ocount++;
                    } if(s.charAt(j) =='p'){
                        Pcount++;
                    } if(s.charAt(j) =='q'){
                        Qcount++;
                    } if(s.charAt(j) =='r'){
                        Rcount++;
                    } if(s.charAt(j) =='s'){
                        Scount++;
                    } if(s.charAt(j) =='t'){
                        Tcount++;
                    } if(s.charAt(j) =='u'){
                        Ucount++;
                    } if(s.charAt(j) =='v'){
                        Vcount++;
                    } if(s.charAt(j) =='W'){
                        Wcount++;
                    } if(s.charAt(j) =='x'){
                        Xcount++;
                    } if(s.charAt(j) =='y'){
                        Ycount++;
                    } if(s.charAt(j) =='z'){
                        Zcount++;
                    }
                
            }
        

        System.out.println("a count: "+Acount);
        System.out.println("b count: "+Bcount);
        System.out.println("c count: "+Ccount);
        System.out.println("d count: "+Dcount);
        System.out.println("e count: "+Ecount);
        System.out.println("f count: "+Fcount);
        System.out.println("g count: "+Gcount);
        System.out.println("h count: "+Hcount);
        System.out.println("i count: "+Icount);
        System.out.println("j count: "+Jcount);
        System.out.println("k count: "+Kcount);
        System.out.println("l count: "+Lcount);
        System.out.println("m count: "+Mcount);
        System.out.println("n count: "+Ncount);
        System.out.println("o count: "+Ocount);
        System.out.println("p count: "+Pcount);
        System.out.println("q count: "+Qcount);
        System.out.println("r count: "+Rcount);
        System.out.println("s count: "+Scount);
        System.out.println("t count: "+Tcount);
        System.out.println("u count: "+Ucount);
        System.out.println("v count: "+Vcount);
        System.out.println("w count: "+Wcount);
        System.out.println("x count: "+Xcount);
        System.out.println("y count: "+Ycount);
        System.out.println("z count: "+Zcount);
        System.out.println("total count: "+totalCount);

        

        scanner.close();
    }
    
}
