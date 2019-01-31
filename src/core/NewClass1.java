package core;
import java.util.Scanner;
public class NewClass1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j;
          int n;
           System.out.println("Which mutiplication table you want :");
          n=s.nextInt();
//        for(j=1;j<5;j++){
                 System.out.println("multiple of"+n);
        for(i=1;i<=5;i++){
            int mul=n*i;
            System.out.println(i+"x"+n+"="+mul);
        }
    
    }
    
}

