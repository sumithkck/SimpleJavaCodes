import java.util.Scanner;

public class SimpleCal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double fNum;

        double sNum;

        int operation;

        System.out.println("*-*-Simple Calculator-*-*");

        // Getting user inputs

        System.out.println("\nEnter your first number: ");

        fNum = sc.nextDouble();

        System.out.println("Enter your second number: ");

        sNum = sc.nextDouble();

        // Getting the operation

        System.out.println("\n(a)Enter number 1 if you want add the numbers.");

        System.out.println("(b)Enter number 2 if you want to subtract second number from first number.");

        System.out.println("(c)Enter number 3 if your want to multiply two numbers.");

        System.out.println("(d)Enter number 4 if you want to divide first number from second number.");

        System.out.println(
                "(e)Enter number 5 if you want to find the remainder of first number devided by second number.");

        operation = sc.nextInt();

        sc.close();

        switch (operation) {

        case 1:

            double sum = fNum + sNum;

            System.out.println("Answer is " + sum);

            break;

        case 2:

            double diff = fNum - sNum;

            System.out.println("Answer is " + diff);

            break;

        case 3:

            double multi = fNum * sNum;

            System.out.println("Answer is " + multi);

            break;

        case 4:

            double div = fNum / sNum;

            System.out.println("Answer is " + div);

            break;

        case 5:

            double remainder = fNum % sNum;

            System.out.println("Remainder is " + remainder);

            break;

        default:

            System.out.println("Invalid operation");

        }

    }

}