class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLL {
    
    Node front = null;
    Node rear = null;

    void enQueue(int x){
        Node t = new Node(x);
        if (t == null) {
            System.out.println("Queue is full");
        } else {
            if (front == null) {
                front = rear = t;
            } else {
                rear.next = t;
                rear = t;
            }
        }
    }

    int deQueue(){
        int x = -1;
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node p = front;
            x = p.data;
            front = front.next;
            if (front == null) { 
                rear = null;
            }
        }
        return x;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        q.display();

        System.out.println("Dequeued: " + q.deQueue());
        q.display();

        System.out.println("Dequeued: " + q.deQueue());
        q.display();

        System.out.println("Dequeued: " + q.deQueue());
        q.display();

        System.out.println("Dequeued: " + q.deQueue()); 
    }
}
