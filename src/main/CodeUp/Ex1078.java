import java.util.Scanner;

public class Ex1078 {
    public static void main(String[] args) {
        // 정수 1개 입력
        // 1부터 입력된 수까지 짝수의 합 출력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hap = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                hap = hap + i;
            }
        }
        System.out.println(hap);
    }
}

// 정답!
