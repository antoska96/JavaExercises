import java.util.Scanner;

public class SquareofAsterisks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Input size of square 1-20");
            size = scanner.nextInt();
        }
        while (size > 20);

            for(int i = 1; i <= size; i++) {
                for (int x = 1; x <= size; x++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
    }
}
