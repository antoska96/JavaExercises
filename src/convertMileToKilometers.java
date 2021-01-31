
import java.util.Scanner;

public class convertMileToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles = input.nextDouble();
        double kilometers = (int)((miles*1.6)*100)/100.00;
        System.out.println(miles + " miles is " + kilometers + " Km");
    }
}



