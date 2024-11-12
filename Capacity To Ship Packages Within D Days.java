import java.util.Scanner;
class abi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int x=sc.nextInt();
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        //System.out.print(max);
        while(true)
        {
            int temp=check(max,arr);
            if(temp==x)
            {
                System.out.print(temp);
                break;
            }
            max++;
        }
        
    }
    public static int check(int max,int[] arr)
    {
        int sum=0;
        int res=1;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]<=max)
                sum+=arr[i];
            else
            {
                res++;
                sum=arr[i];
            }
        }
        return res;
    }
}
