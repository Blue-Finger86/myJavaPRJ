import java.util.Scanner;

class Ex1556_1 {
    public static int f(int a) {
        int g = 1;

        for(int i = a; i > 0; i--) {
            g = g * i;
        }

        return g;
    }
}
public class Ex1556 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.print(Ex1556_1.f(n));
    }
}
