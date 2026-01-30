import java.util.Scanner;

public class codeforce2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        if (!sc.hasNextInt()) {  // Check if input is NOT an integer
            System.out.println("Invalid input");
            return; // exit the program
        }
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        if (!sc.hasNextInt()) {  // Check if input is NOT an integer
            System.out.println("Invalid input");
            return; // exit the program
        }
        int b = sc.nextInt();

        // Perform a calculation (example: sum)
        int result = a + b;
        System.out.println("Result: " + result);
    }
}
