public class Fibonacci_series {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        int n=10;
        System.out.println(" 1st tarm "+a + " second tarm "+b);
        for (int i = 2; i <n ; i++) {
            c=a+b;
            System.out.println(" "+ c);
            a=b;
            b=c;

        }
    }
}
