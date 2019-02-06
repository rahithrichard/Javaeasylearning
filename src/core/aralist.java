package core;

import java.util.*;

public class aralist {

    public static void main(String[] args) {
        int i;
        String abc = "print";
        ArrayList al = new ArrayList();
        Scanner s = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.println("Enter color");
            al.add(s.nextLine());
        }
//        System.out.println("-------------finished--------------\n");
//        System.out.println("enter possition you want");
//        int a = s.nextInt();
//        System.out.println("enter color you want to add");
//        String col = s.next();
//        al.add(a, col);
//        System.out.println("------enter which possition elemet goes to update----");
//        a = s.nextInt();
//        System.out.println("-----enter your element -------");
//        col = s.next();
//        al.set(a, col);
//        System.out.println("------Type print to print------- ");
//        String print = s.next();
//        if (abc.equals(print)) {
//            Iterator itr = al.iterator();
//            while (itr.hasNext()) {
//                System.out.println(itr.next());
//
//            }
//        }
//        System.out.println("-----enter your geting possition-----");
//        int get = s.nextInt();
//        System.out.println(al.get(get));
//
//            System.out.println("----Do you want remove any element------ ");
//            boolean b = true;
//            System.out.println("prss 1 to continue");
//             a = s.nextInt();
//            if (b == true) {
//            System.out.println("enter your possition to remove");
//            get = s.nextInt();
//            al.remove(get);
//            Collections.sort(al);
//            Iterator itr = al.iterator();
//            while (itr.hasNext()) {
//                System.out.println(itr.next());
//            }
//        }
//        System.out.println("--------going to search????? !!--------");
//
//        System.out.println("Enter your element to search");
//        print = s.next();
//        if (al.contains(print)) {
//            System.out.println("foud");
//        } else {
//            System.out.println("Not foud");
//        }
        System.out.println(al.clone());
        ArrayList arali = new ArrayList();
        Collections.copy(al, arali);
        for(Object ob:arali){
            System.out.println(ob);
    }
//         Iterator ir =arali.iterator();
//         while(ir.hasNext()){
//             System.out.println(ir.next());
//         }
//         for(Object g:arali){
//             System.out.println(g);
//         }
    }

}
