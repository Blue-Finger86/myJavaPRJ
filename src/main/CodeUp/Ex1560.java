import java.util.Scanner;

class Ex1560_1 {
    public static long f(long a, long b) {
        if(a < b) {
            return b - a;
        } else {
            return a - b;
        }
    }
}
public class Ex1560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.print(Ex1560_1.f(n, m));
    }
}
