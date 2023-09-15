import java.util.Scanner;

public class DreawDiagonal {
    public static void main(String[] args) {
        System.out.println("Please enter the square size: ");
        int SquareSize = new Scanner(System.in).nextInt();
        
        StringBuilder Square = new StringBuilder();
        for (int i = 0; i < SquareSize; i++) {
            if(i == 0 || i == SquareSize-1){
                for(int a = 0; a < SquareSize; a++){
                    Square.append("%");
                }
                Square.append("\n");
            }
            
                
            
        }
    }
}
