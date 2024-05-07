import java.util.Scanner;

class Bank {
    private int accNo;
    private String name;
    private int amount;
    private int balance;
    private int newBalance;
    private int debitAmount;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Bank name: ");
        name = scanner.nextLine();
        System.out.print("Enter the Account number: ");
        accNo = scanner.nextInt();
        System.out.print("Enter the Balance: ");
        balance = scanner.nextInt();
        scanner.close();
    }

    public void printData() {
        System.out.println("Bank name      : " + name);
        System.out.println("Account number : " + accNo);
        System.out.println("Balance        : " + balance);
        System.out.println("\n--------------------------------------------------------------------\n");
    }

    public void credit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be credited: ");
        amount = scanner.nextInt();
        newBalance = balance + amount;
        System.out.println("The new balance after credit is: " + newBalance);
        System.out.println("--------------------------------------------------------------------\n");
        scanner.close();
    }

    public void debit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be debited: ");
        debitAmount = scanner.nextInt();

        if (debitAmount < balance && debitAmount < newBalance && debitAmount > 2000) {
            newBalance -= debitAmount;
            System.out.println("The new balance after debit is: " + newBalance);
        } else {
            System.out.println("Invalid Amount");
        }
        System.out.println("---------------------------------------------------------------------\n");
        scanner.close();
    }
}
class Bank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Bank bank = new Bank();

        while (true) {
            System.out.println("Operation to be performed");
            System.out.println("\n1. GetData\n2. Credit\n3. Debit\n4. Exit");
            System.out.print("Enter the choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bank.getData();
                    bank.printData();
                    break;

                case 2:
                    bank.credit();
                    break;

                case 3:
                    bank.debit();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}

