import java.util.Scanner;

class Ex1540_1 {
    public static String f(int a) {
        if(a == 0) {
            return "zero";
        } else {
            return "non zero";
        }
    }
}
public class Ex1540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(Ex1540_1.f(n));

    }

}
