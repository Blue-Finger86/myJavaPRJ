class MyTest0516 {
    long a, b;

    //인스턴스 메서드
    long add() {
        return a+b;
    }
    long subtract() {
        return a-b;
    }
    long multiply() {
        return a * b;
    }
    long divide() {
        return a/b;
    }

    //클래스 메서드
    static long add(long a, long b) {
        return a+b;
    }
    static long subtract(long a, long b) {
        return a-b;
    }
    static long multiply(long a, long b) {
        return a*b;
    }
    static double divide(long a, long b) {
        return a/(double)b;
    }
}
public class Ex6_9_1 {
    public static void main(String[] args) {
        System.out.println(MyTest0516.add(200L, 100L));
        System.out.println(MyTest0516.subtract(200L, 100L));
        System.out.println(MyTest0516.multiply(200L, 100L));
        System.out.println(MyTest0516.divide(200L, 100L));

        //인스턴스 변수를 사용하기 위해서 객체 생성
        MyTest0516 mm = new MyTest0516();
        mm.a = 500L;
        mm.b = 700L;

        //인스턴스 메서드도 마찬가지로 호출하기 위해서는 객체를 생성해야 함
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
