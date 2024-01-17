import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            scanner.next();  // consume the invalid input
        }
        return scanner.nextDouble();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next();  // consume the invalid input
        }
        return scanner.nextInt();
    }

    public static double[] getArrayInput(int size) {
        double[] array = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = getDoubleInput("Element " + (i + 1) + ": ");
        }
        return array;
    }
}
