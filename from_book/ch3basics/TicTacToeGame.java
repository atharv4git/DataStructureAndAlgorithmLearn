package from_book.ch3basics;

import java.util.Random;
import java.util.Scanner;

//the assignment of strings is not happening through array
//forloop bug


public class TicTacToeGame {
    public static String line1[] = new String[5];
    public static String line2[] = new String[5];
    public static String line3[] = new String[5];
    public static String line4[] = new String[5];
    public static String line5[] = new String[5];
    public static int playerPos = 0;
    public static int PcPos = 0;
    public static String elementPos[][] = new String[3][3];
    public static String playerPosArray[][] = new String[3][3];
    public static String PcPosArray[][] = new String[3][3];
    public static String pc = "";
    public static String player = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~~~  welcomme to tic tac toe  ~~~~~");       

        show();

        System.out.println("choose x or o:");
        player = scanner.next();

        if(player.equals("x")){
            pc = "o";
        }else{
            pc = "x";
        }

        System.out.println("pc: "+ pc);


        System.out.println("enter the position in which you want your "+player+" in: ");
        playerPos = scanner.nextInt();

        Random rand = new Random();

        PcPos = rand.nextInt(9);
        System.out.println(PcPos);  
        
        setPlayer();
        setPC();

        show();

        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);



        scanner.close();   
    }
    public static void show(){

        line1[1] = line1[3] = line2[1] = line2[3] = "|";
        line3[1] = line3[3] = line4[1] = line4[3] = "|";
        line5[1] = line5[3]= "|";

        line2[0] = line2[2] = line2[4] = "----";
        line4[0] = line4[2] = line4[4] = "----";
        line2[0] = line2[2] = line2[4] = "----";
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);

        

        for(int i = 0 ; i < 5; i++) {
            System.out.println("assignment of postions started in player board");
            if(i%2==0){
                for(int j = 0 ; j <= 2 ; j++){
                    if(line1[i]==null){
                        line1[i]=playerPosArray[j][0];
                        System.out.println("postion number "+ i +" assigned to playerPosArray["+i+"][0]");
                        
                    }
                    if(line3[i]==null){
                        line3[i]=playerPosArray[j][1];
                        System.out.println("postion number "+ i +" assigned to playerPosArray["+i+"][0]");
                        
                    }
                    if(line5[i]==null){
                        line5[i]=playerPosArray[j][2];
                        System.out.println("postion number "+ i +" assigned to playerPosArray["+i+"][0]");
                        
                    }
                }
            }
        }
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);

        for(int i = 0 ; i < 5; i++){
            for(int j = 0 ; j <= 2 ; j++){
                if(playerPosArray[j][0]==null){
                    if(i%2==0){
                        line1[i]=null;
                    }
                }
                if(playerPosArray[j][1]==null){
                    if(i%2==0){
                        line3[i]=null;
                    }
                }
                if(playerPosArray[j][2]==null){
                    if(i%2==0){
                        line5[i]=null;
                    }
                }
            }
        }
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);

        for(int i = 0 ; i < 5; i++) {
            System.out.println("assignment of postions started in pc board");
            if(i%2==0){
                for(int j = 0 ; j <= 2 ; j++){
                    if(line1[i]==null){
                        line1[i]=PcPosArray[j][0];
                        System.out.println("postion number "+ i +" assigned to PcPosArray["+i+"][0]");
                        
                    }
                    if(line3[i]==null){
                        line3[i]=PcPosArray[j][1];
                        System.out.println("postion number "+ i +" assigned to PcPosArray["+i+"][0]");
                        
                    }
                    if(line5[i]==null){
                        line5[i]=PcPosArray[j][2];
                        System.out.println("postion number "+ i + " assigned to PcPosArray["+i+"][0]");
                        
                    }
                }
            }
        }
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);

        for(int i = 0 ; i < 5; i++){
            for(int j = 0 ; j <= 2 ; j++){
                if(PcPosArray[j][0]==null){
                    if(i%2==0){
                        line1[i]=null;
                    }
                }
                if(PcPosArray[j][1]==null){
                    if(i%2==0){
                        line3[i]=null;
                    }
                }
                if(PcPosArray[j][2]==null){
                    if(i%2==0){
                        line5[i]=null;
                    }
                }
            }
        }
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);


        for (int i = 0; i <= line1.length-1; i++) {
            System.out.print(line1[i]);
        }
        System.out.println();
        for (int i = 0; i <= line2.length-1; i++) {
            System.out.print(line2[i]);
        }
        System.out.println();
        for (int i = 0; i <= line3.length-1; i++) {
            System.out.print(line3[i]);
        }
        System.out.println();
        for (int i = 0; i <= line4.length-1; i++) {
            System.out.print(line4[i]);
        }
        System.out.println();
        for (int i = 0; i <= line5.length-1; i++) {
            System.out.print(line5[i]);
        }
        System.out.println();
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);

        
    
    }

    public static void setPlayer(){
        switch(playerPos){
            case 1: playerPosArray[0][0] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 2: playerPosArray[1][0] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 3: playerPosArray[2][0] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 4: playerPosArray[0][1] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 5: playerPosArray[1][1] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 6: playerPosArray[2][1] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 7: playerPosArray[0][2] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 8: playerPosArray[1][2] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            case 9: playerPosArray[2][2] = player;
                    System.out.println("playerPos set "+playerPos);
                    break;
            
        }
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);
    }

    public static void setPC(){
        switch(PcPos){
            case 1: PcPosArray[0][0] = pc; 
                    System.out.println("pcPos set 1");
                    break;
            case 2: PcPosArray[1][0] = pc; 
                    System.out.println("pcPos set 2");
                    break;
            case 3: PcPosArray[2][0] = pc; 
                    System.out.println("pcPos set 3");
                    break;
            case 4: PcPosArray[0][1] = pc;  
                    System.out.println("pcPos set 4");
                    break;
            case 5: PcPosArray[1][1] = pc;  
                    System.out.println("pcPos set 5");
                    break;
            case 6: PcPosArray[2][1] = pc;  
                    System.out.println("pcPos set 6");
                    break;
            case 7: PcPosArray[0][2] = pc;  
                    System.out.println("pcPos set 7");
                    break;
            case 8: PcPosArray[1][2] = pc;  
                    System.out.println("pcPos set 8");
                    break;
            case 9: PcPosArray[2][2] = pc;  
                    System.out.println("pcPos set 9");
                    break;
        }
        System.out.println("pc "+PcPosArray[0][0]);
        System.out.println("player "+playerPosArray[0][0]);
    }
}