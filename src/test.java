public class test {
    public static void main(String[] args) throws Exception {
        BankAccount dadsAccount = new BankAccount(100);
        try {
            dadsAccount.deposit(50);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
        try{
            dadsAccount.withdraw(200);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        try{
            dadsAccount.withdraw(50);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        try {
            dadsAccount.deposit(-10);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
        finally{
            dadsAccount.getBalance();
            System.out.println("Thank you for banking with us (^_^)");
        }
    }
}
