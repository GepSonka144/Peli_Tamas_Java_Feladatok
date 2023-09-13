import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        
        int a,b;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Please enter a value for 'a': ");
            a = scanner.nextInt();
            System.out.print("Please enter a value for 'b': ");
            b = scanner.nextInt();
            if(b <= a) System.out.println("The second number should be bigger");
        }while(b <= a) ;


    }
}
