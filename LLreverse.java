import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LLreverse {
    Node head=null;
    Node last=head;

    public void create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elemnent: (enter -1 to exit)");
        while (true) {
            int x=sc.nextInt();
            if(x==-1)return;
            Node p=new Node(x);
            if (head==null) {
                head=p;
                last=p;
            }else{
                last.next=p;
                last=p;
            }
        }
    }
    // public void reverse(){
    //     Node r=null;
    //     Node q=null;
    //     Node p=head;

    //     while (p!=null) {
    //         r=q;
    //         q=p;
    //         p=p.next;
    //         q.next=r;
    //     }
    //     head=q;
    // }
    public void reverse(Node q,Node p){
        if (p!=null) {
            reverse(p, p.next);
            p.next=q;
        }else{
        head=q;
        }
    }
    public void display(){
        Node p=head;
        while (p!=null) {
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LLreverse ll=new LLreverse();
        ll.create();
        ll.display();
        System.out.println();
        ll.reverse(null,ll.head);
        ll.display();
    }
}
