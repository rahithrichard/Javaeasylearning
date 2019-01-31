import java.util.Scanner;
public class School {
    Scanner s=new Scanner(System.in);
    static int markp=0;
    static int markc=0;
    static int markm=0;
    static int mark=0;
   static String schoolname;
    static String name;
    String address;
    String email;
    String phone;
    static String departmentname;
String detail(){
    System.out.println("Enter Your School Name :");
    schoolname=s.next();
    System.out.println("Enter your Name :");
    name=s.next();
     System.out.println("Enter your Address :");
    address=s.next();
     System.out.println("Enter your Email :");
    email=s.next();
     System.out.println("Enter your Phone :");
    phone=s.next();
    String details=("School name : "+schoolname+"\n"+"Name : "+name+"\n"+"Address : "+address+"\n"+"Email : "+email+"\n"+"Phone : "+phone);
    System.out.println(details);
    return details;
   }
String department(){
         System.out.println("Enter department name : ");
         departmentname=s.next();
         return departmentname;  
}
    public static void main(String[] args) {
        
       
     
        
        boolean b= true;
        
        while(b){
        System.out.println("1: School Details");
        System.out.println("2: Teacher");
        System.out.println("3: Subject");
        System.out.println("4: Student Details");
        
        int choice = new School().s.nextInt();
                switch(choice){
                case 1:{
                     new School().detail();
                     break;
                }
                case 2: {
                    new Teacher().teach();
                }
                case 3:{
                    new Chemistry().mark();
                    new Physics().mark();
                    new Maths().mark();
                }
                case 4:{
                   new Student().Studentdetail();
                }
                default:{
                    System.out.println("Invalid");
                }
            }
                System.out.print("Press 1 to continue");
                int tmp = new School().s.nextInt();
                if(tmp!=1){
                    b= false;
                }
       }
        
        
        
//        new School().detail();
//        new Teacher().department();
//           new Teacher().teach();
//           new Physics().display();
//           new Physics().mark();
//          // new Physics().display();
//           new Chemistry().display();
//           new Chemistry().mark();
//          // new Chemistry().display();
//           new Maths().display();
//           new Maths().mark();
//           //5
//           new Teacher().displayMark();
           
    }
}
 class Teacher extends School{
     
    //Teacher(){
    static String teach(){
        
    System.out.println("School Name : "+schoolname);
    System.out.println("Department : "+departmentname);
    
    
    return schoolname;
  }
   static String displayMark(){
       teach();
       
    return null;
    }
   
 }
class Physics extends Teacher{
    void display(){
        System.out.println("Phisics mark : "+mark);
    }
    int mark(){
//       System.out.println("Enter Student name : ");
//    name =s.next();  
    System.out.println("Enter physics mark for Student:"+name);
    markp =s.nextInt();
//    System.out.println("School Name : "+schoolname);
//    System.out.println("Department : "+departmentname);
//    System.out.println("Name : "+name);
//    System.out.println("Score :"+markp);
//    Teacher(){
//        Teacher t=new Teacher(this);
//        t display();
//        return t;
    return markp;
    }
}



class Chemistry extends Teacher{
    void display(){
        System.out.println("Chemistry mark : "+mark);
    }
    int mark(){
//       System.out.println("Enter Student name : ");
//    name =s.next();  
    System.out.println("Enter chemistry mark for Student:"+name);
    markc =s.nextInt();
//    System.out.println("School Name : "+schoolname);
//    System.out.println("Department : "+departmentname);
//    System.out.println("Name : "+name);
//    System.out.println("Score :"+markc);
////    Teacher(){
//        Teacher t=new Teacher(this);
//        t display();
//        return t;
    return markc;
    }
}

class Maths extends Teacher{
       void display(){
        System.out.println("Maths mark : "+mark);
    }
    int mark(){
//       System.out.println("Enter Student name : ");
//    name =s.next();  
    System.out.println("Enter maths mark for Student:"+name);
    markm =s.nextInt();
//    System.out.println("School Name : "+schoolname);
//    System.out.println("Department : "+departmentname);
//    System.out.println("Name : "+name);
//    System.out.println("Maths Score :"+markm);
//    Teacher(){
//        Teacher t=new Teacher(this);
//        t display();
//        return t;
    return markm;
    }
}

   class Student extends School{
       
       static String Studentdetail(){
           
           new Teacher().teach();
           System.out.println("Name : "+name);
           System.out.println("Score :"+markc);
           System.out.println("Maths Score :"+markm); 
           System.out.println("Score :"+markp);
          
           return null;
       }
   }



