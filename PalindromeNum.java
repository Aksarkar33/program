class Main {
    public static void main(String[] args) {
        int n=123;
        int org=n;
        int resV=0;
        while (n>0){
            int digit =n%10;
            resV=(resV*10)+digit;
            n=n/10;
            
        }
        if(org==resV){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }
}