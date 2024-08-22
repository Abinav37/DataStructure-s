// "static void main" must be defined in a public class.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char[] arr=new char[n];
        for(int i=0;i<n;i++)
            arr[i]=str.charAt(i);
        int res=pass(arr,n);
        System.out.print(res);
    }
    public static int pass(char[] arr,int n)
    {
        char a=' ';
        char b='/';
        int count=0;
        if(n>=4)
        {
            if(!Character.isDigit(arr[0])){
            for(int i=0;i<n;i++){
                if(arr[i]==a || arr[i]==b)
                    return 1;
                if(Character.isDigit(arr[i]))
                    break;
                else
                    count++;
            }
            if(count==n)
                return 1;
            count=0;
            for(int i=0;i<n;i++)
                if(Character.isUpperCase(arr[i]))
                    break;
                else
                    count++;
            if(count==n)
                return 1;
            else
                return 0;
                
            }
            else
                return 1;
        }
        else
            return 1;
     //   return 1;
    }
}
