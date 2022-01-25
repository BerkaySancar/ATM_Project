
import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password;
        int balance = 1000; // Starting amount.
        int select;

        int right = 3;
        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("java") && password.equals("1234")) {
                System.out.println("-----     Welcome to X Bank.      -----");
                do {
                    System.out.print("Services: \n1)Deposit Cash \n2)Withdraw Cash \n3)Balance Check \n4)Exit \nSelect: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Amount: ");
                            int amount = input.nextInt();
                            balance += amount;
                            System.out.println("Updated Balance = " + balance);
                            break;
                        case 2:
                            System.out.print("Amount: ");
                            int amountWithdraw = input.nextInt();
                            if (amountWithdraw > balance) {
                                System.out.println("İnsufficient balance. Check your balance! ");
                            }else {
                                balance -= amountWithdraw;
                                System.out.print("Updated Balance = " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Balance = " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.print("Thanks for using our ATM. See you later. ");
                break;
            } else {
                right--;
                System.out.println("Incorrect entry. You have " + right + " more right.");
                if (right == 0) {
                    System.out.print("Your account has been blocked. Call your bank!");
                }
            }
        }
    }
}