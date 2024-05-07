import java.util.Scanner;

class Calci {
    private float a, b;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = scanner.nextFloat();
        System.out.print("Enter the value of b: ");
        b = scanner.nextFloat();
        scanner.close();
    }

    public void add() {
        System.out.println("--> The Addition of two numbers is: " + (a + b));
    }

    public void sub() {
        System.out.println("--> The Subtraction of two numbers is: " + (a - b));
    }

    public void multi() {
        System.out.println("--> The Multiplication of two numbers is: " + (a * b));
    }

    public void div() {
        if (b != 0) {
            System.out.println("--> The Division of two numbers is: " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}

class calci_in_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calci calc = new Calci();
        int choice;

        while (true) {
            System.out.println("------------------- Perform operation -------------------");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Enter the number of the operation to be performed: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calc.getData();
                    calc.add();
                    break;

                case 2:
                    calc.getData();
                    calc.sub();
                    break;

                case 3:
                    calc.getData();
                    calc.multi();
                    break;

                case 4:
                    calc.getData();
                    calc.div();
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

