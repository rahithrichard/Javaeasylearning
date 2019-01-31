package core;
import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int i;
            String c="";
     System.out.println("Enter your Word");
        String a=s.next();
        int leng=a.length();
        for(i=1;i<a.length()+1;i++){
           c=c + a.charAt(leng-i);
         
                   }
    if(c.equalsIgnoreCase(a)){
         System.out.println(c+" is a "+"PALINDROM");
        
                                }
            else{
         System.out.println("Not a PALINDROM");
                }
                         
                                             }
                        }
