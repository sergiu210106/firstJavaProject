import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------\nSimple Calculator\n----------------------");
        
        while (true) {
            boolean errorHappened = false;

            System.out.println("Enter 1 to continue or 0 to stop the program");
            System.out.print("Enter choice (1/0): ");
            int choice = scanner.nextInt();

            if (choice != 1)
                break;

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        errorHappened = true;
                    }

                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    return;
            }
            if (!errorHappened) 
                System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
