import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i <=5; i++) {
            System.out.println("Enter number");
int b = scanner.nextInt();
            for( int x = 0; x <= b; x++){
                System.out.print("*");
            }
            System.out.println();
                }
    }
}
