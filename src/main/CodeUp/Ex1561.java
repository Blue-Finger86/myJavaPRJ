import java.util.Scanner;
//값을 비교하는 메소드를 호출하여 둘 중 더 큰 값을 출려하기
class func14 {
    public static int f(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
public class Ex1561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(func14.f(n, m));

    }
}
