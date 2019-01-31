package core;
import java.util.Scanner;
public class arra {
    public static void main(String[] args) {
        int n=0;
        int i;
        int[]value;
        value=new int[3];
     Scanner s=new Scanner(System.in);
    
//       value[0]=2;
//        value[1]=3;
//        value[2]=4; 
               for(n=0;n<3;n++){
                   System.out.println("Enter value"+n);
                    value[n]=s.nextInt();
                                }
        
//        System.out.println(value[0]);
//        System.out.println(value[1]);
//        System.out.println(value[2]);
      


for( i=0;i<value.length;i++){
    System.out.println("you enterde values"+i);
//     
      System.out.println(value[i]);
            }
       
}
}

        