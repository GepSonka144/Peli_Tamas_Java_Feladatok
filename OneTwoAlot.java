import java.util.Scanner;

public class OneTwoAlot {
    public static void main(String[] args) {
        System.out.print("Number:");

        int number = new Scanner(System.in).nextInt();

        if(number == 1) System.out.println("One");
        else if(number == 2)System.out.println("Two");
        else System.out.println("A lot");
    }
}
