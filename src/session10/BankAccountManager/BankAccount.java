package session10.BankAccountManager;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private double accountNumber;
    private int balance;

    public BankAccount(String accountHolderName,double accountNumber,int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int sum){
        
        if (sum <= 0){
            System.out.println("The amount can't be negative or 0");
        }else{
            balance += sum;
            System.out.println("You added " + sum + " to your balance");
            System.out.println(getBalance());
        }
    }

    public void withdraw(int sum){
        if (balance < sum) {
            System.out.println("Insufficient funds to withdraw");
        } else if (sum <= 0) {
            System.out.println("You can't withdraw a negative amount");
        }else {
            balance -= sum;
            System.out.println("You withdraw " + sum + " from your balance.");
            System.out.println(getBalance());
        }
    }

    public void getAccountDetails(){
        System.out.println("Account Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }
}

class BankMenu{
    public static void menu(){
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. See balance");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
    }
}

class BankManager{
    public void main(String[] args) {
        boolean openMenu = true;
        BankAccount account1 = new BankAccount("Raul", 0, 0);
        double randomAccountNumber = Math.random();
        account1.setAccountNumber(randomAccountNumber);
        Scanner scanner = new Scanner(System.in);
        BankMenu.menu();

        do {
            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> {
                    System.out.print("Add amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account1.deposit(depositAmount);
                    account1.getAccountDetails();
                    BankMenu.menu();
                }
                case 2 ->{
                    System.out.print("Add amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    account1.withdraw(withdrawAmount);
                    account1.getAccountDetails();
                    BankMenu.menu();
                }
                case 3 ->{
                    System.out.println(account1.getBalance());
                    BankMenu.menu();
                }
                case 4 -> openMenu = false;
                default -> BankMenu.menu();
            }
        }while (openMenu);
    }
}
