import java.util.Scanner;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class computeVolumeTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lenght = input.nextDouble();
        double volume;
        double area;
         area = (sqrt(3) / 4) * pow(lenght, 2);
         volume  = area * lenght;
        System.out.println("The area is: " +  area);
        System.out.println("The volume of the Triangular prism is:" + volume);
    }
}
