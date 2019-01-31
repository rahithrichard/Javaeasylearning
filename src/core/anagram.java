package core;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=0;
        int i;
        int u=0;
//        char arra[]=new char[10];
//        char arra2[]=new char[10];
        System.out.println("Enter your 1st Word");
        String a=s.next();
        System.out.println("Enter your 2nd Word");
        String b=s.next(); 
        int leng=a.length();
//           System.out.println(leng);
        int len=b.length();
        for(i=1;i<9;i++){
            char c=a.charAt(leng-i);
            for(int j=1;j<9;j++){
                char v=b.charAt(len-j);
              if(c == v){
//                 arra[m]=c;
//                 arra2[m]=v;
//                u=0;
                  m++;
            }
//              else {
//               u=1;
//              }
//              
            }
          
        }
//         System.out.println(m);
    if(leng==m){
        System.out.println(a+" & "+b+" are "+"ANAGRAM");
//       for(i=0;i<10;i++){
//           System.out.print(arra[i]);
//       }
//       for(i=0;i<10;i++){
//           System.out.print(arra2[i]);
//       }
//       
    }
    else{
         System.out.println("NOT ANAGRAM");
    }
    }
    
}
