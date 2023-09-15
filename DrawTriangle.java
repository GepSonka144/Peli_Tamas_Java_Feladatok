import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.print("Please enter the triangle height: ");
        int TriangleHeight = new Scanner(System.in).nextInt();


        for (int i = 0; i < TriangleHeight; i++) {
            for (int j = 0; j < TriangleHeight; j++) {
                if(j <= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            
        }
    }
}
