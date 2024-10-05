// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
                count++;
        }
        System.out.print(count);
    }
}    


/*
6. You are working on a financial analyzing tool which represents the daily stock price of company over a time. Each element in an Integer array  A  of size N represents the closing price of stock for a particular day. Your task is to find and return an Integer value representing the total number of days where the stock price decreased . indicating negative growth.
 Input Specification:
Input 1: An integer array A containing the closing price of the stock.
Input 2:  An integer value N representing the size of the array.

Output Specification:
Return an integer value representing  the total num*/
