import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private int[] marks = new int[5];
    private int sum = 0;
    private int percentage;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of student:");
        name = scanner.next();
        System.out.println("Enter the roll number of student:");
        rollNo = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks of subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        scanner.close();
        percentage = (sum * 100) / 500;
    }

    public void showData() {
        System.out.println("\nThe name of student is: " + name);
        System.out.println("The roll number is: " + rollNo);
        System.out.println("The total marks obtained by student out of 500 is: " + sum);
        System.out.println("Percentage is: " + percentage + "%");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();

        Student[] students = new Student[size];

        for (int i = 0; i < size; i++) {
            students[i] = new Student();
            students[i].getData();
        }

        for (int i = 0; i < size; i++) {
            students[i].showData();
        }

        scanner.close();
    }
}

