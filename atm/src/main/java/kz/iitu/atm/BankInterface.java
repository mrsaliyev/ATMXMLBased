package kz.iitu.atm;

public interface BankInterface {
    void checkBalance(String accountNumber);
    void withdraw(String accountNumber, int amount);
    void topUp(String accountNumber, int top);
}
