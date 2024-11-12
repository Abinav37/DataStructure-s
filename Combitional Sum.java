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
        //for(int i=0;i<n;i++)
        
            check(0,arr,x,"");
        
    }
    public static void check(int i,int[] arr,int x,String str)
    {
        if(x==0){
                System.out.println(str);
            return ;}
        for(int j=i;j<arr.length;j++)
        {
            if(x>=arr[j])
            {
                check(j,arr,x-arr[j],str+arr[j]+" ");
            }
            else if(arr[j]>x)
                continue;
            
                  
        }
    }
}
