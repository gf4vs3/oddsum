import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        int sum = calculateOddSum(number);
        System.out.println("The sum of odd numbers up to " + number + " is: " + sum);
    }

    public static int calculateOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}