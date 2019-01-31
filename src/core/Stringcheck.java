package core;
public class Stringcheck {
    public static void main(String[] args) {
        String n= "rahith";
        String s="rhioth";
        String obj=new String(" Kumaran");
        System.out.print(s);
        System.out.println(obj);
        //lenth declaration
        int leng = obj.length();
        System.out.println("length of obj = "+leng);
        //identify char possition
        char v=obj.charAt(leng-2);
        System.out.println(leng-2+"th possition char is "+v);
        //compare string snd obj
        int comp=s.compareTo(obj);
                System.out.println(comp);
              int c=n.compareToIgnoreCase(s);
               System.out.println(c);

        
    }
    
}
