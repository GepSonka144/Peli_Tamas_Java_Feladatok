public class FizzBuzz {
    public static void main(String[] args) {
        String FizzBuzz = "";
        for (int i = 1; i < 101; i++) {
            FizzBuzz = "";
            if(i % 3 == 0) FizzBuzz += "Fizz";
            if(i % 5 == 0) FizzBuzz += "Buzz";
            if(FizzBuzz != "")
            System.out.println(FizzBuzz);
        }
    }
}
