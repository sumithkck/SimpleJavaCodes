
import java.util.Scanner;

public class SimpleInterestCal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double Capital, Interest, MatVal;
        int Tenor;

        System.out.println("Enter the invested capital amount: ");
        Capital = sc.nextDouble();
        System.out.println("Enter the interest rate per annum: ");
        Interest = sc.nextDouble();
        System.out.println("Enter number of years invested: ");
        Tenor = sc.nextInt();

        sc.close();

        double mInterest = ((Capital * Interest) / 100) * Tenor;
        MatVal = mInterest + Capital;

        System.out.println("Interest for a one year is " + (Capital * Interest) / 100 + "0");
        System.out.println("Maturity value of the investment is " + MatVal + "0");

    }

}