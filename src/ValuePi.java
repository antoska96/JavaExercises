import static java.lang.StrictMath.sqrt;

public class ValuePi {

    //    public static void main(String[] args) {
//        double n;
//        double f;
//        double pi = 1;
//        for (int i = 15; i > 1; i--) {
//            f = 2;
//            for (int j = 1; j < i; j++) {
//                f = (2 + sqrt(f));
//            }
//            f = sqrt(f);
//            pi = pi * f / 2;
//        }
//        pi *= sqrt(2) / 2;
//        pi = 2 * pi;
//        System.out.println(pi);
//    }
    public static void main(String[] args) {
        double n = 200, i;
        double pi = 4;
        for (i = 3; i <= (n + 2); i += 2) {
            pi = pi * ((i - 1) / i) * ((i + 1) / i);
        }
        System.out.println(pi);

    }
}
