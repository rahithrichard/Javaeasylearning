
package core;

import java.util.*;

public class addarra {

    public static void main(String args[]) {

        Student s1 = new Student(101, "junoo", 75);
        Student s2 = new Student(102, "Ram", 79);
        Student s3 = new Student(103, "Rocky", 80);
        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.mark);
        }

    }
}

class Student {

    int rollno;
    String name;

    int mark;

    Student(int rollno, String name, int mark) {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }
}
