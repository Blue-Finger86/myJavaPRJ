import java.util.Scanner;
//절대값 구하기(메소드 호출해서)

class func9 {
    public static long abs(long h) {  //호출할 메소드는 abs
        return Math.abs(h);           //호출한 곳으로 반환할 값은 절대값, Math.abs()사용하기
    }
}


public class Ex1549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();      //값을 입력하고

        System.out.println(func9.abs(n));  //메소드 호출해서 값 출력하기
    }
}
