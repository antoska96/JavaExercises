public class InfinityLoop {
    public static void main(String[] args) {
        int a=2;
        while(a != 1073741824){
            a = a * 2;
            System.out.println(a);
        }
    }
}
