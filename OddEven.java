import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Number:");

        int number = new Scanner(System.in).nextInt();

        if(number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }   
}
