import java.util.Scanner;

public class IT22050762Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumSquares = 0;

        System.out.println("Enter positive numbers (-99 to stop):");

        while (true) {

            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number <= 0) {
                System.out.println("Invalid input! Enter a positive number.");
                continue;
            }

            sumSquares = sumSquares + (number * number);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
            System.out.println("Root Mean Square: " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }

        input.close();
    }
}
