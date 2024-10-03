// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        int result=0;
        int resultindex=-1;
        for(int i=0;i<n;i++)
        {
            int temp=findweight(arr,i);
            if(temp>result)
            {
                result=temp;
                resultindex=i;
            }
        }
        System.out.print(resultindex);
        
        
    }
    public static int findweight(int[]arr,int num)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
                count+=i;
        }
        return count;
    }
}
        /*int[] weight=new int[n];
        for(int i=0;i<n;i++)
             if (arr[i] != -1)
                 weight[arr[i]]+=i;
        
        int maxweight=Integer.MIN_VALUE; ;
        int maxweightindex=-1;
        for(int i=0;i<n;i++)
        {
            if(maxweight<weight[i])
            {
                maxweight=weight[i];
                maxweightindex=i;
            }
        }
        System.out.println(Arrays.toString(weight));

        System.out.print(maxweightindex);
    }
}*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int result=0;
        int resultindex=-1;
        for(int i=0;i<n;i++)
        {
            int temp=findweight(arr,i);
            if(temp>result)
            {
                result=temp;
                resultindex=i;
            }
        }
        System.out.print(resultindex);
        
        
    }
    public static int findweight(int[]arr,int num)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
                count+=i;
        }
        return count;
    }
}*/
