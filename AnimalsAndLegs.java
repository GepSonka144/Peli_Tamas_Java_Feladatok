import java.util.Scanner;

public class AnimalsAndLegs {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the number of chickens: ");
        int NumOfChickens = scanner.nextInt();
        System.out.print("Please enter the number of pigs: ");
        int NumOfPigs = scanner.nextInt();

        System.out.println("The number of legs: "+ (NumOfChickens*2+NumOfPigs*4));


    }
}
