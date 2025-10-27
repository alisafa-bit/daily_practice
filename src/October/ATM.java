package October;
import java.util.Scanner;

public class ATM {
    int balance;
    int pin;

    public ATM(int balance, int pin) {
        this.balance = balance;
        this.pin = pin;

    }

    public void menu() {
        System.out.println("1 : Check Balance");
        System.out.println("2 : Deposit");
        System.out.println("3 : Withdraw");
        System.out.println("4 : Change Pin");
        System.out.println("5 : Exit");
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("deposit " + amount );
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }
        balance = balance - amount;
        System.out.println("withdrawn: " + amount+ "$");
    }

    public int getBalance() {
        return balance;
    }

    public boolean validPIN(int pin) {
        return this.pin == pin;
    }

    public void changePIN(int newPIN) {
        this.pin = newPIN;
        System.out.println("PIN has changed");
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000, 1234);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enterPin = sc.nextInt();

        if (atm.validPIN(enterPin)) {
            System.out.println("PIN accepted.. Welcome");

            int option = 0;
            while (option != 5) {
                atm.menu();
                System.out.print("Choose an option: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("balance: " + atm.getBalance());
                        break;
                    case 2:
                        System.out.print("enter amount: ");
                        int depositAmount = sc.nextInt();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("enter amount: ");
                        depositAmount = sc.nextInt();
                        atm.withdraw(depositAmount);
                        break;
                    case 4:
                        System.out.print("enter new PIN: ");
                        int newPin = sc.nextInt();
                        atm.changePIN(newPin);
                        break;
                    case 5:
                        System.out.println("thank you for using ATM option.");
                        break;
                }
            }
        } else {
            System.out.println("invalid PIN entered");
        }
    }
}