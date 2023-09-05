import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int SumOfNumbers = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Please enter a number: ");
                SumOfNumbers = SumOfNumbers + scanner.nextInt();
            }

            System.out.println("Sum: "+ SumOfNumbers + " Average: " + (float)SumOfNumbers/5);
    }
}
