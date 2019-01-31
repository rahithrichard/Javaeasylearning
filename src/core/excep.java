package core;
public class excep {
    static void validate(int age){
if(age<18){
    throw new ArithmeticException("not valid for vote");
        
    }
else{
     System.out.println("welcome to vote");
   

}
}
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        try{
        validate(13);
        }
        catch(ArithmeticException e){
             System.out.println(e);
        }
//        int arra[]=new int [5];
//        try{
//            arra[7] =30;
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("exception handled");
//            
//        }
//        System.out.println("Process complete");

    }
}
