import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ConcatenLL {
    Node head = null;
    Node last = head;

    public void create() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if (x == -1)
                return;
            Node temp = new Node(x);

            if (head == null) {
                head = temp;
                last = temp;
            } else {
                last.next = temp;
                last = temp;
            }
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void concat(ConcatenLL other) {
        if (this.head == null) {
            this.head = other.head;
            return;
        }
        Node temp=this.head;
        while (temp.next!=null) {
            temp=temp.next;

        }
        temp.next=other.head;
    }
    public static void main(String[] args) {
        ConcatenLL ll=new ConcatenLL();
        ConcatenLL ll2=new ConcatenLL();
        System.out.println("Enter elements for List 1 (-1 to end):");
        ll.create();
        System.out.println("Enter elements for List 2 (-1 to end):");
        ll2.create();
        System.out.println("List 1 before concatenation:");
        ll.display();
        System.out.println("List 2 before concatenation:");
        ll2.display();
        ll.concat(ll2);
        System.out.println("After concatenation (List 1):");
        ll.display();
    }
}
