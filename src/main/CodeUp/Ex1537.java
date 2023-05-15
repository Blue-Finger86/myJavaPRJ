import java.util.Scanner;

//메소드 호출하기
class func4 {
    public static String f(int a) {
        if(a == 1) {
            return "hello";
        }
        if(a == 2) {
            return "world";
        }
        return null;   //return값을 전부 조건문 안에 넣어버렸으니까 이렇게 반환 값 없다는 걸 써줘야 함
    }
}
public class Ex1537 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(func4.f(a));
    }
}
