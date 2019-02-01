package core;
import java.util.Scanner;
public class arraycheck {
    public static void main(String[] args) {
         int i;
         int j=3;
         Scanner s= new Scanner(System.in); 
    int [] arra =new int[5];
    for(i=0;i<5;i++){
   arra[i]=s.nextInt();
} 
        System.err.println("enter new value");
        int a=s.nextInt();
        System.err.println("enter new value possition");
        int b=s.nextInt();
       for(i=4;i>b;i--){
           arra[i]=arra[j];
           j--;
       }
        arra[b]=a;
        
    for(i=0;i<5;i++){
        System.out.println(arra[i]);
    
    }
    }

}
    
    

