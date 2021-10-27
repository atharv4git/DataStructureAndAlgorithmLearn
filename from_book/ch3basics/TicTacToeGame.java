package from_book.ch3basics;

import java.util.Random;
import java.util.Scanner;

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



        scanner.close();   
    }
    public static void show(){

        line1[1] = line1[3] = line2[1] = line2[3] = "|";
        line3[1] = line3[3] = line4[1] = line4[3] = "|";
        line5[1] = line5[3]= "|";

        line2[0] = line2[2] = line2[4] = "----";
        line4[0] = line4[2] = line4[4] = "----";
        line2[0] = line2[2] = line2[4] = "----";

        for(int i = 0 ; i <= 3; i++) {
            if(line1[i]==null){
                line1[i]=playerPosArray[i][0];
            }
            if(line2[i]==null){
                line2[i]=playerPosArray[i][1];
            }
            if(line3[i]==null){
                line3[i]=playerPosArray[i][2];
            }
        }

        for(int i = 0 ; i <= 3; i++) {
            if(line1[i]==null){
                line1[i]=PcPosArray[i][0];
            }
            if(line2[i]==null){
                line2[i]=PcPosArray[i][1];
            }
            if(line3[i]==null){
                line3[i]=PcPosArray[i][2];
            }
        }


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

        
    
    }

    public static void setPlayer(){
        if(playerPos==1){
            playerPosArray[0][0]=player;
        }
        if(playerPos==2){
            playerPosArray[1][0]=player;
        }
        if(playerPos==3){
            playerPosArray[2][0]=player;
        }if(playerPos==4){
            playerPosArray[0][1]=player;
        }
        if(playerPos==5){
            playerPosArray[1][1]=player;
        }
        if(playerPos==6){
            playerPosArray[2][1]=player;
        }
        if(playerPos==7){
            playerPosArray[0][2]=player;
        }
        if(playerPos==8){
            playerPosArray[1][2]=player;
        }if(playerPos==9){
            playerPosArray[2][2]=player;
        }
    }

    public static void setPC(){
        if(PcPos==1){
            PcPosArray[0][0]=pc;
        }
        if(PcPos==2){
            PcPosArray[1][0]=pc;
        }
        if(PcPos==3){
            PcPosArray[2][0]=pc;
        }if(PcPos==4){
            PcPosArray[0][1]=pc;
        }
        if(PcPos==5){
            PcPosArray[1][1]=pc;
        }
        if(PcPos==6){
            PcPosArray[2][1]=pc;
        }
        if(PcPos==7){
            PcPosArray[0][2]=pc;
        }
        if(PcPos==8){
            PcPosArray[1][2]=pc;
        }if(PcPos==9){
            PcPosArray[2][2]=pc;
        }
    }
}