public interface ATMUser {
    double checkBalance();
    void withdraw(double amount);
    void deposit(double amount);
}