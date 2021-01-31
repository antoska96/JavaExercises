import java.util.Scanner;

public class convertMetersIntoFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meters = input.nextDouble();
        double feet = meters * 3.2786;
        System.out.println(meters + " meters is " + feet + " feet");
    }
}
