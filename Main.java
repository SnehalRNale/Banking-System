public class Main {
    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 5000, 3.5);
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(1000);
        savingsAccount.applyInterest();
        savingsAccount.withdraw(2000);
        
        System.out.println();

        // Create a current account
        CurrentAccount currentAccount = new CurrentAccount("CA456", 3000, 1000);
        currentAccount.displayAccountInfo();
        currentAccount.deposit(500);
        currentAccount.withdraw(4000);  // Should allow up to overdraft limit
        currentAccount.withdraw(5000);  // Should exceed overdraft limit
    }
}
