import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("XYZ", "BA001");
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


        System.out.println("Enter 1 to see previous transaction");
        userInput = scanner.nextInt();
        if(userInput == 1) {
           bankAccount.getPreviousTransaction();
        } else {
            System.out.println("You didn't press 1");
        }
        bankAccount.withdraw(userInput);

        System.out.println("Ok you withdraw " + userInput);






    }
}