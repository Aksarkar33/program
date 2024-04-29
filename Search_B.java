import java.util.Scanner;

public class Search_B {
    public static void main(String[] args) {
        int n=getUserInput("Enter size:");
        int arr[]=new int[n];
        int sr=getUserInput("Search item");
        for(int i=0;i<n;i++){
            arr[i]=getUserInput("value:");
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       
        int left=0;
        int right=n-1;
        while(left<=right){
        int midle=(left+right)/2;
        if (arr[midle]==sr) {
            System.out.println("found at "+ midle);
            return;
        }
        else if (arr[midle]<sr) {
            left=midle+1;
        }
        else{
            right=midle-1;
        }
    }
    }
        static int getUserInput(String message) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print(message);
                return scanner.nextInt();
            }
        }
    
}
