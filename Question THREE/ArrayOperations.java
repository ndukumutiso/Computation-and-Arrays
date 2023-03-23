import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[15];
        System.out.println("Enter 15 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // a) Print the values stored in the array on screen.
        System.out.println("Values in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // b) Ask user to enter a number, check if that number (entered by user) is present in array
        // or not. If it is present print, “the number found at index (index of the number) ” and the text “number not found in this array”
        System.out.println("Enter a number to search in the array:");
        int num = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array.");
        }

        // c) Create another array, copy all the elements from the existing array to the new array but in reverse order.
        // Now print the elements of the new array on the screen
        int[] reverse = new int[numbers.length];
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            reverse[j] = numbers[i];
        }
        System.out.println("Values in the reversed array:");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();

        // d) Get the sum and product of all elements of your array. Print product and the sum each on its own line.
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
