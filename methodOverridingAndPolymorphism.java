class BankAccount {
    public void calculateInterest() {
        System.out.println("Calculating interest at base rate.");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest at savings account rate.");
    }
}

class CheckingAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest at checking account rate.");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount baseAccount = new BankAccount();
        BankAccount savings = new SavingsAccount();
        BankAccount checking = new CheckingAccount();

        baseAccount.calculateInterest(); // Base rate interest
        savings.calculateInterest();     // Savings rate interest
        checking.calculateInterest();    // Checking rate interest
    }
}

