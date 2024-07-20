class BankAccount{
    int accountNumber;
    String accountHolder;
    double balance;

    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
            System.out.println(amount + " has been deposited successfully.");
        }else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount){
        if(amount<=this.balance){
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn successfully.");
        }else{
            System.out.println("Insuffecient Amount");
        }
    }
    
    public void checkBalance(){
        System.out.println(this.balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.accountNumber = 230185;
        ba.accountHolder = "Diwas Bk";
        ba.deposit(100000);
        ba.withdraw(20000);

        System.out.println("Account Number: " + ba.accountNumber);
        System.out.println("Account Holder Name: " + ba.accountHolder);
        System.out.print("Remaining Balance: ");
        ba.checkBalance();
    }
}