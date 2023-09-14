import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.print("Please enter the diamond height: ");
        int DiamondHeight = new Scanner(System.in).nextInt();

        StringBuilder DiamondTopHalf = BuildPiramid(DiamondHeight, false).reverse();
        StringBuilder DiamondBottomHalf = BuildPiramid(DiamondHeight -1, true);

        System.out.println(DiamondTopHalf);
        System.out.println(DiamondBottomHalf);

    }


    public static StringBuilder BuildPiramid(int PiramidHeight, Boolean AddExtraSpace){
        int WhereToPutStar = (PiramidHeight -1) *2 + 1;
        int WhereNotToPutStar = (PiramidHeight -1) *2 + 1;
        StringBuilder Piramid = new StringBuilder();
        for (int i = 0; i < PiramidHeight; i++) {
            if(AddExtraSpace) Piramid.append(" ");
            for (int j = 0; j < WhereToPutStar; j++) {
                if((j < i && i != 0) || j >= WhereNotToPutStar) Piramid.append(" ");
                else Piramid.append("*");
            }
            if(i != PiramidHeight -1) Piramid.append("\n");
            WhereNotToPutStar -= 1;

        }

        return Piramid;

    }
}