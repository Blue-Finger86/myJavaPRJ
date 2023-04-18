import java.util.Arrays;
import java.util.Scanner;

public class Qz0418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // 배열에 들어갈 값 입력받을 거니까 스캐너 선언

        int[] a = new int[5];                         // 5개 입력받는다고 했으니까 길이가 5인 배열 선언 및 생성

        for (int i = 0; i < a.length; i++) {          // 반복문을 배열의 길이만큼 돌릴 것이고,
            a[i] = sc.nextInt();                      // 내가 입력하는 값은 a[i]에 들어갈 것이다.
        }

        int tmp = 0;                                  // 값을 교환하기 위해서 필요한 빈 변수 생성

        // 큰 순서대로 정렬(순서 내림차순으로 바꿀 것)
        for (int i = 0; i < a.length; i++) {          // 0부터 시작해서 배열의 길이만큼 반복
            for (int j = i+1; j < a.length; j++) {    // i+1을 해야 앞 순서에 나왔던 i를 완전히 제외하고 돌릴 수 있음
                if (a[i] < a[j]) {                    // 앞순서가 뒷순서의 값보다 더 크다면
                    tmp = a[i];                       // 작은 값은 tmp가 받고
                    a[i] = a[j];                      // i가 둘 중 큰 값인 j값을 넘겨 받은 다음
                    a[j] = tmp;                       // 빈 j의 공간에는 tmp가 갖고 있던 작은 값이 들어간다.
                }
            }
        }

        System.out.print(Arrays.toString(a));         // 배열 출력하기
    }
}