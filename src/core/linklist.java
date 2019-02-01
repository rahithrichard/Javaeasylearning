package core;
import java.util.*;

public class linklist {
    public static void main(String[] args) {
        LinkedList li =new LinkedList();
        li.add("name :");
        li.add("age  :");
        li.add("mark :");
        
        Iterator ir =li.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
            
        }
    }
    
}
