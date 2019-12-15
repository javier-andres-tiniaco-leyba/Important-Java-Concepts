// https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

// Java program to demonstrate Arrays.asList() method

import java.util.Arrays;

class Main {
	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };
		// To convert the elements as List
		System.out.println("Integer Array as List: " + Arrays.asList(intArr));

        int intKey = 22;
        Arrays.sort(intArr);
        System.out.println(intKey + " found at index = "
                        + Arrays.binarySearch(intArr, intKey));

        System.out.println(intKey + " found at index = "
                        + Arrays.binarySearch(intArr, 1, 3, intKey));

        System.out.println("Integer Array: "
            + Arrays.toString(
                Arrays.copyOf(intArr, 10)
            )
        );

        System.out.println("\nNew Arrays by copyOfRange:\n");
        // To copy the array into an array of new length
        System.out.println("Integer Array: "
            + Arrays.toString(
                Arrays.copyOfRange(intArr, 1, 3)
            )
        );

        int intArr3[][] = { { 10, 20, 15, 22, 35 } };
        int intArr4[][] = { { 10, 15, 22 } };
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
            + Arrays.deepEquals(intArr3, intArr4)
        );

    } // end main
} // end class
