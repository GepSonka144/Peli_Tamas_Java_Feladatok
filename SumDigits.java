import java.util.ArrayList;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.print("Number: ");
        String UserInput = new Scanner(System.in).nextLine();
        
        int SumOfDigits = SumOfDigits(UserInput, 0, 0);
        System.out.println(SumOfDigits);
    }

    public static Integer SumOfDigits(String S, Integer Sum, Integer index){
        if(S.length() ==  index){
            return Sum;
        }
        else{
            String CharAtIndex = Character.toString(S.charAt(index));
            Sum += Integer.parseInt(CharAtIndex);

            return SumOfDigits(S, Sum, index+1);
        }
    }

}
