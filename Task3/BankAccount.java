public class BankAccount {
    private String accountNum;
    private double Balance;

    public BankAccount(){

    }
    public BankAccount(String accountNum, double Balance){
        this.Balance = Balance;
        this.accountNum = accountNum;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public double getBalance() {
        return Balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            Balance += amount;
            System.out.println("Deposit transfer successfully");
        }else{
            System.out.println("Invalid amount.");
        }
    }
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= Balance){
            Balance -= amount;
            System.out.println("The operation goes successfully.");
            return true;
        }else{
            System.out.println("Insufficient amount in the balance.");
            return false;
        }
    }
}