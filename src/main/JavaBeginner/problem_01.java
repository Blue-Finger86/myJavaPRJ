import java.util.Scanner;
public class problem_01 {
    public static void main(String[] args) {
        int a, b, c, d, result;

        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 계산할 값을 입력해주세요 : ");
        a = s.nextInt();

        System.out.print("두 번째 계산할 값을 입력해주세요 : ");
        b = s.nextInt();

        System.out.print("세 번째 계산할 값을 입력해주세요 : ");
        c = s.nextInt();

        System.out.print("네 번째 계산할 값을 입력해주세요 : ");
        d = s.nextInt();

        result = a + b + c + d; // 변수 a, b, c, d의 값을 모두 더해 변수 result에 넣는다.
        System.out.println( a + "+" + b + "+" + c + "+" + d + "=" + result); // 변수 a, b, c, d와 result를 화면에 출력한다.
    }
}
