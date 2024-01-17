import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Input 2 Numbers
        double num1 = Input.getDoubleInput("Enter the first number: ");
        double num2 = Input.getDoubleInput("Enter the second number: ");

        //Input Array
        int arraySize = Input.getIntInput("Enter the size of the array: ");
        double[] array = Input.getArrayInput(arraySize);

        //Creating Choice for User
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Please Select The Number for the following Calculation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Array Calculations");
        n = s.nextInt();

        if(n==1) {
            // Perform basic calculations
            System.out.println("Sum: " + Calculator.add(num1, num2));
        } else if (n==2) {
            System.out.println("Difference: " + Calculator.subtract(num1, num2));
        } else if (n==3) {
            System.out.println("Product: " + Calculator.multiply(num1, num2));
        } else if (n==4) {
            System.out.println("Quotient: " + Calculator.divide(num1, num2));
        } else if (n==5) {
            System.out.println("\nSum of array: " + Calculator.sumArray(array));
            System.out.println("\nMean of array: " + Calculator.meanArray(array));
            System.out.println("\nMode of array: " + Calculator.modeArray(array));
            System.out.println("\nMedian of array: " + Calculator.medianArray(array));
            System.out.println("\nVariance of array: " + Calculator.varianceArray(array));
            System.out.println("\nStandard Deviation of array: " + Calculator.standardDeviationArray(array));
        }
        else {
            System.out.println("\nInvalid Input! Please Choose from the Given Options!!!");
        }
    }
}
