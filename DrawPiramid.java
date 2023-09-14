import java.util.Scanner;

public class DrawPiramid {
    public static void main(String[] args) {

        System.out.print("Please enter the piramid height: ");
        int PiramidHeight = new Scanner(System.in).nextInt();
        StringBuilder Piramid = BuildPiramid(PiramidHeight).reverse();

        System.out.println(Piramid);

    }

    public static StringBuilder BuildPiramid(int PiramidHeight){
        int WhereToPutStar = (PiramidHeight -1) *2 + 1;
        int WhereNotToPutStar = (PiramidHeight -1) *2 + 1;
        StringBuilder Piramid = new StringBuilder();
        for (int i = 0; i < PiramidHeight; i++) {
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
