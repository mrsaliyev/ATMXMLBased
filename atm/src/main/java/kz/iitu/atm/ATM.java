package kz.iitu.atm;

import java.util.Scanner;

public class ATM {
    private boolean status;
    private Bank bank;

    Scanner sc = new Scanner(System.in);

    public void run() {
        menu();
    }

    private void menu() {

        System.out.println("Enter the account number");
        String accountNumber = sc.next();
        System.out.println("Enter pin");
        int currentCin = sc.nextInt();
        if(bank.checkAccount(accountNumber,currentCin) == true){
            int menu = 4;
            do{
                System.out.println("1: Check balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Top up");
                System.out.println("4: Change pin");
                System.out.println("5: Exit");
                System.out.println("Select Following Options");

                menu = sc.nextInt();
                switch (menu){
                    case 1:
                        bank.checkBalance(accountNumber);
                        break;
                    case 2:
                        System.out.println("Enter the amount");
                        int amount = sc.nextInt();
                        bank.withdraw(accountNumber, amount);
                        break;
                    case 3:
                        System.out.println("Enter the amount");
                        int top = sc.nextInt();
                        bank.topUp(accountNumber, top);
                        break;
                    case 4:
                        System.out.println("Enter old pin");
                        int oldPin = sc.nextInt();
                        System.out.println("Enter new pin");
                        int newPin = sc.nextInt();
                        bank.changePin(accountNumber, oldPin, newPin);
                        break;
                    case 5:
                        System.out.println("Goodbye");
                        System.exit(0);
                }
            }while (menu != 4);
        }else
            System.out.println("Incorrect data");

    }


}
