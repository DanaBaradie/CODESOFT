public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A2312345", 5000.0);
        ATMAccount atmAccount = new ATMAccount(account);
        atmAccount.program();
    }
}