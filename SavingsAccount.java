public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied. Interest: $" + interest);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account: " + getAccountNumber() + ", Balance: $" + getBalance());
    }
}
