import java.io.IOException; // IOException class를 import한다.(입력 예외 처리를 위해서)
import java.util.Scanner;
public class Problem_03 {
    public static void main(String[] args) throws IOException {  // throws IOException은 입력 오류 방지를 위한 문법
        int a, b;
        int result;
        char c;

        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 계산할 값을 입력하세요:");
        a = s.nextInt();
        System.out.print(" + - * / %:");
        c = (char)System.in.read(); // 연산자를 입력한다. 형변환인가? 내가 입력한 걸 읽는다? --> 뒤에서 보니까 문자 하나를 입력받을 때 사용하는 메소드래 System.in.read(); 이게
        System.out.print("두 번째 계산할 값을 입력하세요:");
        b = s.nextInt();

        if (c == '+') {
            result = a + b;
            System.out.println(result + "=" + a + "+" + b);
        } else if (c == '-') {
            result = a - b;
            System.out.println(result + "=" + a + "-" + b);
        } else if (c == '*') {
            result = a * b;
            System.out.println(result + "=" + a + "*" + b);
        } else if (c == '/') {
            if (b != 0) { // 입력한 값이 0이 아니라면
                result = a / b;
                System.out.println(result + "=" + a + "/" + b);
            } else { // 입력한 값이 0이라면 처리하지 말고 오류 메시지를 보여줘라
                System.out.println("0으로 나누면 안 됩니다.");
            }
        } else if (c == '%') {
            if (b != 0) { // 입력한 값이 0이 아니라면
                result = a % b;
                System.out.println(result + "=" + a + "%" + b);
            } else { // 입력한 값이 0이라면 처리하지 말고 오류 메시지를 보여줘라
                System.out.println("0으로 나누면 나머지 값이 안 됩니다.");
            }
        }
    }
}
