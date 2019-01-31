package core;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int i,j;
        int m=1;
        String temp="";
         String c="";
        String[] arra=new String[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your line");
          System.err.println("please enter word wise");
        for(i=0;i<5;i++){
            System.out.println("type one word and enter");
         arra[i]=s.next();
        }
         System.err.println("-----Printing Your line code -----");
        for(i=4;i>=0;i--){
            if(m%2==0){
                temp=arra[i];
                for(j=1;j<temp.length()+1;j++){  
                    c=c+temp.charAt(temp.length()-j);
//                    StringBuffer ob=new StringBuffer(temp);
                }
                System.err.print(" "+c);
//                System.out.println(ob.reverse().toString());
                c="";
            }
            
            else{
                System.err.print(" "+arra[i]);
            }
            m++;
            
        }
    }
    
    
}
