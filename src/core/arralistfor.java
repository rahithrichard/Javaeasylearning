package core;
import java.util.ArrayList;
import java.util.Iterator;
public class arralistfor {
     public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Ravi");
        al.add("vijay");
        al.add(24);
        al.add(6.0);
        for(Object obj:al){
            System.out.println(obj);
        }
    
     }
}
