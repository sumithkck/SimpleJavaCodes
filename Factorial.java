import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num;
        long factorial = 0;

        System.out.println("Enter number your want to find the factorial: ");
        num = sc.nextInt();
        factorial = num;
        sc.close();

        for (int i = (num - 1); i >= 1; i--) {

            factorial = factorial * i;
        }

        System.out.println("Factorial of the entered number is " + factorial);
    }

}
