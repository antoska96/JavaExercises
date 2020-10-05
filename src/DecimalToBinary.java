public class DecimalToBinary {
    public static void main(String[] args) {

        int a = 110011;
        int b = 1;
        int c = 10 ;
        int x = 0;
        int o = 0;
        int e = 0;

        do {
         x = a % c;
           a = a / c;
           o = x * b;
           e = o + e;
            b *= 2;
        }
        while( a / c != 0);
        o = x * b;
        e = o + e;
        System.out.println(e);

    }
    }
