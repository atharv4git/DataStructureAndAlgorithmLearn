package from_book.java_programming_basics;

import java.util.Scanner;

/**
 * objects_and_classes
 */
public class Counter {

    public static int count;
    public Counter (){}
    public Counter(int initial) {count = initial;}
    public static int getCount() {return count;}
    public static void increment() {count++;}
    public static void increment(int delta) {count += delta;}
    public static void reset() {count = 0;}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int s = scanner.nextInt(); 
        
        switch(s){

            case 1: System.out.println(getCount());
                    break;

            case 2: System.out.println("enter a number: ");
                    //int initial = scanner.nextInt();
                    //System.out.println(Counter(initial));
                    break;        

            case 3: increment();
                    System.out.println("--done increment--");
                    break;

            case 4: System.out.println("enter a delta nummber: ");
                    int d = scanner.nextInt();
                    increment(d);
                    System.out.println("--done adding delta number--");
                    break;

            case 5: reset();
                    System.out.println("--reset complete--");   
                    break;
            
            default: System.out.println("--enter a number between 1-5--");        
        }

        scanner.close();
    }
    
}