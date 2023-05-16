import java.util.Scanner;
//메소드 호출하기
class func7 {
    public static String f(int n) {
        return "love";
    }
}
public class Ex1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println(func7.f(n));
        }
    }
}
