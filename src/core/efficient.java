package core;
public class efficient {
    public static void main(String[] args) {
        
        int year =2019;
        int month=01;
        int day=30;
        int hour=05;
        int minute=10;
        int seconds=25;
        StringBuilder sb=new StringBuilder();
        sb.append(year).append("-").append(month).append("-").append(day).append("     ").append(hour).append("Hh:").append(minute).append("Mm:").append(seconds).append("Ss").toString();
        System.out.println(sb);
        
    }
    
}
