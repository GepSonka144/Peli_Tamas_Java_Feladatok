import java.util.Scanner;
public class ConditionalVariableMutation {
    public static void main(String[] args) {
        int a = 2;
        int output1 = 0;

        if(a % 2 == 0) output1++;
        System.out.println(output1);
        int b = new Scanner(System.in).nextInt();
        String output2;
        if(b > 10 && b < 20) output2 = "Sweet!";
        else if(b < 10) output2 = "Less!";
        else output2 = "More!";
        System.out.println(output2);
        int output3 = 10;
        int variableCredits = new Scanner(System.in).nextInt();
        Boolean isBonus = new Scanner(System.in).nextBoolean();
        if(variableCredits > 49 && isBonus == false) output3 -= 2;
        else if(variableCredits < 49 && isBonus == false) output3 += 1;
        
        int d = new Scanner(System.in).nextInt();
        int time = new Scanner(System.in).nextInt();
        String output4;
        if (d % 4 == 0 && time < 201) output4 = "Check";
        else if(time > 200) output2 = "Time out";
        else output4 = "Run Forest Run!";


        
    }
}
