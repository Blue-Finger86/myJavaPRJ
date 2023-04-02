import java.util.Scanner;
public class Problem_02 {
    public static void main(String[] args) {
        int a, c;
        int result; // 계산 방식을 선택할 변수를 선언한다.
        int b;
        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 계산할 값을 입력해주세요: ");
        a = s.nextInt();
        System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈: ");
        b = s.nextInt(); // 해당하는 번호로 연산자를 선택한다.
        System.out.print("두 번째 계산할 값을 입력해주세요: ");
        c = s.nextInt();

        if(b == 1) {
            result = a + c;
            System.out.println(a + "+" + c + "=" + result);
        } else if(b == 2) {
            result = a - c;
            System.out.println(a + "-" + c + "=" + result);
        } else if(b == 3) {
            result = a * c;
            System.out.println(a + "*" + c + "=" + result);
        } else if(b == 4) {
            result = a / c;
            System.out.println(result + "=" + a + "/" + c); // 위 3개는 a 연산자 b = result 라서 순서 바꿔봄 result가 제일 앞에 오도록
        }


    }
}
