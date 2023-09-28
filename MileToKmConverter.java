import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.print("Miles:");
        double miles = new Scanner(System.in).nextDouble();

        double km = ConvertMileToKm(miles);

        System.out.println("km: " +km);

    }
    public static double ConvertMileToKm(double miles){

        return miles*1.609344;
    
    }
}


