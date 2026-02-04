class ATMException extends Exception{
    ATMException(String massege){
        super(massege);
    }
}

public class ATMSimulation {
    static int correctPin = 1234;
    static double balance = 5000;

    static void withdraw(int pin ,double amount) throws ATMException{
        if(pin!=correctPin){
            throw new ATMException("Not correct pin");
        }
        if(amount>balance){
            throw new ATMException("Insufficent balance");
        }
        balance=balance-amount;
        System.out.println(" Please collect your cash: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
    public static void main(String[] args) {
        System.out.println("--- Welcome to SBI ATM ---");

        try{
            int mypin=1234;
            double want=3000;

            withdraw(mypin, want);
        }catch(ATMException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Unknown error");
        } finally {
        System.out.println("\n--- Card Ejected. Thank You! ---");
        }
    }
}
