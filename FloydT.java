import java.util.Scanner;

public class FloydT {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number = 1;
        int rows;

        System.out.println("Let's print Floyed's Triangle");
        System.out.println("\nEnter number of rows you want in the Floyed Traingle: ");
        rows = sc.nextInt();
        System.out.println();
        sc.close();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    }

}