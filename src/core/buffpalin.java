package core;
import java.util.Scanner;
public class buffpalin {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter ");
            String a=""
                    + "";
            String b="";
            a=s.next();
            StringBuilder sb=new StringBuilder(a);
            b=sb.reverse().toString();
            if(a.equalsIgnoreCase(b)){
                System.out.println("Palindrome");
            }
            else{
                System.err.println("Not Palindrome");
            }
            
    }
    
}
