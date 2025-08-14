import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLL {
    Node top = null;
    // Node last=top;

    public void push(int x) {
        Node temp = new Node(x);

        temp.next = top;
        top = temp;
    }

    public int pop() {
        if (top == null) {
            return -1;
        } else {
            int x = top.data;
            top = top.next;
            return x;
        }
    }

    public int peek() {
        if (top == null) {
            return -1;
        } else {
            return top.data;
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node t = top;
        while (t != null) {
            System.out.println(t.data + " ");
            t=t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    int Popped=stack.pop();
                    if (Popped!=-1) {
                        System.out.println(Popped+" ");
                    }
                    break;
                case 3:
                    int peeked=stack.peek();
                    if (peeked!=-1) {
                        System.out.println(peeked+" ");
                    }    
                    break;
                 case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
