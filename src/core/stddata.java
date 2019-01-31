package core;
import java.util.Scanner;
public class stddata {
    public static void main(String[] args) {
    int n=2;
    int i,j;
    Scanner s=new Scanner(System.in);
    int[] mark;
    mark=new int[n];
    String[] Name;
   Name=new String[n];
   for(i=0;i<2;i++){
       System.out.println("Enter name : ");
       Name[i]=s.next();
        System.out.println("Enter marak :");
        mark[i]=s.nextInt();
   }
   System.out.println("STUDENT MARK DETAILS");
   for(j=0;j<Name.length;j++){
       System.out.println(Name[j]+" :"+mark[j]);
       //System.out.println(mark[j]);
      
   }
    }   
}
