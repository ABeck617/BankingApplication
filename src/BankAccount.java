import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;


    BankAccount(String cname, String cid)
    {
       customerName = cname;
       customerId = cid;

    }


    void deposit(int amount) {
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
        else {
            System.out.println("You cant deposit 0 dollars");
            return;
        }
    }
    void withdraw(int amount){
        balance = 25;
        if(amount != 0 && balance >= amount){
            balance -= amount;
            previousTransaction = -amount;
        } else {
            System.out.println("Error!");
            return;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction > 0) {
            System.out.println("Your deposit is " + previousTransaction);
        } else if (previousTransaction < 0){
            System.out.println("Your withdrawal is " + previousTransaction);
        } else {
            System.out.println("You have no previous transactions");
        }
    }
    void showMenu(){


        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " +customerName);
        System.out.println("Your ID is " +customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");


    }
}
