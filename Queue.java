import java.util.Scanner;

public class Queue {
    int size;
    int front;
    int rear;
    int[] arr;

    public Queue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("⚠ Queue is full. Cannot enqueue " + x);
        } else {
            rear++;
            arr[rear] = x;
            System.out.println(" Enqueued: " + x);
        }
    }

    public int dequeue() {
        int x = -1;
        if (isEmpty()) {
            System.out.println(" Queue is empty. Cannot dequeue.");
        } else {
            front++;
            x = arr[front];
            System.out.println("Dequeued: " + x);
        }
        return x;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        Queue qq = new Queue(size);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    qq.enqueue(val);
                    break;

                case 2:
                    qq.dequeue();
                    break;

                case 3:
                    qq.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
