import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindromee(String s){
        s=s.toLowerCase();

        String rev ="";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sring :");

        String input =sc.nextLine();

        boolean r = isPalindromee(input);

        if (r) {
            System.out.println(input+" Is Palindrome");
        }else{
            System.out.println(input+" is not Palindrome");
        }
    }
    
}
