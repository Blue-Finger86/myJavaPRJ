import java.util.Scanner;

//메소드 호출하기
class func5 {
    public static String f(int n) {
        if(n%2 == 0) {          //입력값이 짝수면
            return "even";
        }
        if(n%2 != 0) {          //입력값이 홀수면
            return "odd";
        }
            return null;
    }
}
public class Ex1538 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           //직접 입력해서 변수 값 설정한 다음
        System.out.print(func5.f(n));   //출력할 건데 메소드를 호출해서 나온 값을 출력할 것
    }
}
