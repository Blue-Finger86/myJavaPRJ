import java.util.Scanner;
//메소드 호출하기
class func8 {
    //public과 static이 둘 다 붙어야 다른 클래스에서 이 클래스를 호출할 수 있음
    //static이 붙으면 클래스 변수가 되어서 모든 인스턴스들이 변수를 공유하게 됨(공간 자체를 공유)
    public static String f(int n) {
        if(n > 0) {
            return "plus";
        } else if(n < 0) {
            return "minus";
        } else if(n == 0) {
            return "zero";
        }
        return null;
    }
}
public class Ex1546 {
    //누구나 사용가능한 클래스, 이 안에 선언한 변수는 지역변수, 반환값 없음, 함수의 이름은 main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.print(func8.f(n));  //객체를 생성하지 않고 직접 호출하는 것
    }
}
