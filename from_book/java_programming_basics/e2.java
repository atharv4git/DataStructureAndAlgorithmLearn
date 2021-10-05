package from_book.java_programming_basics;

class Second{
    int id;
    String name;
    Second(int i, String n){
    id= i;
    name= n;
    }
    void PrintData(){
    System.out.println("id is "+ id);
    System.out.println("name is "+ name);
    }}
    class Second_parameterized{
    public static void main(String args[]){
    Second s1= new Second(10, "ram");
    s1.PrintData();
    Second s2= new Second(20, "ravi");
    s2.PrintData();
     }}
