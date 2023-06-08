import java.util.Scanner;

public class Ex1092 {
    // 같은 날 동시에 가입한 3명의 방문 주기를 입력
    // 3명 모두가 함께 만나는 날 출력, 3명이 함께 방문하는 날 --> 최소공배수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //3명 각각의 방문 주기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = 0;    //계산할 때 사용할 변수
        int gcd = 0;    //두 수의 최대공약수 담을 변수
        int lcm = 0;    //세 명의 최소공배수 담을 변수
        int lcmf = 0;   //세 명의 최소공배수 담을 변수

        //1번 풀이 --> 정답
        lcmf = 1;
        while(lcmf%a!=0 || lcmf%b!=0 || lcmf%c!=0) {
            lcmf++;
        }


        //2번 풀이 --> 오답, 산술오류남
        //일단 두 명의 최소공배수부터 구하기
//        if(a < b) {
//            if( b % a != 0 ) {
//                tmp = b % a;
//                gcd = a % tmp;
//            }
//            lcm = (a*b)/gcd;  //두 명의 최소공배수
//        } else if( a % b != 0) {
//            tmp = a % b;
//            gcd = b % tmp;
//
//            lcm = (a*b)/gcd;  //두 명의 최소공배수
//        }
//
//
//        //둘의 최소공배수를 가지고 나머지 수와의 최대공약수 구하고 그 다음 최종적으로 셋의 최소공배수 구하기
//        if(lcm < c) {
//            if(c % lcm != 0) {
//                tmp = c % lcm;
//                lcmf = lcm % tmp;
//            }
//        } else if(lcm % c != 0) {
//            tmp = lcm % c;
//            lcmf = c % tmp;
//        }

        //3번째 풀이 --> 윤재님이 알려줌
        //1. 반복문 사용해서 (a % i) 가 0이고 (b % i)가 0일 때 최대공약수 변수에 i를 담는다.
        //2. 반복문이 끝날 때 최대공약수 변수가 갖고 있는 값이 두 수의 최대공약수
        //변수를 어떤 수로 나눠서 0이 나온다는 것은 그 어떤 수가 변수의 약수라는 뜻
        //두 수의 곱을 최대공약수로 나눈 값(첫 번째 값)과 나머지 수 하나를 1~2의 과정으로 반복문 돌림 --> 세 수의 최대공약수!
        //최대공약수를 세 수의 곱으로 나눔 --> 세 수의 최소공배수!


        System.out.print(lcmf);

    }
}
