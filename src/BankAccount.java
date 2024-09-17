public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount( double balance) {
        this.accountNumber = "00000";
        this.balance = balance;
    }
    public BankAccount(){
        this(0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        System.out.println("Final balance: $"+balance);
        return balance;
    }

    public void deposit(double deposit) throws InsufficientFundsException {
        System.out.println("Depositing $"+deposit);
        if (deposit <= 0) {
            System.out.println("Deposit failed!");
            throw new InsufficientFundsException("Insufficient funds!");
        }else {
            System.out.println("Deposit Successful!");
            this.balance = balance + deposit;
            System.out.println("Currant balance is $"+balance);
        }
    }

    public void withdraw(double withdraw) throws InvalidAmountException {
        System.out.println("Attempting to withdraw $"+withdraw);
        if (withdraw < 0 || withdraw > balance) {
            System.out.println("Failed !");
            throw new InvalidAmountException(" Invalid amount!\n");
        }else {
            System.out.println("Successful !");
            this.balance = balance - withdraw;
            System.out.println("Currant balance is $"+balance);
        }
    }
}
