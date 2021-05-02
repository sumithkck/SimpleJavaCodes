import java.util.Scanner;

public class PowerCal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int base;
        int power;

        System.out.println("Power Calculator");
        System.out.println("\nEnter base number:");
        base = sc.nextInt();
        System.out.println("Enter the exponent:");
        power = sc.nextInt();
        sc.close();

        long ans = 1;

        for (int i = power; i > 0; i--) {

            ans = ans * base;
        }

        System.out.println("Answer of " + base + " to the power " + power + " is " + ans);

    }

}
