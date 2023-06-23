package myJavaPRJ.src.main.Practice;

public class Exam0623 {
    //객체 생성하고 변수에 접근하거나 메소드를 호출하는 것은 반드시 main메소드 안에서 돌아가야 함. psvm없으면 안 돌아감.
    //main메서드 --> 제일 먼저 실행되는 영역(프로그램이 시작되는 지점으로 프로그램의 흐름은 이 안에서 돌아가게 되어 있다.)
    public static void main(String[] args) {
        E0623 e = new E0623(); //객체 생성
        System.out.println(e.add(500, 350));
        //e.add(123456789L, 123456789L) 매개변수를 이렇게 넣으면 long 타입의 메소드를 호출함

    }
}

class E0623 {
    //같은 이름 다른 작업 --> 오버로딩
    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b)");
        return a + b;
    }
}
