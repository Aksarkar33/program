import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkUser {
    Node head=null;
    Node last=head;

    public void create(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements (-1 to stop):");
        while (true) {
            int x=sc.nextInt();
            if(x==-1) break;

            Node temp=new Node(x);

            if(head==null){
                head=temp;
                last=temp;
            }else{
                last.next=temp;
                last=temp;
            }
        }
    }
    public void display(){
        Node p=head;
        while (p!=null) {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }
    public static void main(String[] args) {
        LinkUser ll=new LinkUser();
        ll.create();
        ll.display();
    }
}
