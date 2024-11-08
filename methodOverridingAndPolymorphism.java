class BankAccnt {
    public void calculateInterest() {
        System.out.println("Calculating interest at base rate.");
    }
}

class SavingsAccount extends BankAccnt {
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest at savings account rate.");
    }
}

class CheckingAccount extends BankAccnt {
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest at checking account rate.");
    }
}

public class MainforPolymorphism09112024 {
    public static void main(String[] args) {
        // polymorphism implemented here
        BankAccnt baseAccount = new BankAccnt();
        BankAccnt savings = new SavingsAccount();
        BankAccnt checking = new CheckingAccount();

        baseAccount.calculateInterest(); // Base rate interest
        savings.calculateInterest(); // Savings rate interest
        checking.calculateInterest(); // Checking rate interest
    }
}
