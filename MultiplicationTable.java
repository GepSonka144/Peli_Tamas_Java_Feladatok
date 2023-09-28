import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        System.out.print("Number:");
        int number = new Scanner(System.in).nextInt();

        MultiplicationTablePrinter(number);
    }

    public static void MultiplicationTablePrinter(int number){

        for (int i = 1; i < 11; i++) {

            System.out.println(i + " * " + number + " = " + number*i);
            
        }

    }
}
