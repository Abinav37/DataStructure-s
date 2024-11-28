// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        int endx=sc.nextInt();
        int endy=sc.nextInt();
        int result=Math.(-1,fun(n,arr,endx,endy));
        System.out.print(result);
    }
    public static int fun(int n,int[][]arr,int i,int j)
    {
        int res=0;
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<Integer[]>next-new linkedlist()<>;
        boolean[][]vis=new boolean[n][n];
        next.add({0,0});
        while(!queue.isEmpty())
        {
            int[] temp=next.poll();
            int row=temp[0];
            int col=temp[1];
            if(row==i && col==y)
                return res;
            res++;
            for(int[] temp:direction)
            {
                row+=temp[0];
                col+=temp[1];
                if(row>=0&&row<=n&&col>=0&&col<=n&&!vis[row][col]&&arr[row][col]==0)
                {
                    next.add({row,col});
                    vis[row][col]=true;
                }
            }
        }
    }
}
// class check
// {
//     private boolean[][] vis=new boolean[n][n];
//     fun(arr,n)
//     {
        
//     }
// }
