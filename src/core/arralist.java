package core;

import java.util.ArrayList;
import java.util.Iterator;

public class arralist {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Ravi");
        al.add("vijay");
        al.add(24);
        al.add(6.0);
        
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
   
    
}
