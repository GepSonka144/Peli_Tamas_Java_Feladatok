import java.util.Scanner;
public class DrawChessBoard{
    public static void main(String[] args) {
        
        System.out.print("Please enter the table size: ");
        int TableSize = new Scanner(System.in).nextInt();
        StringBuilder Table = new StringBuilder();
        StringBuilder TableReversed = new StringBuilder();

        for (int i = 0; i < TableSize; i++) {
            if(i % 2 == 0 ) Table.append( "1");
            else Table.append("2");


        }
        for (int i = 0; i < TableSize; i++) {
            if(i % 2 == 0 ) TableReversed.append( "2");
            else TableReversed.append("1");


        }

        for (int ii = 0; ii < TableSize ; ii++) {
            if(ii % 2 == 0)System.out.println(Table);
            else System.out.println(TableReversed);
            
        }

    }
}