public class Ex02_01 { // 클래스의 범위(시작)
    public static void main(String[] args) { // 메인 메소드
        int a, b; //정수형 변수 세 개 선언
        int result;

        a = 100; // 정수형 변수 a에 100을 할당, b에는 50을 할당해서 초기화
        b = 50;

        result = a + b; // 정수형 변수 result에는 a와 b를 이용한 사칙연산 이후의 결과 값을 할당(대입)
//        System.out.printf("%d + %d = %d\n", a, b, result); // 화면에 위 식을 출력(사용자가 볼 수 있게 나타냄)
          System.out.println(a + "+" + b + "=" + result);

        result = a - b;
//        System.out.printf("%d - %d = %d\n", a, b, result);
          System.out.println(a + "-" + b + "=" + result);

        result = a * b;
//        System.out.printf("%d * %d = %d\n", a, b, result);
          System.out.println(a + "*" + b + "=" + result);

        result = a / b;
//        System.out.printf("%d / %d = %d\n", a, b, result);
          System.out.println(a + "/" + b + "=" + result);
    }
} // 클래스의 범위(끝)
