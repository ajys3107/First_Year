import java.util.Scanner;

 class sq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPerfectSquare = false;
        for (int i = 0; i <= number; i++) {
            if (number == i * i) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square");
        } else {
            System.out.println(number + " is not a perfect square");
        }

        scanner.close();
    }
}

