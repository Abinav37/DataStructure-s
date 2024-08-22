// "static void main" must be defined in a public class.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        int n=str.length();
        StringBuilder sb=new StringBuilder();
        while(true)
        {
            char a=str.charAt(i);
            if(sb.toString().indexOf(a) == -1){
            sb.append(a);
            occurence(a,str);}
            i++;
            if(i==str.length())
                break;
        }
    }
    public static int occurence(char a,String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==a)
            {
                count++;
            }
        }
        System.out.printf("%c---%d",a,count);
        System.out.println();
        return 0;
    }
}
