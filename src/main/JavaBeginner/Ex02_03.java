import java.util.Scanner;
public class Ex02_03 {
    public static void main(String[] args) {
        int a, b, result;

        Scanner s = new Scanner(System.in);
        System.out.println("첫번째 입력할 값을 입력하세요 ==>"); //도움말을 화면에 출력한다.
        a = s.nextInt();
        System.out.println("두번째 입력할 값을 입력하세요 ==>");
        b = s.nextInt();

        result = a + b;
        System.out.println(a + "+" + b + "=" + result);

        result = a - b;
        System.out.println(a + "-" + b + "=" + result);

        result = a * b;
        System.out.println(a + "*" + b + "=" + result);

        result = a / b;
        System.out.println(a + "/" + b + "=" + result);

    }
}
