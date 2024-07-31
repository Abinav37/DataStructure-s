import java.util.Scanner;
public class Linkedlist{
    Node head;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Linkedlist(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);
         
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
        }
    }
    public void min(){    
        int min=head.data;
        Node temp=head;
        while (temp != null){
            if (min>temp.data) {
            min=temp.data;}
            temp=temp.next;
}
    System.out.println("Min IN LIST:"+min);
}
public void max(){    
        int max=head.data;
        Node temp=head;
        while (temp != null){
            if (max<temp.data) {
            max=temp.data;}
            temp=temp.next;
}
    System.out.println("MAX IN LIST:"+max);
}
public void search(int a) {
        Node temp = head;
        boolean found = false;
        
        while (temp != null) {
            if (temp.data == a) {
                found = true;
                break;
            }
            temp = temp.next;
        }

        if (found)
            System.out.println("The element is found");
        else
            System.out.println("Not found");
    }
    public void reverse()
    {
        Node prev = null;
        Node current = head;
        //Node next = current.next;
        while (current != null){
            Node next = current.next ;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
      public void sort()
{
    if(head==null || head.next==null)
    {
        return;
    }
    else
    {
        Node curr=head;
        Node index=null;
        int temp;
        for(curr=head;curr!=null;curr=curr.next)
        {
            index=curr.next;
            for(index=curr.next;index!=null;index=index.next)
            {
                if(curr.data>index.data)
                {
                    temp=curr.data;
                    curr.data=index.data;
                    index.data=temp;
                }
                
            }
            
        }
        
    }
}

    public void deletebegin(){
        head = head.next;
    }
    public void deleteposition(int d){
        Node temp = head;
        Node prev = null;
        
        for(int i=1;i<d;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    public void delval(int val)
    {
        if(head.data==val)
        {
            head=head.next;
        }
        Node temp=head;
        while(temp.next.data!=val)
        {
            temp=temp.next;
            if(temp==null)
            System.out.println("Element not found");
        }
        temp.next=temp.next.next;
    }
     public void deleteend() {
        if (head == null || head.next==null) {
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
public void insertbegin(int val){
        Node newnode = new Node(val);
        
        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode; 
        }
        
    }
public void position(int pos , int val){
        Node newnode = new Node(val);
        
        Node temp = head;
        
        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    void duplicate(){
    Node current = head;
        
    while (current != null && current.next != null){
        if (current.data == current.next.data){
            current.next = current.next.next;
        }
        else{
            current = current.next;
        }
    }

 }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist list = new Linkedlist();
        System.out.print("No of elements to add:");
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.println("Actual LinkedList:");
        list.display();
        System.out.println();
        System.out.print("The element to add at begining:");
        int a=sc.nextInt();
        list.insertbegin(a);
        list.display();
        System.out.println();
        System.out.println("The element  to add");
        int b=sc.nextInt();
        System.out.println("The position to add it:");
        int c=sc.nextInt();
        list.position(c,b);
        list.display();
        System.out.println();
        System.out.print("The element to add at end:");
        int z=sc.nextInt();
        list.insertend(z);
        list.display();
        System.out.println();
        System.out.print("First element deleted:");
        list.deletebegin();
        System.out.println();
        list.display();
        System.out.println();
        System.out.print("The pos to delete:");
        int pos = sc.nextInt();
        list.deleteposition(pos);
        list.display();
        System.out.println();
        System.out.print("Last element deleted:");
        list.deleteend();
        list.display();
        System.out.println();
        System.out.print("The element to delete:");
        int p=sc.nextInt();
        list.delval(p);
        list.sort();
        list.display();
        System.out.println();
        list.min();
        System.out.println();
        list.max();
        System.out.println();
        System.out.print("the element to search:");
        int val=sc.nextInt();
        list.search(val);
        System.out.println();
        System.out.print("Reverse:");
        list.reverse();
        list.display();
        System.out.println();
        System.out.print("Duplicate element deleted:");
        list.duplicate();
        list.display();
    }
}
