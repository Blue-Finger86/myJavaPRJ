import java.util.Scanner;

//메소드 호출 사용하여 n까지의 합 리턴하기

class func12 {
    public static long f(long a) {
        long sum = 0;
        for(int i = 1; i <= a; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
public class Ex1555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.print(func12.f(n));
    }
}


//계속 오류나는 게 담아야 하는 값이 너무 커서였음. long으로 바꾸니까 해결됨.