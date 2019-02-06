package core;

import java.util.*;

public class testmap {

    public static void main(String[] args) {
        int i;
        int j;
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String ");
        String st = s.nextLine();

        String word[] = st.split(" ");
        int leng = word.length;
//        for (i = 0; i < leng; i++) {
//            System.out.println(word[i]);
//        }
        HashMap hm = new HashMap();
        for (i = 0; i < leng; i++) {
            for (j = 0; j < leng; j++) {
                if (word[i].equalsIgnoreCase(word[j])) {
                    count++;

                }

            }
            hm.put(word[i], count);
            count = 0;
        }

        Set set = hm.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }

}
