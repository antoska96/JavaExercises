public class multiplyTheDigitsInAnInteger {
    public static void main(String[] args) {
        int number = 9332;
        int multiply = 1 ;
        while(number>0){
            multiply *= number % 10;
             number /=10;
        }
        System.out.println(multiply);
    }
}
