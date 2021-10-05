package from_book.chap1questions.reinforcements.flowers;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        flowers f1 = new flowers("tulip" , 6 , 59f );
        flowers f2 = new flowers("sunflower" , 16 , 59.56f );
        flowers f3 = new flowers("genda" , 100 , 12f );
        flowers f4 = new flowers("rose" , 26 , 59f );
        flowers f5 = new flowers("lavender" , 3 , 19f );


        System.out.println("Welcome to our nursery");
        System.out.println("please enter a number from 1 to 5");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                    System.out.println("name = " + f1.name);
                    System.out.println("no. of petals = " + f1.NumOfPetals);
                    System.out.println("price = " + f1.price);
                    break;
            
            case 2:
                    System.out.println("name = " + f2.name);
                    System.out.println("no. of petals = " + f2.NumOfPetals);
                    System.out.println("price = " + f2.price); 
                    break;
                    
            case 3:
                    System.out.println("name = " + f3.name);
                    System.out.println("no. of petals = " + f3.NumOfPetals);
                    System.out.println("price = " + f3.price);
                    break;

            case 4:
                    System.out.println("name = " + f4.name);
                    System.out.println("no. of petals = " + f4.NumOfPetals);
                    System.out.println("price = " + f4.price);
                    break;

            case 5:
                    System.out.println("name = " + f5.name);
                    System.out.println("no. of petals = " + f5.NumOfPetals);
                    System.out.println("price = " + f5.price);
                    break;

            default: System.out.println("wrong input!!!");       
        }
        scanner.close();

    }
}
