import java.util.Scanner;
//메소드 호출하기

class func6 {
    public static String f(int a) {
        if(a == 0) {
            return "false";
        } else {
            return "true";
        }
        //딱 한 경우 빼고는 전부 true를 반환하게 해놨으니까 굳이 반환값 안 줘도 됨
    }
}

public class Ex1539 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print(func6.f(a));
    }
}
