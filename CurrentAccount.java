public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Current Account: " + getAccountNumber() + ", Balance: $" + getBalance());
    }
}
