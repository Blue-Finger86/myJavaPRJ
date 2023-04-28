import java.util.Scanner;

public class Ex1089 {
    // 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 공백을 두고 입력된다.
    // n번째 수를 출력한다.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int j = 0;

        for(int i = 0; i <= 100; i++) {
            j = a + (i*d);  // 초기값을 0으로 두고 식을 이렇게 짜야 첫 회에 시작값인 a만 들어갈 수 있음

            if( i == n-1 ) {
                System.out.print(j);
            }
        }
    }
}



// 와 정답!!!

// 자꾸 1번 더 더해진게 나와서 등호를 바꿔봤는데 작다로 하면 작을 때 전부, 크다로 하면 클 때 전부가 나옴(반복문이 끝날 때까지)
// 그래서 한번 덜 더하려면 뭘 해야 하나 하다가 n-1 넣어봤더니 됨!!