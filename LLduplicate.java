import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LLduplicate {
    Node head =null;
    Node last=head;

    public void create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element :");
        while (true) {
            int x=sc.nextInt();
            if (x==-1) return;
            Node temp=new Node(x);
            if (head==null) {
                head=temp;
                last=temp;
            }else{
                last.next=temp;
                last=temp;
            }

        }

    }
    public void duplicate(){
        Node p=head;
        Node q=head.next;
        while (q!=null) {
            if (p.data!=q.data) {
                p=q;
                q=q.next;
            }else{
                p.next=q.next;
                
                q=p.next;
            }
        }
    }
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LLduplicate ll=new LLduplicate();
        ll.create();
        ll.display();
        ll.duplicate();
        System.out.println();
        ll.display();
    }
}
