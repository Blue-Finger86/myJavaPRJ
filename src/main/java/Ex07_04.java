import java.io.IOException;
import java.util.Scanner;
public class Ex07_04 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        while(true) {  // 변수가 안 들어감 그래서 값에 변화를 줄 수가 없음
            System.out.printf("계산할 첫번째 수를 입력 : ");
            a = s.nextInt();
            System.out.printf("계산할 두번째 수를 입력 : ");
            b = s.nextInt();
            System.out.printf("계산할 연산자를 입력하세요 : ");
            ch = (char)System.in.read();  // 예외를 발생시킬 수 있는 확률이 있다. 그래서 throws IOException 쓰는 것 혹시 예외 생기면 처리하라고

            switch (ch){
            case '+':
                System.out.printf("%d + %d = %d 입니다. \n", a, b, a+b); break; // case 구문에 꼭 있어야 하는 건 break; 케이스마다 다 들어가야 함
            case '-':
                System.out.printf("%d - %d = %d 입니다. \n", a, b, a-b); break;
            case '*':
                System.out.printf("%d * %d = %d 입니다. \n", a, b, a*b); break;
            case '/':
                System.out.printf("%d / %d = %d 입니다. \n", a, b, a/b); break;
            case '%':
                System.out.printf("%d %% %d = %d 입니다. \n", a, b, a%b); break;
            default:
                System.out.printf("연산자를 잘못 입력했습니다.\n");
            }
        }


    }
}
