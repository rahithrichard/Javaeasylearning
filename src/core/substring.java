package core;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
       String a ="";
       String c="";
      Scanner s= new Scanner(System.in);
        System.out.println("Enter string");
        a=s.next();
        System.out.println("Enter substring");
        c=s.next();
  boolean present=a.contains(c);
  if(present){
      System.out.println("your subString "+c+" present on your main String "+a);
     a=a.replace(c," ");
      System.out.println("your SubString replaced String is "+a);
  }
  else {
      System.out.println("not found ");
  }
    }
}
