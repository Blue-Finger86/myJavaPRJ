import java.util.Scanner;

class Ex1577_1 {
    public static void f(int a) {
        System.out.print(Math.abs(a));
    }
}
public class Ex1577 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        Ex1577_1.f(n);
    }
}
