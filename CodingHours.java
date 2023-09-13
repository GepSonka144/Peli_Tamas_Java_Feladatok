public class CodingHours{
    public static void main(String[] args) {
        int AvarageCodingHours = 6;
        int LenghtOfTheSemester = 17;
        int Workdays = LenghtOfTheSemester*5;
        float CodingTime = Workdays*AvarageCodingHours;
        System.out.println("Avarage coding hours:" + CodingTime);
        System.out.println("Percantage: " + CodingTime/(52*17) * 100 +"%");
    }
}