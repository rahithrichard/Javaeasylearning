package core;
import java.io.FileOutputStream;
public class fileRW {
    public static void main(String[] args) {
        try {
        FileOutputStream fops =new FileOutputStream("abc.txt");
        String a= "hello how are you";
        byte[] b=a.getBytes();
        fops.write(b);
        fops.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}
