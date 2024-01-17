## Files:


1. The program's entry point is *Main.java:*.
   - Calculates two numbers and an array from the user's input, shows the results, and displays the results.


2. *Input.java:*-Includes functions to receive double and integer inputs from the user, along with an array input function.


3. *java Calculator:*
   - Performs addition, subtraction, multiplication, and division, among other fundamental arithmetic operations.
   - Offers array operations including variance, standard deviation, sum, mean, mode, and median.


## Running Techniques:


1. Gather the files:


2. Launch the software:
# JavaCalc

There are three files in this Java programme: Main.java, UserInput.java, and Calculator.java. In addition to offering certain array-related operations including sum, mean, mode, median, variance, and standard deviation, it carries out simple arithmetic operations on two values.


## Files:

The program's entry point is *Main.java:*.
   - Calculates two numbers and an array from the user's input, shows the results, and displays the results.

2. *Input.java:*-Includes functions to receive double and integer inputs from the user, along with an array input function.

3. *java Calculator:*
   - Performs addition, subtraction, multiplication, and division, among other fundamental arithmetic operations.
   - Offers array operations including variance, standard deviation, sum, mean, mode, and median.

## Running Techniques:

1. Gather the files:

2. Launch the software:


## Functions/Methods:
*Basic Arithmetic:*
- add(double a, double b): Addition of two numbers.
- subtract(double a, double b): Subtraction of two numbers.
- multiply(double a, double b): Multiplication of two numbers.
- divide(double a, double b): Division of two numbers.

- *Array Operations:*
- sumArray(double[] array): Sum of elements in an array.
- meanArray(double[] array): Mean (average) of elements in an array.
- modeArray(double[] array): Mode of elements in an array.
- medianArray(double[] array): Median of elements in an array.
- varianceArray(double[] array): Variance of elements in an array.
- standardDeviationArray(double[] array): Standard Deviation of elements in an array.

## Example Usage:

```java
// Example usage in Main.java
double num1 = UserInput.getDoubleInput("Enter the first number: ");
double num2 = UserInput.getDoubleInput("Enter the second number: ");

// Perform basic calculations
System.out.println("Sum: " + Calculator.add(num1, num2));
System.out.println("Difference: " + Calculator.subtract(num1, num2));
// ... (Other basic operations)

// Array operations
int arraySize = UserInput.getIntInput("Enter the size of the array: ");
double[] array = UserInput.getArrayInput(arraySize);

System.out.println("Sum of array: " + Calculator.sumArray(array));
System.out.println("Mean of array: " + Calculator.meanArray(array));
// ... (Other array operations)
