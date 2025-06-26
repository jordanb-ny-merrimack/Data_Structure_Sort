import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;

/**
 * A command-line program that reads integer inputs from the user,
 * stores them in a Stack, sorts the list in ascending order,
 * and displays the sorted result.
 *
 * 
 * To run: java SortedStack.java
 * To generate javadoc: javadoc SortedStack.java
 * 
 * @author Alfred Burgess
 */
public class SortedStack {

    /**
     * The main method scans integers from standard input,
     * stores them in a Stack, sorts them, and prints the result.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter integers (type 'end' to finish):");

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("end")) break;

            try {
                int num = Integer.parseInt(input);
                numbers.push(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'end' to finish.");
            }
        }

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);
    }
}
