import java.util.Scanner;

public class SmallInt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
     
        int[] arr =new int[x];

        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i]>arr[j]){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
                }
            }
          
        }
          System.out.println(arr[0]-1);
    }
}
