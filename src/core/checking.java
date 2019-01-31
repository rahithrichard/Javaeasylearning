package core;
import java.util.Scanner;
public class checking {
    public static void main(String[] args) {
        int i,n=0;
        int u=0;
        Scanner s=new Scanner (System.in);
        int[] value;
        value= new int[5];
        for(i=0;i<5;i++){
        System.out.println("Enter value : ");
        value[i]=s.nextInt();
        }
        System.out.println("enter checking value : ");
            n=s.nextInt();
            for(i=0;i<5;i++){
                    if (n==value[i]){
                        System.out.println("found your search : "+value[i]);
                        u=0;
                    }
                    else{
                        u=1;
                    }
            }
            if(u==1){
                System.out.println("your search "+n+" not found");
            }
    }
}