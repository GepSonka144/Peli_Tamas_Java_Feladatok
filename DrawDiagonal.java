import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.print("Please enter the square size: ");
        int SquareSize = new Scanner(System.in).nextInt();

        for (int i = 0; i < SquareSize; i++) {
            for (int j = 0; j < SquareSize; j++) {
                if(i == 0 || i == SquareSize-1 || j == SquareSize-1 || j == i  || j == 0) System.out.print("%");
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
