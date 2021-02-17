package kz.iitu.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Bank implements BankInterface {

    private Long id;
    private String name;
    private List<Account> accounts;

    public Bank(Long id, String name, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    public Bank() {
        this.name = "Kaspi (default)";
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public boolean checkAccount(String accountNumber, int currentCin) {
        boolean ans = false;
        for (int i = 0; i < accounts.size(); i++) {
            if((accounts.get(i).getLogin() == accountNumber) && accounts.get(i).getPin() == currentCin){
                ans = true;
            }else
                ans = false;
        }
        return ans;
    }

    public void changePin(String accountNumber, int oldPin, int newPin) {
        for (int i = 0; i < accounts.size(); i++) {
            if((accounts.get(i).getLogin() == accountNumber) && accounts.get(i).getPin() == oldPin){
                accounts.get(i).setPin(newPin);
            }else
                System.out.println("Error");
        }
    }

    @Override
    public void checkBalance(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).getLogin() == accountNumber)
                System.out.println("Your balance is " + accounts.get(i).getBalance());
        }
    }

    @Override
    public void withdraw(String accountNumber, int amount) {
        for (int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).getLogin() == accountNumber && accounts.get(i).getBalance() >= amount) {
                System.out.println("Withdraw succesfull");
                accounts.get(i).setBalance(accounts.get(i).getBalance() - amount);
            }else
                System.out.println("Balance is less than amount");
        }
    }

    @Override
    public void topUp(String accountNumber, int top) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getLogin() == accountNumber)
                accounts.get(i).setBalance(accounts.get(i).getBalance() + top);
        }
    }
}
