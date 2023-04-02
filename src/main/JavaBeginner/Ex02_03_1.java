import java.util.Scanner;
public class Ex02_03_1 {
    public static void main(String[] args) {
        int a, b, c, result;

        Scanner s = new Scanner(System.in);
        System.out.print("첫 번째 값을 입력해주세요 : ");
        a = s.nextInt();
        System.out.print("두 번째 값을 입력해주세요 : ");
        b = s.nextInt();
        System.out.print("세 번째 값을 입력해주세요 : ");
        c = s.nextInt();

        result = a + b + c;
        System.out.println(a + "+" + b + "+" + c + "=" + result);

        result = a * b * c;
        System.out.println(a + "*" + b + "*" + c + "=" + result);
    }
}
