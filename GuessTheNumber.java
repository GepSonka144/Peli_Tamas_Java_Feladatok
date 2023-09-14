import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int RandomNum = rnd.nextInt(100);
        int UserInput;
        do{
            System.out.print("Please enter your guess: ");
            UserInput = scanner.nextInt();
            if(UserInput <RandomNum) System.out.println("The stored number is greater than " + UserInput);
            if(UserInput >RandomNum) System.out.println("The stored number is smaller than " + UserInput);
            if(UserInput == RandomNum) System.out.println("You have found the stored number " + UserInput);
        }while(UserInput != RandomNum);
    }
}
