//package classWork;

import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Read single word (stops at whitespace)
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
// Read entire line (includes spaces)
        System.out.print("Enter your full name: ");
        scanner.nextLine(); // consume leftover newline character
        String fullName = scanner.nextLine();
// Input validation example
        System.out.print("Enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // consume invalid input
        }
        int age = scanner.nextInt();
        System.out.println("First name: " + firstName);
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        scanner.close(); // Important: prevents resource leak
    }
}
