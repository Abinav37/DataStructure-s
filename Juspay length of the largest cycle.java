import java.util.*;

class ABI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        
        /* int res=-1;
        for(int i=0;i<n;i++)
        {
            boolean[] vis=new boolean[n];
            int len=check(arr,i,vis);
            if(res<len)
            res=len;
        }
        System.out.print(res);
    }
    public static int check(int[] arr,int i,boolean[] vis)
    {
        int start=i;
        int count=0;
        while(!vis[i] && i!=-1)
        {
            vis[i]=true;
            if(arr[i]==-1)
            return -1;
            i=arr[i];
            count++;
        }
        if(i==start)
        return count;
    return -1;
}
}


        */
        int maxcycleLength = -1; 
       

        for (int i = 0; i < n; i++) {
             boolean[] vis = new boolean[n]; 
            if (!vis[i]) 
            {
                int cycleLength = check(arr, i, vis);
                if (cycleLength > maxcycleLength)
                    maxcycleLength = cycleLength; 
            }
        }
        System.out.print(maxcycleLength);
    }

    public static int check(int[] arr, int i, boolean[] vis) {
        int start = i;
        int count = 0;
        while (i != -1 && !vis[i]) {
            vis[i] = true;
            count++;
            i = arr[i]; 
            if (i == start) 
                return count;
        }
        return -1; 
    }
}
