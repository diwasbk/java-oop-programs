interface Transaction {
    double getAmount();
    boolean isValid();
}

class DepositTransaction implements Transaction {
    double amount;

    DepositTransaction(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public boolean isValid() {
        return this.amount > 0;
    }
}

class WithdrawalTransaction implements Transaction {
    double amount;
    double limit;

    WithdrawalTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public boolean isValid() {
        return this.amount <= limit;
    }
}

public class FinancialTransactionSystem {
    public static void main(String[] args) {
        DepositTransaction dt = new DepositTransaction(1000);
        System.out.println("Deposit Amount: " + dt.getAmount());
        System.out.println("Is Deposit Valid? " + dt.isValid());

        WithdrawalTransaction wt = new WithdrawalTransaction(2000, 20000);
        System.out.println("Withdrawal Amount: " + wt.getAmount());
        System.out.println("Is Withdrawal Valid? " + wt.isValid());
    }
}