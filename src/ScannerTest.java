import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        int userInput;


        System.out.println("How much money do you want to deposit");
        userInput = scanner.nextInt();
        bankAccount.deposit(userInput);

        System.out.println("Ok you deposited " + userInput);




        System.out.println("How much money do you want to withdrawal");
        userInput = scanner.nextInt();
        bankAccount.withdraw(userInput);

        System.out.println("Ok you withdraw " + userInput);






    }
}