import java.util.Scanner;

 class arrsort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        scanner.close();
    }
}

