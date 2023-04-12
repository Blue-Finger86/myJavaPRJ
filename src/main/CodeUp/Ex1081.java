import java.util.Scanner;

public class Ex1081 {
    // 주사위 2개 던져서 나오는 경우의 수 구하기(두 수가 한 세트)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력할 거니까 스캐너 써주고

        int n = sc.nextInt();   // 첫 번째 주사위의 면의 개수
        int m = sc.nextInt();   // 두 번째 주사위의 면의 개수

        for(int i = 1; i <= n; i++) {   // 주사위는 1부터 시작 ~ 면의 개수랑 같거나 작아질 때까지 1씩 커진다
            for(int j = 1; j <= m; j++ ) {   // 두 번째 주사위도 마찬가지
                System.out.printf("%d %d\n", i, j);  // 두 개의 주사위를 던졌을 때 모든 경우의 수 출력하기
            }
        }
    }
}

// 정답!