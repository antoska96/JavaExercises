import java.util.Scanner;

public class Palindromes {
    Scanner scanner = new Scanner(System.in);

    private int number;
    private int temp;
    private int sum = 0;
    private int r;
    private int temp1;


    public  Palindromes() {
       while((getNumber() < 10000) || (getNumber() > 99999)){
            setNumber(scanner.nextInt());
            temp1 = getNumber();
        }
   }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
            this.number = number;
    }

    public void IsPalindromes() {
        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum){
            System.out.println( temp1 + " It is a palindrome number ");}
        else
            System.out.println(temp1 + " not palindrome");
    }
}


