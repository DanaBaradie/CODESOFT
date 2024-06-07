import java.util.Scanner;
public class ATMAccount implements ATMUser {
    private BankAccount account;
    private Scanner inn;

    public ATMAccount(){

    }
    public ATMAccount(BankAccount account){
        this.account = account;
        this.inn = new Scanner(System.in);
    }

    public void program(){
        while(true){
            System.out.println("ATM account: ");
            System.out.println("Write 1 for adding a deposit.");
            System.out.println("Write 2 for withdrawing.");
            System.out.println("Write 3 to check your balance.");
            System.out.println("Write 4 to exit.");

            int choice = inn.nextInt();

            switch(choice){
                case 1:
                handleDeposit();
                break;
                case 2:
                handleWithdraw();
                break;
                case 3:
                handleCheckBalance();;
                break;
                case 4:
                System.out.println("Welcome to our services.");
                break;
                default:
                System.out.println("Try another number.");
            }
        }
    }
    public void handleWithdraw(){
        System.out.print("Enter amount to withdraw: ");
        double amount = inn.nextDouble();
        withdraw(amount);
    }
    public void handleDeposit(){
        System.out.print("Enter the amount of the deposit: ");
        double amount = inn.nextDouble();
        deposit(amount);
    }
    public void handleCheckBalance(){
        System.out.println("Your balance: " + checkBalance());
    }
    @Override
    public double checkBalance() {
        return account.getBalance();
    }
    @Override
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }
}