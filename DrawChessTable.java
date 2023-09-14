import java.util.Scanner;
public class DrawChessTable {
    public static void main(String[] args) {
        System.out.print("Please enter the chess table size: ");
        int TableSize = new Scanner(System.in).nextInt();

        StringBuilder Table = new StringBuilder();
        StringBuilder TableReverse = new StringBuilder();

        for (int i = 0; i < TableSize; i++) {
            if(i % 2 == 0){
                Table.append("%");
                TableReverse.append(" ");
            }else{
                Table.append(" ");
                TableReverse.append("%");

            }
        }

        for (int i = 0; i < TableSize; i++) {
            if(i % 2 == 0){
                System.out.println(Table);
            }else System.out.println(TableReverse);
        }
    }
}
