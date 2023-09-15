import java.util.Scanner;

import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.printf("Hello, %s!", name);
        
    }
}
