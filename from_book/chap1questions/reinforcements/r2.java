package from_book.chap1questions.reinforcements;

public class r2 {
    public static void main(String[] args) {
        System.out.println(isMultiple(22,2));
    }

    public static boolean isMultiple(int x , int y){
        boolean result = false;
        for(int i = 0 ; i <= 20 ; i++ ){
            if(y==x*i){
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;

    }

    
}
