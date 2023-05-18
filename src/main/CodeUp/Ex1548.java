import java.util.Scanner;
//메소드 호출하여 성적 출력하기
//메인 함수에서 값 입력, 입력한 값으로 성적 찾아주는 메소드 호출 후 값 출력

class func10 {
    public static char f(int n) {
        if (n >= 90) {
            return 'A';
        } else if (n >= 80) {
            return 'B';
        } else if (n >= 70) {
            return 'C';
        } else if (n >= 60) {
            return 'D';
        }
            return 'F';
    }
}

    public class Ex1548 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            System.out.println(func10.f(n));
        }
    }
