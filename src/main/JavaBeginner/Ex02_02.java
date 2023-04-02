import java.util.Scanner;
public class Ex02_02 {
    public static void main(String[] args) {
        int a, b, result;

        Scanner s = new Scanner(System.in); // 입력받기 위한 Scanner 클래스를 사용한다.
        a = s.nextInt(); // 키보드로 a에 들어갈 값을 입력받는다
        b = s.nextInt(); // 키보드로 b에 들어갈 값을 입력받는다

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
