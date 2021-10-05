package from_book.chap1questions.Projects.p2;

import java.util.Scanner;

public class p2type1 {
    public static final String usrname = "akayyy";
    public static final int pass = 1234;
    public static int baseAmount = 5001;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter username:");
        String enteredUsrname = scanner.next();
        System.out.print("enter password:");
        int enteredPass = scanner.nextInt();

        if(enteredUsrname == usrname) {
            System.out.println("username is correct checking password");
        }else{
            System.out.println("invalid username");
        }

        if(enteredPass == pass) {
            System.out.println("Welcome "+usrname);
        }else{
            System.out.println("Invalid Password");
        }

        System.out.println("select what you wanna do:");
        System.out.println("1. access account");
        System.out.println("2. debit 500 rupee");
        System.out.println("3. credit 1000 rupee");
        int in = scanner.nextInt();

        switch(in){
            case 1: accDetails();
                    break;

            case 2: debit();
                    break;  
                    
            case 3: credit();
                    break;   
                 
            default: System.out.println("wrong entry , try again later");        
                    
        }

        scanner.close();
    }    

    public static void debit(){
        if(baseAmount>501){
            baseAmount = baseAmount - 500;   
            System.out.println("ballence - 500 was successful"); 
            System.out.println("current ballence :"+baseAmount); 
        }else{
            System.out.println("gareeb op");
        }   
    }

    public static void credit(){
        baseAmount = baseAmount +1000;     
        System.out.println("ballence + 1000 was successful"); 
        System.out.println("current ballence :"+baseAmount);    
    }

    public static void accDetails(){
        System.out.println("username : " + usrname);
        System.out.println("current amount in your account: "+baseAmount);                        
    }
}
