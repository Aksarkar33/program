import java.util.Scanner;

public class Stack {

    int size;
    int top;
    int[] S;

    void create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        size=sc.nextInt();
        top=-1;
        S=new int[size];
    }

    void push(int x){
        if (top==size-1) {
           System.out.println("Stack overflow..!!!");
        }else{
            top++;
            S[top]=x;
            System.out.println(x + " pushed to stack.");
        }
    }

    int pop(){
        if (top==-1) {
            System.out.println("Stack underflow...!!");
            return -1;
        }else{
            int x=S[top];
            top--;
            return x;
        }
    }

    int peek(Stack st,int index){
        int x=-1;
        if (st.top-index+1<0) {
            System.out.println("Invalid index");
        }else{
            x=st.S[st.top-index+1];
        }
        return x;
    }

    void display(){
        if (top==-1) {
            System.out.println("Empty Stack");
        }else{
            System.out.println("Stack elements (top to bottom):");
            for(int i=top;i>=0;i--){
                System.out.println(S[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack ss=new Stack();
        ss.create();

        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(40);
        ss.push(50);
        ss.push(60);

        ss.display();

        System.out.println("Popped value: " + ss.pop());

        System.out.println("Peek index 1: " + ss.peek(ss, 1));
        System.out.println("Peek index 3: " + ss.peek(ss, 3));

        ss.display();
    }
}
