import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
     ArrayList<String> sr= new ArrayList<String>();
        while(true){
            String s=scan.nextLine();
            if(s.equals(""))
                break;
             sr.add(s);   
        }
        System.out.print(sr);
    }
}
