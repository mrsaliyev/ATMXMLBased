package kz.iitu.atm;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private int id;
    private String login;
    private int pin;
    private int balance;

    public Account(int id, String login, int pin, int balance) {
        this.id = id;
        this.login = login;
        this.pin = pin;
        this.balance = balance;
    }

    public Account() {

    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
