package core;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(01,"Rahul");
        hm.put(02,"Ravan");
        hm.put(03,"Rojan");
        Set st = hm.entrySet();
        Iterator itr=st.iterator();
        
        while(itr.hasNext()){
            Map.Entry me=(Map.Entry)itr.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }
            
    }
    
}
