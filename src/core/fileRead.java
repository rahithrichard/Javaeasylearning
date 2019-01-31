package core;
import java.io.FileInputStream;
public class fileRead {
    public static void main(String[] args) {
        int i;
        try{
            FileInputStream obj=new FileInputStream("C:\\Users\\Richard\\Desktop\\git.txt");
            while((i=obj.read())!=-1){
           System.out.print((char)i);
        }
            obj.close();
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}
