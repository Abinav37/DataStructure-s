import java.util.Scanner;
class abi
{
    Node root;
    class Node
    {
        Node l;
        int data;
        Node r;
        Node(int val)
        {
         data=val;
         l=null;
         r=null;
        }
    }
    abi(){
        root=newnode;
    }
    void insert(int val)
    {
        Node newnode=new Node(val);
        if(root==null)
        root=newnode;
        else{
            while(temp.l != null && temp.r != null)
            temp=temp.l;
            if(temp.l==null)
            temp.l=newnode;
            else
            temp.r=newnode;
        }
    }
    void display()
    {
        Node templ = root.l;
        Node tempr= root.r;
        System.out.print(root.data+" ");
        while(templ.l!=null && templ.r!=null)
        {
            System.out.print();
        }
        
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        abi tree=new abi();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=s.nextInt();
        
        tree.insert(a);
    }
        tree.display();
    }
    
}
