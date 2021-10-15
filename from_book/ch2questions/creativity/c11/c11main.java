package from_book.ch2questions.creativity.c11;

public class c11main {
    public static void main(String[] args) {
        Bob b1 = new Bob();
        int n = Alice.numpack;

        for(int i = 0 ; i <= n; i++ ){
            b1.increment();
            System.out.println("send package #"+i);
        }
    }
    
}
