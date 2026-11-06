import java.util.Scanner;
public class Main {
    public static int addThreeNumbers(int valueA, int valueB, int valueC)
    {
        //Calculations to add three numbers and return the result
        int sum = valueA + valueB + valueC;
        return sum;
    }

    public static void main(String[] args) {
        //Declarations
        Scanner in = new Scanner(System.in);
        int inputA = 0;
        int inputB = 0;
        int inputC = 0;

        //User Prompt 1
        System.out.print("Enter the first number: ");

        //User Input and Verification 1
        if (in.hasNextInt()) {
            inputA = in.nextInt();
        } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }

        //User Prompt 2
        System.out.print("Enter the second number: ");

        //User Input and Verification 2
        if (in.hasNextInt()) {
            inputB = in.nextInt();
        } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }

        //User Prompt 3
        System.out.print("Enter the third number: ");

        //User Input and Verification 3
        if (in.hasNextInt()) {
            inputC = in.nextInt();
        } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }
        //Calculations completed in other method
        int result = addThreeNumbers(inputA,inputB,inputC);

        //User Output
        System.out.println("The result is " + result);
    }
}