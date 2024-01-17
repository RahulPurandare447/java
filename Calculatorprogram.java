import java.util.Arrays;

class Calculator {
    public static double add(double fN, double sN) {
        return fN + sN;
    }

    public static double subtract(double fN, double sN) {
        return fN - sN;
    }

    public static double multiply(double fN, double sN) {
        return fN * sN;
    }

    public static double divide(double fN, double sN) {
        if (sN == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;  // Indicating an undefined result
        }
        return fN / sN;
    }

    public static double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    public static double meanArray(double[] array) {
        double sum = 0;

        for(double n: array) {
            sum += n;
        }
        return sum / array.length;
    }
    public static double modeArray(double[] array) {
        Arrays.sort(array);
        double mode = array[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }

        return mode;
    }

    public static double medianArray(double[] array) {
        Arrays.sort(array);
        int length = array.length;

        if (length % 2 == 0) {
            // If the array length is even, return the average of the middle two elements
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;
            return (array[middleIndex1] + array[middleIndex2]) / 2.0;
        } else {
            // If the array length is odd, return the middle element
            return array[length / 2];
        }
    }

    public static double varianceArray(double[] array) {
        double sum = 0;

        double mean = meanArray(array);
        double sumSquaredDifferences = 0;

        for (double num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return sumSquaredDifferences / array.length;
    }

    public static double standardDeviationArray(double[] array) {
        return Math.sqrt(varianceArray(array));
    }
}
