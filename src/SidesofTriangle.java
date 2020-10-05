import java.util.Scanner;

public class SidesofTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inster non-zero integers three time's : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c){
            System.out.println("It is a sides of Triangle");
        }
        else System.out.println("Error");
    }
}
