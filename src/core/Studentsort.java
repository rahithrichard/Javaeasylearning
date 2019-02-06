package core;

import java.util.*;
import java.io.*;

class sort implements Comparable{
    int rollno;
    int age;
    String name;
    sort(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
   
    public int compareTo(Object o) {
      sort sr=(sort)o;
        System.out.println(age);
        System.err.println(sr.age);
      if(age==sr.age){
         return 0; 
      }
      else if(age>sr.age){
          return 1;
      }
      else{
          return -1;
      }
        
    }
}


public class Studentsort{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
       al.add(new sort(101,"Ragavi",22)); 
       al.add(new sort(102,"Joji",23));
       al.add(new sort(103,"Rahith",22));
       
       Collections.sort(al);
       Iterator itr=al.iterator();
       while(itr.hasNext()){
          sort st=(sort)itr.next();
          System.out.println(st.rollno+" "+st.name+" "+st.age);
       }
    }
    
}