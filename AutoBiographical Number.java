import java.util.Scanner;
class abi
{
    boolean autonum(String str)
    {
       int size=str.length();
       int[] arr=new int[size];
       for(int i=0;i<size;i++)
       {
           char c=str.charAt(i);
           int a=c-'0';
           arr[i]=a;
       }
       for(int i=0;i<size;i++)
       {
           int count=0;
           for(int j=0;j<size;j++)
           {
               if(i==arr[j])
               count++;
           }
           if(arr[i]!=count)
           return false;
       }
       return
    }

    public static void main(String[]args)
    {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    abi a=new abi();
    System.out.print(a.autonum(str));
    }
}
