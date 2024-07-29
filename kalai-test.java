import java.io.*;
import java.util.*;

public class Solution 
{
    Node head;
    Node peak;
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
            
        }
    }
    Solution()
    {
        head=null;
        peak=null;
     }
    void q1(int val)
    {
        
        Node newnode=new Node(val);
      
        
        if(head==null){
            head=newnode;
            peak=newnode;
        }
        else
        {
            peak.next=newnode;
            peak=newnode;
         }
    }
    int q2()
    {
        if(head==null)
            return -1;
        else{
        Node temp=head;
        while(temp.next.next!=null)
            temp=temp.next;
        int pop=peak.data;
        temp.next=null;
        peak=temp;
        return pop;
        }
    }
    void q3()
    {
        if(head==null)
            System.out.println("-1");
        else
            System.out.println(peak.data);
    }
  int q4()
    {
        if(head==null)
            return -1;
        else{
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count=count+1;
            temp=temp.next;
            
        }
        return count;
    }
    }

    boolean q5()
    {
        if(head==null)
            return true;
        return false;
    }
    

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        Solution abi=new Solution();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int que=s.nextInt();
            if(que==1)
            {
                int val=s.nextInt();
                abi.q1(val);
            }
            if(que==2)
            {
                System.out.println(abi.q2());
            }
            if(que==3)
            {
                abi.q3();
            }
            if(que==4)
            {
                System.out.println(abi.q4());
            }
            if(que==5)
            {
                System.out.println(abi.q5());
             }
            
        }
        /* Enter our code here. Read input from . Print output to STDOUT. Your class should be named Solution. */
    }
}
