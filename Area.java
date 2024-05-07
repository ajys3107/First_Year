import java.util.Scanner;

class area {
    public static void triangle1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base and Height: ");
        float base = scanner.nextFloat();
        float height = scanner.nextFloat();
        float area = (base * height) / 2;
        System.out.println("Area of Triangle is " + area);
    }

    public static void triangle2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter three sides of triangle");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float s = (a + b + c) / 2;
        float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("\nArea of triangle: " + area);
    }

    public static void triangle3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of an equilateral triangle: ");
        float side = scanner.nextFloat();
        float area = (float) ((Math.sqrt(3) / 4) * (side * side));
        System.out.printf("Area of equilateral triangle = %.2f sq. units%n", area);
    }

    public static void rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of length: ");
        int length = scanner.nextInt();
        System.out.print("Enter the value of breath: ");
        int breath = scanner.nextInt();
        int area = length * breath;
        System.out.println("The area of rectangle is " + area);
    }

    public static void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of side: ");
        int side = scanner.nextInt();
        int area = side * side;
        System.out.println("The area of square is " + area);
    }

    public static void circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = scanner.nextInt();
        float area = (float) (3.14 * radius * radius);
        System.out.println("The area of circle is " + area);
    }

    public static void pentagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of side: ");
        int side = scanner.nextInt();
        float area = (float) (1.72 * side * side);
        System.out.println("The area of pentagon is " + area);
    }

    public static void parallelogram() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the value of height: ");
        int height = scanner.nextInt();
        int area = base * height;
        System.out.println("The area of parallelogram is " + area);
    }

    public static void trapezium() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of parallel sides: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Enter the value of height: ");
        int h = scanner.nextInt();
        float area = (float) (0.5 * (a + b) * h);
        System.out.println("The area of Trapezium is " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nNumber of Operations");
            System.out.println("1. Triangle\n2. Rectangle\n3. Square\n4. Circle\n5. Pentagon\n6. Parallelogram\n7. Trapezium");
            System.out.print("Enter the number of operation to be performed: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("1. Regular Triangle\n2. Scalene Triangle\n3. Equilateral Triangle");
                    System.out.print("Enter the number of operation performed: ");
                    int v = scanner.nextInt();
                    switch (v) {
                        case 1:
                            triangle1();
                            break;
                        case 2:
                            triangle2();
                            break;
                        case 3:
                            triangle3();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;

                case 2:
                    rectangle();
                    break;

                case 3:
                    square();
                    break;

                case 4:
                    circle();
                    break;

                case 5:
                    pentagon();
                    break;

                case 6:
                    parallelogram();
                    break;

                case 7:
                    trapezium();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

