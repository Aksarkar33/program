import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node (int data){
        this.data=data;
        this.next=null;

    }
}
public class LinkList_Insertion {
    Node head=null;
    Node last=head;

    public void create(){
        Scanner sc=new Scanner(System.in);
           int count=0;
           int sum=0;
           int max=0;
            System.out.println("Enter elements (-1 to stop):");
        while (true) {
         
            int x=sc.nextInt();
            if (x==-1) break; 
            Node temp=new Node(x);
            if (head==null) {
                head=temp;
                last=temp;
            }else{
                last.next=temp;
                last=temp;
            }   
            if (temp.data>max) {
                max=temp.data;
            }
            sum=sum+temp.data;
            count++; 
            
            
        }
        System.out.println("Total number of element : "+count);
        System.out.println("sum of the element : "+sum);
        System.out.println("Max element: "+max);

    }
    public void InsertAtFirst(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter element at begining:");
        int x=sc.nextInt();
        Node p=new Node(x);
        p.next=head;
        head=p;
    }
        public void display(){
        Node p=head;
        System.out.print("Elements:");
        while (p!=null) {
            System.out.print(" "+p.data+" ");
            p=p.next;
        }
    }
    public void InsertAtEnd(){
             Scanner sc =new Scanner(System.in);
        System.out.println("Enter element at end:");
        int x=sc.nextInt();
        Node p=new Node(x);
        if (head==null) {
            head=p;
        }else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=p;
        }
    }
    public void InsertAtPos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Pos");
        int pos=sc.nextInt();
        int x=sc.nextInt();
        Node p=new Node(x);
     if (pos == 0) {
        p.next = head;
        head = p;
        return;
    }
    Node temp=head;
    for(int i=0;i<pos-1;i++){
        if (temp==null) {
            System.out.println("Out");
            return;
        }else{
            temp=temp.next;
        }
    }
    p.next=temp.next;
    temp.next=p;

    }
    public static void main(String[] args) {
        LinkList_Insertion l=new LinkList_Insertion();
        l.create();
        l.display();
        System.out.println();
        l.InsertAtFirst();
        l.display();
        System.out.println();
        l.InsertAtEnd();
        l.display();
        System.out.println();
        l.InsertAtPos();
        l.display();
    }
}
