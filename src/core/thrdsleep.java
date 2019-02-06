package core;
public class thrdsleep extends Thread {
    int i;
    public void run(){
        for( i=1;i<11;){
            try{
              Thread.sleep(100);
                        }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
           i= i+2;
        }
    }
}
class speedsleeper extends Thread {
    public void run(){
        for(int i=2;i<12;){
            try{
              Thread.sleep(101);
                        }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
            i=i+2;
        }
    }
}

class checker{
    public static void main(String[] args) {
        thrdsleep ts = new thrdsleep();
        speedsleeper ss=new speedsleeper();
        ts.start();
        ss.start();
    }
}