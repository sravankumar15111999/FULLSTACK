public class Account {
    private int accountNumber;
     private double balance;
    private String owner;

    // Constructor
    public Account(int accountNumber, double initialBalance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.owner = owner;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get the account owner's name
    public String getOwner() {
        return owner;
    }
}

 class SavingsAccount extends Account {
     private double interestRate;

     // Constructor
     public SavingsAccount(int accountNumber, double initialBalance, String owner, double interestRate) {
         super(accountNumber, initialBalance, owner);
         this.interestRate = interestRate;
     }

     public double getInterestRate() {
         return interestRate;
     }

     public void setInterestRate(double interestRate) {
         this.interestRate = interestRate;
     }

     public static void main(String[] args) {
         // Creating a savings account with initial balance, owner name, and interest rate
         SavingsAccount mySavingsAccount = new SavingsAccount(123456, 1000.0, "John Doe", 5.0);


         // Getting the current balance and owner's name
         double balance = mySavingsAccount.getBalance();
         String owner = mySavingsAccount.getOwner();

         // Displaying the account information
         System.out.println("Account Owner: " + owner);
         System.out.println("Current Balance: $" + balance);
         System.out.println("Interest Rate: " + mySavingsAccount.getInterestRate() + "%");
     }
 }


