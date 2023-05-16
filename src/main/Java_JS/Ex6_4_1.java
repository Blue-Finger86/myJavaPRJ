//사칙연산을 하나의 클래스에 정의해놓고 그 클래스의 객체를 만들어서 사용할 것

class C0516 {
    //4개의 메소드(사칙연산)를 갖고 있는 클래스
    public static int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int gop(int a, int b) {
        return a * b;
    }

    public static int nanugi(int a, int b) {
        return a / b;
    }
}
public class Ex6_4_1 {
    //클래스의 객체를 생성하여 사칙연산을 하고 출력할 메인 클래스
    public static void main(String[] args) {
        C0516 c = new C0516(); //객체 생성

        System.out.println("두 수를 더한 값은 "+c.plus(5, 8)+" 입니다.");
        System.out.println("두 수를 뺀 값은 "+c.minus(16, 3)+" 입니다.");
        System.out.println("두 수를 곱한 값은 "+c.gop(7, 4)+" 입니다.");
        System.out.println("두 수를 나눈 값은 "+c.nanugi(100, 2)+" 입니다.");
    }

}
