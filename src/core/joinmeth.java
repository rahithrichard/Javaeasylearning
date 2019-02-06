package core;
public class joinmeth extends Thread {
    int i;
    public void run(){
    for(i=1;i<6;i++){
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(i);
        }
    }
}

class testjoin{
    public static void main(String[] args) {
        joinmeth jm=new joinmeth();
       joinmeth jm1=new joinmeth();
       jm.start();
       try{
           jm.join();
       }
       catch(Exception e){
           System.out.println(e); 
       }
       jm1.start();
    }
    
}