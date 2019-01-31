package core;
import java.util.Scanner;
public class finding {
    public static void main(String[] args) {
        int i,j;
        int u=0,m=0;
        int count =1,temp=0;
        String a="";
        Scanner s=new Scanner(System.in);
        String arra[]=new String[6];
//        String arra1[]=new String[3];
        for(i=0;i<6;i++){
            System.out.println("Enter your words");
            arra[i]=s.next();
            
        }
        for(i=0;i<6;i++){
            for(j=1;j<6;j++){
                if (arra[i].equalsIgnoreCase(arra[j])){
                    count++;

                }            
              if(temp<count){
           temp=count;
           a=arra[i];

              }
            }
            count=0;
            
    }
        if(temp==0){
                System.err.println("NO Repeate");
            }
        System.out.println(a+" repeats "+temp+" times");
    }
}
