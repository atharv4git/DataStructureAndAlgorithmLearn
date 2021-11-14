package from_book.ch3basics;

public class time {
    public static void main(String[] args) {
        double now =System.currentTimeMillis();

        time demo = new time();
        System.out.println(demo.findSum(99999));

        System.out.println("time taken = "+(System.currentTimeMillis()-now));
    }

    public int findSum(int n){
        return n*(n+1)/2;

    }
}