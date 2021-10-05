package from_book.chap1questions.reinforcements;

public class r1 {
    public static void main(String[] args) {
        int[] A = {7,8,9,10,11,12};
        int[] B = A.clone();

        for(int i = 0; i <= A.length ; i++){
            System.out.println("element " + (i+1) + " = " + A[i]);
        }

        B[0]++;

        for(int i = 0; i <= B.length ; i++){
            System.out.println("element " + (i+1) + " = " + B[i]);
        }
    }

    
}
