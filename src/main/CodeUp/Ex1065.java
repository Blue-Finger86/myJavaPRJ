import java.util.Scanner;

public class Ex1065 {
    // 세 정수를 순서대로 입력, 적어도 1개는 짝수, 짝수만 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 정수 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 조건에 맞으면 출력해라
        if( a%2 == 0 ) {
            System.out.println(a);
        }
        if ( b%2 == 0) {
            System.out.println(b);
        }
        if ( c%2 == 0) {
            System.out.println(c);
        }
    }

}

// 정답!


