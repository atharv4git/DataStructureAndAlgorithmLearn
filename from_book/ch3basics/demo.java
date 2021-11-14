package from_book.ch3basics;

public class demo {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6};

        for(int i = 0 ; i <= arr1.length-1  ; i++){
            System.out.print(arr1[i]+ " ");

            if(arr1[i]>4){
                for(int j = 0 ; j < arr1.length-1 ; j++){
                    arr1[i] += j;
                }
            }  
        }
        System.out.println(" ");
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
