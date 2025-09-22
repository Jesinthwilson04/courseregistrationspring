import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean operationDone = false;

        while (true) {
            System.out.println("\nSimple calculation");
            System.out.println("Enter any two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("1. Add the numbers");
            System.out.println("2. Subtract the numbers");
            System.out.println("3. Divide the numbers");
            System.out.println("4. Multiply the numbers");
            System.out.println("5. Exit the program");
            System.out.println("6. Display the result");
            System.out.println("Please enter your operation");

            int operation = sc.nextInt();

            if (operation == 1) {
                result = a + b;
                operationDone = true;
            } else if (operation == 2) {
                result = a - b;
                operationDone = true;
            } else if (operation == 3) {
                if (b != 0) {
                    result = a / b; // integer division
                    operationDone = true;
                } else {
                    System.out.println("Error: Division by zero");
                }
            } else if (operation == 4) {
                result = a * b;
                operationDone = true;
            } else if (operation == 5) {
                break; // exit loop
            } else if (operation == 6) {
                if (operationDone) {
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Hey, you did not make any operation");
                }
            } else {
                System.out.println("Invalid operation! Try again.");
            }

            // after any operation, ask if user wants to display
            if (operation != 5) {
                System.out.println("Do you want to display result now? (y/n)");
                char choice = sc.next().charAt(0);

                if (choice == 'y' || choice == 'Y') {
                    if (operationDone) {
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Hey, you did not make any operation");
                    }
                }
            }
        }
    }
}
