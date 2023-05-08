import java.util.Scanner;

public class Ex1090 {
    // 시작 값(a), 등비의 값(r), 몇 번째인지 나타내는 정수(n)가 공백을 두고 입력될 때
    // n번째 수를 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        long[]k = new long[n];  //등비수열은 제대로 돌아가는데 10 10 10을 넣으면 int가 담지를 못 함

        //등비수열은 배열안에 순서대로 담고 n번째 수는 제일 마지막에 들어가는 수로 뽑아낼 것!
        k[0] = a;
        for(int i = 1; i < n; i++) {
                k[i] = k[i-1] * r;
        }

        //처음에 썼던 반복문
//        for(int i = 0; i < n; i++) {
//            k[i] = a;
//                if(i > 0) {
//                    k[i] = k[i-1] * r;
//                }
        System.out.print(k[n-1]);
    }
}
