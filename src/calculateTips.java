import java.util.Scanner;

public class calculateTips {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal and a gratuity rate: ");
        Scanner input = new Scanner(System.in);
        double subTotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double temp = (subTotal*gratuity)/100;
        System.out.println("The gratuity is $" + temp + " and total $" + (subTotal+temp));
    }
}
