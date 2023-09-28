import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.print("How many lines: ");
        int amountOfLines = new Scanner(System.in).nextInt();
        double SumOfNumbers = 0;
        for (int i = 1; i < amountOfLines+1; i++) {
            System.out.println("Enter a number " + i + " of " + amountOfLines+": ");
            SumOfNumbers+= new Scanner(System.in).nextInt();
        }

        System.out.println("Sum: "+SumOfNumbers + ", Average: " + (SumOfNumbers/amountOfLines));
    }
}
